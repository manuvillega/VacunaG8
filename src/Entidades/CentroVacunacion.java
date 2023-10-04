package Entidades;

public class CentroVacunacion {
        private int IDcentro;
        private String nombre;
        private String direccion;

    public CentroVacunacion(int IDcentro, String nombre, String direccion) {
        this.IDcentro = IDcentro;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getIDcentro() {
        return IDcentro;
    }

    public void setIDcentro(int IDcentro) {
        this.IDcentro = IDcentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
        
}
