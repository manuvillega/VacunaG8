package accesoADatos;

import Entidades.CentroVacunacion;
import Entidades.Ciudadano;
import Entidades.Vacuna;
import Entidades.citaVacunacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class citaVacunacionData {

    private Connection conexion;
    private CiudadanoData ciudadanoData;
    private VacunaData vacunaData;
    private CentroVacunacionData centroVacunacionData;

    public citaVacunacionData(Connection conexion) {
        this.conexion = conexion;
        ciudadanoData = new CiudadanoData(Conexion.getConexion());
        centroVacunacionData = new CentroVacunacionData(Conexion.getConexion());
        vacunaData = new VacunaData(Conexion.getConexion());
    }

    public void CrearCita(citaVacunacion cita) {
        String sql = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion, dosis)"
                + "VALUES(?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, cita.getPersona().getDNI());
            preparedStatement.setInt(2, cita.getMedida().getNroSerieDosis());
            preparedStatement.setString(3, cita.getFechaHoraCita());
            preparedStatement.setInt(4, cita.getCentroVacunacion().getIDcentro());
            preparedStatement.setInt(5, 1);
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita vacunacion creada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la cita de vacunacion");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para crear cita" + e);
        }
    }

    public citaVacunacion BuscarCitaPorCodCita(int codCita) {
        String sql = "SELECT  codCita, persona, codRefuerzo, fechaHoraCita, centroVacunacion FROM citavacunacion WHERE codCita=?";
        citaVacunacion cita = null;
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, codCita);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cita = new citaVacunacion();
                cita.setCodCita(codCita);
                int dni = rs.getInt("persona");
                Ciudadano ciudadano = ciudadanoData.buscarCiudadanoPorDNI(dni);
                cita.setPersona(ciudadano);
                cita.setFechaHoraCita(rs.getString("fechaHoraCita"));
                CentroVacunacion centro = centroVacunacionData.obtenerCentroVacunacionPorId(rs.getInt("centroVacunacion"));
                cita.setCentroVacunacion(centro);
                Vacuna vacuna = vacunaData.obtenerVacunaPorNroSerie(rs.getInt("codRefuerzo"));
                cita.setMedida(vacuna);
            } else {
                JOptionPane.showMessageDialog(null, "No existe cita con ese codigo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla citaVacunacion");
        }
        return cita;
    }

    public void ModificarCita(citaVacunacion cita) {
        String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE persona = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, cita.getFechaHoraCita());
            preparedStatement.setInt(2, cita.getPersona().getDNI());
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita vacunacion modificada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la cita de vacunacion");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita" + e);
        }
    }

    public void VacunaAplicada(int codCita) {
        String sql = "UPDATE citavacunacion SET fechaHoraColoca = ? WHERE codCita = ?";
        String fecha = LocalDateTime.now().toString();
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, fecha);
            preparedStatement.setInt(2, codCita);
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha establecido una nueva cita");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer una nueva cita de vacunacion");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita" + e);
        }

    }

    public LocalDateTime ProximaCita(citaVacunacion cita) {
        String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE persona = ?";
        LocalDateTime fecha = cita.getFechaHoraVacunacion();
        LocalDateTime fechaNueva = fecha.plusDays(42);
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

            Date nuevaDate = Date.valueOf(fechaNueva.toLocalDate());
            preparedStatement.setDate(1, nuevaDate);
            preparedStatement.setInt(2, cita.getPersona().getDNI());
            int exito = preparedStatement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se ha establecido una nueva cita");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo establecer una nueva cita de vacunacion");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita" + e);
        }
        return fechaNueva;
    }

    public LocalDateTime postergarCita() {
        String sql = "UPDATE citavacunacion SET fechaHoraCita = ? WHERE codCita = ?";
        String sql2 = "SELECT fechaHoraCita FROM citavacunacion WHERE codCita = ?";

        try {
            for (int i = 1; i <= 1000; i++) { // Cambié la condición y el contador
                try (PreparedStatement ps = conexion.prepareStatement(sql2)) {
                    ps.setInt(1, i);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        Date cita = rs.getDate("fechaHoraCita");
                        if (cita != null) {
                            LocalDateTime fechas = cita.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
                            LocalDateTime nuevasCitas = fechas.plusDays(14);
                            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                                Date nuevaDate = Date.valueOf(nuevasCitas.toLocalDate());
                                preparedStatement.setDate(1, nuevaDate);
                                preparedStatement.setInt(2, i);
                                int exito = preparedStatement.executeUpdate();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, "No fue posible conectar para modificar cita" + e);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No fue posible conectar para listar citas cumplidas" + ex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Se han postergado las citas");
        return null; // Si deseas devolver algo, debes definir un valor apropiado aquí
    }

    public List<citaVacunacion> listarCitasCumplidas() {
        List<citaVacunacion> cita = new ArrayList<citaVacunacion>();
        String sql = "SELECT * FROM citavacunacion WHERE dosis > 0";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(Integer.toString(rs.getInt("codRefuerzo")));
                citaVacunacion CitaVacunacion = new citaVacunacion();
                CitaVacunacion.setCodCita(rs.getInt("codCita"));
                int dni = rs.getInt("persona");
                Ciudadano persona = ciudadanoData.buscarCiudadanoPorDNI(dni);
                CitaVacunacion.setPersona(persona);
                CitaVacunacion.setFechaHoraCita(rs.getString("fechaHoraCita"));
                int idCentro = rs.getInt("centroVacunacion");
                CentroVacunacion centro = centroVacunacionData.obtenerCentroVacunacionPorId(idCentro);
                CitaVacunacion.setCentroVacunacion(centro);
                String fechaHoraColocaString = rs.getString("fechaHoraColoca");
                if (fechaHoraColocaString != null) {
                    DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                    LocalDateTime fechaHoraColoca = LocalDateTime.parse("2023-10-24 17:52:06", formatter);
                    CitaVacunacion.setFechaHoraVacunacion(fechaHoraColoca);
                }
                int cod = rs.getInt("codRefuerzo");
                System.out.println(cod);
                Vacuna vacuna = vacunaData.obtenerVacunaPorNroSerie(cod);
                CitaVacunacion.setMedida(vacuna);
                cita.add(CitaVacunacion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para listar citas cumplidas" + ex);
        }

        return cita;
    }

    public List<citaVacunacion> listarCitasNoCumplidas() {
        List<citaVacunacion> cita = new ArrayList<citaVacunacion>();
        String sql = "SELECT * FROM citavacunacion"
                + "WHERE dosis = 0";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                citaVacunacion CitaVacunacion = new citaVacunacion();
                CitaVacunacion.setCodCita(rs.getInt("codigoCita"));
                int dni = rs.getInt("persona");
                Ciudadano persona = ciudadanoData.buscarCiudadanoPorDNI(dni);
                CitaVacunacion.setPersona(persona);
                CitaVacunacion.setFechaHoraCita(rs.getString("fechaHoraCita"));
                int idCentro = rs.getInt("centroVacunacion");
                CentroVacunacion centro = centroVacunacionData.obtenerCentroVacunacionPorId(idCentro);
                CitaVacunacion.setCentroVacunacion(centro);
                Date date = rs.getDate("fechaHoraVacunacion");
                LocalDateTime fechaHoraVacunacion = date.toLocalDate().atStartOfDay();
                CitaVacunacion.setFechaHoraVacunacion(fechaHoraVacunacion);
                int cod = rs.getInt("vacuna");
                Vacuna vacuna = vacunaData.obtenerVacunaPorNroSerie(cod);
                CitaVacunacion.setMedida(vacuna);
                cita.add(CitaVacunacion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para listar citas no cumplidas" + ex);
        }

        return cita;
    }

    public void EliminarCita(int cod) {
        String sql = "DELETE FROM citavacunacion WHERE codCita = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cod);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cita eliminada exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible conectar para eleminar citas" + ex);
        }
    }
}
