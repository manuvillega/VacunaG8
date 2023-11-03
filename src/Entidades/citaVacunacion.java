
package Entidades;

import java.time.LocalDateTime;

    public class citaVacunacion {
    private int codCita;
    private Ciudadano persona;
    private String fechaHoraCita;
    private CentroVacunacion centroVacunacion;
    private LocalDateTime fechaHoraVacunacion;
    private Vacuna medida;

    public citaVacunacion(int codCita, Ciudadano persona, String fechaHoraCita, CentroVacunacion centroVacunacion, LocalDateTime fechaHoraVacunacion, Vacuna medida) {
        this.codCita = codCita;
        this.persona = persona;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVacunacion = fechaHoraVacunacion;
        this.medida = medida;
    }

    public citaVacunacion() {
       
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
    }

    public String getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(String fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public CentroVacunacion getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(CentroVacunacion centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDateTime getFechaHoraVacunacion() {
        return fechaHoraVacunacion;
    }

    public void setFechaHoraVacunacion(LocalDateTime fechaHoraVacunacion) {
        this.fechaHoraVacunacion = fechaHoraVacunacion;
    }

    public Vacuna getMedida() {
        return medida;
    }

    public void setMedida(Vacuna medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "citaVacunacion{" + "codCita=" + codCita + ", persona=" + persona + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraVacunacion=" + fechaHoraVacunacion + ", medida=" + medida + '}';
    }

    
    
    
}
