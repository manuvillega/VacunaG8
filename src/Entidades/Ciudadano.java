package Entidades;

import java.sql.Connection;

/**
 *
 * @author Gonz@_
 */

public class Ciudadano {
        private int DNI;
        private String nombreCompleto;
        private String email;
        private String celular;
        private String patologia;
        private String ambitoLaboral;
        private String provincia;
        private String localidad;

    public Ciudadano() {}       
        
    public Ciudadano(int DNI, String nombreCompleto, String email, String celular, String ambitoLaboral, String provincia, String localidad) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia=null;
        this.ambitoLaboral = ambitoLaboral;
        this.provincia = provincia;
        this.localidad = localidad;
    }
public Ciudadano(int DNI, String nombreCompleto, String email, String celular, String patologia, String ambitoLaboral, String provincia, String localidad) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia=patologia;
        this.ambitoLaboral = ambitoLaboral;
        this.provincia = provincia;
        this.localidad = localidad;
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

   
    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbitoLaboral() {
        return ambitoLaboral;
    }

    public void setAmbitoLaboral(String ambitoLaboral) {
        this.ambitoLaboral = ambitoLaboral;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Ciudadano: " + "DNI: " + DNI + ", nombreCompleto: " + nombreCompleto + ", email: " + email + ", celular: " + celular + ", patologia: " + patologia + ", ambitoLaboral: " + ambitoLaboral + ", provincia: " + provincia + ", localidad: " + localidad;
    }

 }
        
        
