package accesoADatos;

/**
 *
 * @author Gonz@_
 */

import Entidades.Laboratorio;
import Utilidades.ValidarCUIT;
import utilidades.ValidarCUIT;  //Mi paquete es este, No el de arriba 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class LaboratorioData {

    private Connection conexion;

    public LaboratorioData(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarLaboratorio(Laboratorio laboratorio) {
    // Valida el CUIT antes de agregarlo a la base de datos
    String cuit = laboratorio.getCuit();  // obtiene el CUIT
    System.out.println("CUIT antes de validación: " + cuit);
    if (!ValidarCUIT.esUnCUITValido(cuit)) {
        throw new IllegalArgumentException("El CUIT no es válido.");
    }

        String query = "INSERT INTO laboratorio (CUIT, nomLaboratorio, pais, domComercial) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, laboratorio.getCuit());
            statement.setString(2, laboratorio.getNomLaboratorio());
            statement.setString(3, laboratorio.getPais());
            statement.setString(4, laboratorio.getDomComercial());

            statement.executeUpdate();
            System.out.println("Laboratorio agregado");
        } catch (SQLException e) {
            System.err.println("Error al insertar laboratorio: " + e.getMessage());
            e.printStackTrace();
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
        String query = "UPDATE laboratorio SET nomLaboratorio = ?, pais = ?, domComercial = ? WHERE CUIT = ?";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, laboratorio.getNomLaboratorio());
            statement.setString(2, laboratorio.getPais());
            statement.setString(3, laboratorio.getDomComercial());
            statement.setString(4, laboratorio.getCuit());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al actualizar laboratorio: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void eliminarLaboratorio(String cuit) {
        String query = "DELETE FROM laboratorio WHERE CUIT = ?";

        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, cuit);
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
