
package vacunag8.accesoADatos;

import Entidades.citaVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class citaVacunacionData {
    private Connection conexion;

    public citaVacunacionData(Connection conexion) {
        this.conexion = conexion;
        
    }
    
    public void CrearCita(citaVacunacion cita){
        String sql = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion)"
                + "VALUES(?, ?, ?, ?, ?)";
        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
            preparedStatement.setInt(1, cita.getPersona().getDNI());
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, cita.getFechaHoraCita());
            preparedStatement.setString(4, cita.getCentroVacunacion().getNombre());
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita vacunacion creada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la cita de vacunacion");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No fue posible conectar para crear cita"+e);
        }
    }
    
    public void ModificarCita(citaVacunacion cita){
        String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE persona = ?";
        
        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
            preparedStatement.setString(1, cita.getFechaHoraCita());
            preparedStatement.setInt(2, cita.getPersona().getDNI());
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita vacunacion modificada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la cita de vacunacion");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita"+e);
        }
    }
    
    public void VacunaAplicada(citaVacunacion cita){
        String sql = "UPDATE citavacunacion SET fechaHoraColoca = ?, dosis = ? WHERE persona = ?";
        LocalDateTime fecha = cita.getFechaHoraVacunacion();       
        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
            Date nuevaDate = Date.valueOf(fecha.toLocalDate());
            preparedStatement.setDate(1, nuevaDate);
            preparedStatement.setInt(2, cita.getDosis().getNroSerieDosis());
            preparedStatement.setInt(3, cita.getPersona().getDNI());
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado la vacunacion");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la vacunacion");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita"+e);
        }
    }
    
   public LocalDateTime ProximaCita(citaVacunacion cita){
       String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE persona = ?";
       LocalDateTime fecha = cita.getFechaHoraVacunacion();
       LocalDateTime fechaNueva = fecha.plusDays(42);
       try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
           
            Date nuevaDate = Date.valueOf(fechaNueva.toLocalDate());
            preparedStatement.setDate(1, nuevaDate);
            preparedStatement.setInt(2, cita.getPersona().getDNI());
             int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha establecido una nueva cita");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer una nueva cita de vacunacion");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita"+e);
        }
       return fechaNueva;
   }
   
   public LocalDateTime postergarCita(citaVacunacion cita){
       String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE 1";
       LocalDateTime fechas = cita.getFechaHoraVacunacion();
       LocalDateTime citas = fechas.plusDays(14);
       try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
           Date nuevaDate = Date.valueOf(citas.toLocalDate());
           preparedStatement.setDate(1, nuevaDate);
           int exito = preparedStatement.executeUpdate();    
           if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se han postergado las citas 2 semanas");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo postergar las citas");
            }    
   } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita"+e);
   }
       return citas;
   }
    
   public List<citaVacunacion> listarCitasCumplidas(){
       List <citaVacunacion> cita = new ArrayList<citaVacunacion>();
       String sql = "SELECT * FROM citavacunacion"
                    + "WHERE dosis > 0";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               citaVacunacion CitaVacunacion = new citaVacunacion();
               
//               CitaVacunacion.setPersona(persona);
                
            }
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para listar citas cumplidas"+ex);
        }
      

        return null;
   }
}