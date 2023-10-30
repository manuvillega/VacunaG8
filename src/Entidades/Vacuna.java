package Entidades;

//import java.sql.Date;

import java.time.LocalDate;
import java.util.Date;



public class Vacuna {
    private int nroSerieDosis;
    private String marca;
    private double medida;
    private Date fechaCaduca;
    private boolean colocada = false;

    public Vacuna() {
    }

    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaCaduca) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
    }    
       
    public Vacuna(int nroSerieDosis, String marca, double medida, Date fechaCaduca, boolean colocada) {
        this.nroSerieDosis = nroSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
    }

    public Vacuna(int nroSerieDosis, String marca, String medida, java.sql.Date fechaCaduca, boolean colocada) {
        
    }

    public Vacuna(Integer numSerie, String marca, String medida, LocalDate fechaVenc, Boolean colocada) { //de VIstas1
        
    }

    public Vacuna(int nroSerieDosis, String marca, String medida, Date fechaCaduca, boolean colocada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNroSerieDosis() {
        return nroSerieDosis;
    }

    public void setNroSerieDosis(int nroSerieDosis) {
        this.nroSerieDosis = nroSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public Date getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Date fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "nroSerieDosis=" + nroSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + '}';
    }
    
    
}
