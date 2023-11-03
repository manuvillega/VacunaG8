package accesoADatos;

import Entidades.CentroVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.DropMode.INSERT;
import javax.swing.JOptionPane;

public class CentroVacunacionData {

    private Connection conexion = null;

    public CentroVacunacionData(Connection conexion) {
        this.conexion = conexion;
    }

    public void crearCentro(CentroVacunacion centro) {

        String sql = "INSERT INTO centrovacunacion(nombre, direccion, provincia, ciudad, estado) VALUES (?, ?, ?, ?, 1)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getDireccion());
            ps.setString(3, centro.getProvincia());
            ps.setString(4, centro.getCiudad());
            ps.executeUpdate();
            System.out.println("Se ha creado un Centro de Vacunacion");
            JOptionPane.showMessageDialog(null, "Se ha creado un Centro de Vacunacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }
    }

    public void modificarCentro(CentroVacunacion centro) {

        String sql = "UPDATE `centrovacunacion` SET `nombre`=?,`direccion`=?,`provincia`=?,`ciudad`=? WHERE IDcentro = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getDireccion());
            ps.setString(3, centro.getProvincia());
            ps.setString(4, centro.getCiudad());
            ps.setInt(5, centro.getIDcentro());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha modificado Centro de Vacunacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }
    }

    public void borrarCentro(int id) {

        String sql = "UPDATE centrovacunacion SET estado = 0 WHERE IDcentro = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha Eliminado Centro de Vacunacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }
    }

    public CentroVacunacion obtenerCentroVacunacionPorId(int id) {
        CentroVacunacion centroVacunacion = null;
        try {
            String sql = "SELECT * FROM centrovacunacion WHERE IDcentro = ? AND estado = 1";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int IDcentro = id;
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String provincia = rs.getString("provincia");
                String ciudad = rs.getString("ciudad");
                centroVacunacion = new CentroVacunacion(IDcentro, nombre, direccion, provincia, ciudad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla CentroVacunacion");
        }
        return centroVacunacion;
    }

    public List<CentroVacunacion> listarCentros() {
        List<CentroVacunacion> centros = new ArrayList<CentroVacunacion>();
        String sql = "SELECT * FROM centrovacunacion WHERE estado = 1";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CentroVacunacion centro = new CentroVacunacion();
                centro.setIDcentro(rs.getInt("IDcentro"));
                centro.setNombre(rs.getString("nombre"));
                centro.setDireccion(rs.getString("direccion"));
                centro.setProvincia(rs.getString("provincia"));
                centro.setCiudad(rs.getString("ciudad"));
                centros.add(centro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para listar citas no cumplidas: " + ex);
        }

        return centros;
    }

}
