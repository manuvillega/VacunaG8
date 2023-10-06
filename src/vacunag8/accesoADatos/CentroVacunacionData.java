package vacunag8.accesoADatos;

import Entidades.CentroVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        
}
    
    
    
    

