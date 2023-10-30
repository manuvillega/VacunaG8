package accesoADatos;

/**
 *
 * @author Gonz@_
 */
import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CiudadanoData {

    private Connection conexion;

    public CiudadanoData(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean insertarCiudadano(Ciudadano ciudadano) {
        String sql = "INSERT INTO ciudadano (DNI, nombreCompleto, email, celular, patologia, ambitoTrabajo, provincia, localidad) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, ciudadano.getDNI());
            preparedStatement.setString(2, ciudadano.getNombreCompleto());
            preparedStatement.setString(3, ciudadano.getEmail());
            preparedStatement.setString(4, ciudadano.getCelular());
            preparedStatement.setString(5, ciudadano.getPatologia());
            preparedStatement.setString(6, ciudadano.getAmbitoLaboral());
            preparedStatement.setString(7, ciudadano.getProvincia());
            preparedStatement.setString(8, ciudadano.getLocalidad());

            int rowCount = preparedStatement.executeUpdate();
            System.out.println("ciudadano insertado correctamente.");

            return rowCount > 0; // devuelve veradader si se insertó al menos una fila, sino falsso
        } catch (SQLException e) {
            System.err.println("Error al insertar ciudadano: " + e.getMessage());
            return false; // en caso de error, devuelve falso.
        }
    }

    public boolean actualizarCiudadano(Ciudadano ciudadano) {
        String sql = "UPDATE ciudadano SET nombreCompleto=?, email=?, celular=?, patologia=?, ambitoTrabajo=?, provincia=?, localidad=? "
                + "WHERE DNI=?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            preparedStatement.setString(1, ciudadano.getNombreCompleto());
            preparedStatement.setString(2, ciudadano.getEmail());
            preparedStatement.setString(3, ciudadano.getCelular());
            preparedStatement.setString(4, ciudadano.getPatologia());
            preparedStatement.setString(5, ciudadano.getAmbitoLaboral());
            preparedStatement.setString(6, ciudadano.getProvincia());
            preparedStatement.setString(7, ciudadano.getLocalidad());
            preparedStatement.setInt(8, ciudadano.getDNI());

            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Ciudadano actualizado correctamente.");

            return rowCount > 0;
        } catch (SQLException e) {
            System.err.println("Error al modificar ciudadano: " + e.getMessage());
            return false; // en caso de error, devuelve falso.
        }
    }

    public boolean borrarCiudadano(int DNI) {

        String sql = "DELETE FROM ciudadano WHERE DNI = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, DNI);
            int rowCount = preparedStatement.executeUpdate();

            if (rowCount > 0) {
                System.out.println("Ciudadano eliminado correctamente.");
                return true;
            } else {
                System.out.println("No se encontró un ciudadano con DNI " + DNI + " para eliminar.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar ciudadano: " + e.getMessage());
            return false;
        }
    }

public List<Ciudadano> listarCiudadanos(String valor) {
        List<Ciudadano> ciudadanos = new ArrayList<>();
        String sql = "SELECT * FROM ciudadano";
        String sql_buscarCiudadano = "SELECT * FROM ciudadano WHERE DNI LIKE ?";

        try {
            if (valor != null && !valor.isEmpty()) {
                try (PreparedStatement preparedStatement = conexion.prepareStatement(sql_buscarCiudadano)) {
                    preparedStatement.setString(1, "%" + valor + "%");
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            int dni = resultSet.getInt("DNI");
                            String nombreCompleto = resultSet.getString("nombreCompleto");
                            String email = resultSet.getString("email");
                            String celular = resultSet.getString("celular");
                            String patologia = resultSet.getString("patologia");
                            String ambitoLaboral = resultSet.getString("ambitoTrabajo");
                            String provincia = resultSet.getString("provincia");
                            String localidad = resultSet.getString("localidad");

                            Ciudadano ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, provincia, localidad);
                            ciudadanos.add(ciudadano);
                        }
                    }
                } catch (SQLException e) {
                    throw new SQLException("Error al buscar ciudadanos: " + e.getMessage());
                }
            } else {
                try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            int dni = resultSet.getInt("DNI");
                            String nombreCompleto = resultSet.getString("nombreCompleto");
                            String email = resultSet.getString("email");
                            String celular = resultSet.getString("celular");
                            String patologia = resultSet.getString("patologia");
                            String ambitoLaboral = resultSet.getString("ambitoTrabajo");
                            String provincia = resultSet.getString("provincia");
                            String localidad = resultSet.getString("localidad");

                            Ciudadano ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, provincia, localidad);
                            ciudadanos.add(ciudadano);
                        }
                    }
                } catch (SQLException e) {
                    throw new SQLException("Error al obtener ciudadanos: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return ciudadanos;
    }

    public Ciudadano buscarCiudadanoPorDNI(int dni) {
        String query = "SELECT * FROM ciudadano WHERE DNI = ?";
        Ciudadano ciudadano = null;

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, dni);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nombreCompleto = resultSet.getString("nombreCompleto");
                String email = resultSet.getString("email");
                String celular = resultSet.getString("celular");
                String patologia = resultSet.getString("patologia");
                String ambitoLaboral = resultSet.getString("ambitoTrabajo");
                String provincia = resultSet.getString("provincia");  // Agregar provincia
                String localidad = resultSet.getString("localidad");  // Agregar localidad

                // Utilizar el constructor adecuado de Ciudadano que incluye provincia y localidad
                ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, provincia, localidad);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ciudadano por DNI: " + e.getMessage());
            e.printStackTrace();
        }
        return ciudadano;
    }
}
