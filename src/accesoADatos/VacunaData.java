package accesoADatos;

import Entidades.Vacuna;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VacunaData {

    private Connection conexion;
    
    public VacunaData(Connection conexion){
        this.conexion=conexion;
    }

    
    public void cargarVacunas(Vacuna cargar){
        
        String sql = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1, cargar.getNroSerieDosis());
            ps.setString(2, cargar.getMarca());
            ps.setDouble(3, cargar.getMedida());
            ps.setDate(4, (Date) cargar.getFechaCaduca());            
            ps.setBoolean(5, cargar.isColocada());
            ps.executeUpdate();
            System.out.println("Se han cargado vacunas");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion con tabla vacuna 1");
        }  
        
    }
    public void modificarStockVacunas(Vacuna vacuna){
    
        String sql = "UPDATE vacuna SET marca=?, medida=?, fechaCaduca=?, colocada=? WHERE nroSerieDosis=?";
               
        try {  
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, vacuna.getMarca());
            ps.setDouble(2, vacuna.getMedida());
            ps.setDate(3, (Date) vacuna.getFechaCaduca());
            ps.setBoolean(4, vacuna.isColocada());
            ps.setInt(5, vacuna.getNroSerieDosis());
            ps.executeUpdate();
            System.out.println("se ha modificado vacuna");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion con tabla vacuna 2");
        }    
    }
    
    public void eliminarVacuna (Vacuna borrar){
        
        String sql = "UPDATE vacuna SET colocada = 0 WHERE nroSerieDosis = ? ";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, borrar.getNroSerieDosis());
            ps.executeUpdate();
            System.out.println("Se ha eliminado una vacuna");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion con tabla vacuna 3");
        }
    }

    public Vacuna obtenerVacunaPorNroSerie(int nroSerie){
        Vacuna vacuna = null;
        try{
            String sql = "SELECT * FROM vacuna WHERE nroSerieDosis = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, nroSerie);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                int nroSerieDosis = nroSerie;
                String marca = rs.getString("marca");
                double medida = rs.getDouble("medida");
                Date fechaCaduca = rs.getDate("fechaCaduca");
                boolean colocada = rs.getBoolean("colocada");
                vacuna = new Vacuna(nroSerieDosis, marca, medida, fechaCaduca);
            }
            ps.close();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Vacuna 4");
        }
        return vacuna;
    }
    
//    public Vacuna obtenerVacunaPorMarca(String marca){
//        Vacuna vacuna = null;
//        try{
//            String sql = "SELECT * FROM vacuna WHERE marca = ?";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ps.setString(1, marca);
//            ResultSet rs = ps.executeQuery();
//            
//            if(rs.next()){
//                int nroSerieDosis = nroSerie;
//                String marca = rs.getString("marca");
//                double medida = rs.getDouble("medida");
//                Date fechaCaduca = rs.getDate("fechaCaduca");
//                boolean colocada = rs.getBoolean("colocada");
//                vacuna = new Vacuna(nroSerieDosis, marca, medida, fechaCaduca);
//            }
//            ps.close();
//            
//        } catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Vacuna 4");
//        }
//        return vacuna;
//    }
}    
            
            
            