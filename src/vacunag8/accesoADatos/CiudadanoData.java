package vacunag8.accesoADatos;

import Entidades.Ciudadano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CiudadanoData {
 private Connection conexion;

    public CiudadanoData(Connection conexion) {
        this.conexion = conexion;
    }

    public void insertarCiudadano(Ciudadano ciudadano) {
        String sql = "INSERT INTO Ciudadano (DNI, nombreCompleto, email, celular, patologia, ambitoTrabajo) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, ciudadano.getDNI());
            preparedStatement.setString(2, ciudadano.getNombreCompleto());
            preparedStatement.setString(3, ciudadano.getEmail());
            preparedStatement.setString(4, ciudadano.getCelular());
            preparedStatement.setString(5, ciudadano.getPatologia());
            preparedStatement.setString(6, ciudadano.getAmbitoLaboral());

            preparedStatement.executeUpdate();
            System.out.println("Ciudadano insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar ciudadano: " + e.getMessage());
        }
        
    }    
    public void actualizarCiudadano(Ciudadano ciudadano) {
        String sql = "UPDATE ciudadano SET nombreCompleto=?, email=?, celular=?, patologia=?, ambitoTrabajo=? WHERE DNI=?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, ciudadano.getNombreCompleto());
            preparedStatement.setString(2, ciudadano.getEmail());
            preparedStatement.setString(3, ciudadano.getCelular());
            preparedStatement.setString(4, ciudadano.getPatologia());
            preparedStatement.setString(5, ciudadano.getAmbitoLaboral());
            preparedStatement.setInt(6, ciudadano.getDNI());

            preparedStatement.executeUpdate();
            System.out.println("Ciudadano actualizado!.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar ciudadano: " + e.getMessage());
        }
    }

    public void borrarCiudadano(Ciudadano ciudadano) {
        String sql = "DELETE FROM ciudadano WHERE DNI=?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, ciudadano.getDNI());
            preparedStatement.executeUpdate();
            System.out.println("Ciudadano eliminado!.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar ciudadano: " + e.getMessage());
        }
    }

    public List<Ciudadano> listarCiudadanos() {
        List<Ciudadano> ciudadanos = new ArrayList<>();
        String sql = "SELECT * FROM ciudadano";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int dni = resultSet.getInt("DNI");
                String nombreCompleto = resultSet.getString("nombreCompleto");
                String email = resultSet.getString("email");
                String celular = resultSet.getString("celular");
                String patologia = resultSet.getString("patologia");
                String ambitoLaboral = resultSet.getString("ambitoTrabajo");

                Ciudadano ciudadano = new Ciudadano(dni, nombreCompleto, email, celular, patologia, ambitoLaboral);
                ciudadanos.add(ciudadano);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ciudadanos: " + e.getMessage());
        }

        return ciudadanos;
    }

     //buscar Ciudadano en espera
    public void buscarCiudadano(Ciudadano ciudadano) {

    }
}
        
 
