
package Entidades;

import java.time.LocalDateTime;

public class citaVacunacion {
    private int codCita;
    private Ciudadano persona;
    private String fechaHoraCita;
    private CentroVacunacion centroVacunacion;
    private LocalDateTime fechaHoraVacunacion;
    private Vacuna dosis;

    public citaVacunacion(int codCita, Ciudadano persona, String fechaHoraCita, CentroVacunacion centroVacunacion, LocalDateTime fechaHoraVacunacion, Vacuna dosis) {
        this.codCita = codCita;
        this.persona = persona;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraVacunacion = fechaHoraVacunacion;
        this.dosis = dosis;
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

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }


    
    
}
