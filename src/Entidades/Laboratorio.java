
package Entidades;

public class Laboratorio {
    private int cuit[] = new int[11];
    private String nomLaboratorio;
    private String pais;
    private String domComercial;

    public Laboratorio(String nomLaboratorio, String pais, String domComercial) {
        this.nomLaboratorio = nomLaboratorio;
        this.pais = pais;
        this.domComercial = domComercial;
    }

    public int[] getCuit() {
        return cuit;
    }

    public void setCuit(int[] cuit) {
        this.cuit = cuit;
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
    
    
}