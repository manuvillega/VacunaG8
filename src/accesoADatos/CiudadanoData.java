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

 
    public void borrarCiudadano(Ciudadano ciudadano) {
        String sql = "DELETE FROM ciudadano WHERE DNI=? AND provincia=? AND localidad=?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, ciudadano.getDNI());
            preparedStatement.setString(2, ciudadano.getProvincia());
            preparedStatement.setString(3, ciudadano.getLocalidad());

            preparedStatement.executeUpdate();
            System.out.println("Ciudadano eliminado.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar ciudadano: " + e.getMessage());
        }
    }

    public List<Ciudadano> listarCiudadanos() {
        List<Ciudadano> ciudadanos = new ArrayList<>();
        String sql = "SELECT * FROM ciudadano";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int dni = resultSet.getInt("DNI");
                String nombreCompleto = resultSet.getString("nombreCompleto");
                String email = resultSet.getString("email");
                String celular = resultSet.getString("celular");
                String patologia = resultSet.getString("patologia");
                String ambitoLaboral = resultSet.getString("ambitoTrabajo");
<<<<<<< HEAD
                String provincia = resultSet.getString("provincia");
                String localidad = resultSet.getString("localidad");

                Ciudadano ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, provincia, localidad);
=======
                String ciudad = resultSet.getString("ciudad");

                Ciudadano ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, ciudad);
>>>>>>> cd51e726df23703111b2662cb470ddaa70ed4617
                ciudadanos.add(ciudadano);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ciudadanos: " + e.getMessage());
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
                String ambitoLaboral = resultSet.getString("ambitoLaboral");
<<<<<<< HEAD
                String provincia = resultSet.getString("provincia");  // Agregar provincia
                String localidad = resultSet.getString("localidad");  // Agregar localidad

                // Utilizar el constructor adecuado de Ciudadano que incluye provincia y localidad
                ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, provincia, localidad);
=======
                String ciudad = resultSet.getString("ciudad");

                ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral, ciudad);
>>>>>>> cd51e726df23703111b2662cb470ddaa70ed4617
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ciudadano por DNI: " + e.getMessage());
            e.printStackTrace();
        }
        return ciudadano;
    }
}
