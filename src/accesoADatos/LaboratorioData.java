package accesoADatos;

/**
 *
 * @author Gonz@_
 */
import Entidades.Laboratorio;
import utilidades.ValidarCUIT;  //Mi paquete es este, No el de arriba 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LaboratorioData {

    private Connection conexion;

    public LaboratorioData(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarLaboratorio(Laboratorio laboratorio) {
        String query = "INSERT INTO laboratorio (CUIT, nomLaboratorio, pais, domComercial) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, laboratorio.getCuit());
            statement.setString(2, laboratorio.getNomLaboratorio());
            statement.setString(3, laboratorio.getPais());
            statement.setString(4, laboratorio.getDomComercial());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idLaboratorio = generatedKeys.getInt(1);
                    laboratorio.setIdLaboratorio(idLaboratorio);
                    System.out.println("Laboratorio agregado con ID: " + idLaboratorio);
                    JOptionPane.showMessageDialog(null, "Laboratorio agregado correctamente.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar laboratorio: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar laboratorio.", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Laboratorio obtenerLaboratorioPorCUIT(String cuit) {
        String query = "SELECT * FROM laboratorio WHERE CUIT = ?";
        Laboratorio laboratorio = null;

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, cuit);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int idLaboratorio = resultSet.getInt("idLaboratorio");
                String nomLaboratorio = resultSet.getString("nomLaboratorio");
                String pais = resultSet.getString("pais");
                String domComercial = resultSet.getString("domComercial");

                laboratorio = new Laboratorio(idLaboratorio, cuit, nomLaboratorio, pais, domComercial);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener laboratorio: " + e.getMessage());
            e.printStackTrace();
        }
        return laboratorio;
    }

    public void actualizarLaboratorio(Laboratorio laboratorio) {
        String query = "UPDATE laboratorio SET CUIT = ?, nomLaboratorio = ?, pais = ?, domComercial = ? WHERE idLaboratorio = ?";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, laboratorio.getCuit());
            statement.setString(2, laboratorio.getNomLaboratorio());
            statement.setString(3, laboratorio.getPais());
            statement.setString(4, laboratorio.getDomComercial());
            statement.setInt(5, laboratorio.getIdLaboratorio());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar laboratorio: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void eliminarLaboratorio(int idLaboratorio) {
        String query = "DELETE FROM laboratorio WHERE idLaboratorio = ?";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, idLaboratorio);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar laboratorio: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Laboratorio> listarLaboratorios() {
        List<Laboratorio> laboratorios = new ArrayList<>();
        String query = "SELECT * FROM laboratorio";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idLaboratorio = resultSet.getInt("idLaboratorio");
                String cuit = resultSet.getString("CUIT");
                String nomLaboratorio = resultSet.getString("nomLaboratorio");
                String pais = resultSet.getString("pais");
                String domComercial = resultSet.getString("domComercial");

                Laboratorio laboratorio = new Laboratorio(idLaboratorio, cuit, nomLaboratorio, pais, domComercial);
                laboratorios.add(laboratorio);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar laboratorios: " + e.getMessage());
            e.printStackTrace();
        }

        return laboratorios;
    }

}
