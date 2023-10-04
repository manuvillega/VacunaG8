
package Entidades;

public class Ciudadano {
        private int DNI;
        private String nombreCompleto;
        private String email;
        private String celular;
        private String patologia;
        private String ambitoLaboral;

    public Ciudadano(int DNI, String nombreCompleto, String email, String celular, String ambitoLaboral) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia=null;
        this.ambitoLaboral = ambitoLaboral;
    }
public Ciudadano(int DNI, String nombreCompleto, String email, String celular, String patologia, String ambitoLaboral) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.celular = celular;
        this.patologia=patologia;
        this.ambitoLaboral = ambitoLaboral;
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

    @Override
    public String toString() {
        return "Ciudadano: " + "DNI: " + DNI + ", nombreCompleto: " + nombreCompleto + ", email: " + email + ", celular: " + celular + ", patologia: " + patologia + ", ambitoLaboral: " + ambitoLaboral;
    }
        
        
}
