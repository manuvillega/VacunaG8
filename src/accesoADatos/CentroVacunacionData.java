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

    private Connection conexion;
    public CentroVacunacionData(Connection conexion){
        this.conexion = conexion;
    }
    
    public void crearCentro(CentroVacunacion centro){
        
        String sql = "INSERT INTO centrovacunacion(nombre, direccion) VALUES (?, ?, ?)";
        
        try {PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getDireccion()); 
            ps.executeUpdate();
            System.out.println("Se ha creado un Centro de Vacunacion");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }       
    } 
    
    public void modificarCentro(CentroVacunacion centro){
        
        String sql = "UPDATE centrovacunacion SET nombre='?', direccion='?'"; 
        
        try {PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getDireccion()); 
            ps.executeUpdate();
            System.out.println("Se ha modificado Centro de Vacunacion");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }        
    }
    
    public void borrarCentro(CentroVacunacion centro){
        
        String sql = "DELETE FROM centrovacunacion WHERE nombre=?, direccion=?";
        
        try {PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, centro.getNombre());
            ps.setString(2, centro.getDireccion());
            ps.executeUpdate();
            System.out.println("Se ha Eliminado Centro de Vacunacion");          
                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no fue posible conectar para crear Centro");
        }
    }
    
    public CentroVacunacion obtenerCentroVacunacionPorId(int id){
        CentroVacunacion centroVacunacion = null;
        try{
            String sql = "SELECT * FROM centrovacunacion WHERE IDcentro = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                int IDcentro = id;
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                centroVacunacion = new CentroVacunacion(IDcentro, nombre, direccion);            
            }
            ps.close();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla CentroVacunacion");
        }
        return centroVacunacion;
    }
    
    //metodo para hospiales cercanos
    public List<CentroVacunacion> obtenerHospitalesPorProvinciaYLocalidad(String provincia, String localidad) {
    List<CentroVacunacion> hospitales = new ArrayList<>();
    String sql = "SELECT * FROM centrovacunacion WHERE provincia=? AND localidad=?";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
        preparedStatement.setString(1, provincia);
        preparedStatement.setString(2, localidad);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int IDcentro = resultSet.getInt("IDcentro");
            String nombre = resultSet.getString("nombre");
            String direccion = resultSet.getString("direccion");
            // Obtén otros datos según tu estructura de la tabla CentroVacunacion

            CentroVacunacion hospital = new CentroVacunacion(IDcentro, nombre, direccion, provincia, localidad);
            hospitales.add(hospital);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "error al obtener datos!");
    }

    return hospitales;
}

        
}
    
    
    
    

