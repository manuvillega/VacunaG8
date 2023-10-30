package Entidades;

/**
 *
 * @author Gonz@_
 */

import utilidades.ValidarCUIT;   //Este es mipaquete, No el de arriba!

public class Laboratorio {

    private int idLaboratorio;
    private String cuit;
    private String nomLaboratorio;
    private String pais;
    private String domComercial;

    public Laboratorio() {
    }
    
    public Laboratorio(String cuit, String nomLaboratorio, String pais, String domComercial) {
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.domComercial = domComercial;
    }

    public Laboratorio(int idLaboratorio, String cuit, String nomLaboratorio, String pais, String domComercial) {
        this.idLaboratorio = idLaboratorio;
        this.cuit = cuit;
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.domComercial = domComercial;
        //setCuit(cuit);  
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getCuit() {
        return cuit;
    }

    //  validación del CUIT
    public boolean setCuit(String cuit) {
        if (cuit != null && ValidarCUIT.esUnCUITValido(cuit)) {
            this.cuit = cuit;
            return true;
        } else {
            return false;
        }
    }

    public String getNomLaboratorio() {
        return nomLaboratorio;
    }

    public void setNomLaboratorio(String nomLaboratorio) {
        this.nomLaboratorio = nomLaboratorio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomComercial() {
        return domComercial;
    }

    public void setDomComercial(String domComercial) {
        this.domComercial = domComercial;
    }

    @Override
    public String toString() {
        return "Laboratorio: \nidLaboratorio: " + idLaboratorio + ", cuit: " + cuit + ", nomLaboratorio: " + nomLaboratorio + ", pais: " + pais + ", domComercial: " + domComercial;
    }
}
