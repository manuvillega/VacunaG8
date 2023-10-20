package Entidades;

public class CentroVacunacion {
        private int IDcentro;
        private String nombre;
        private String direccion;
        private String provincia;
        private String localidad;

    public CentroVacunacion(int IDcentro, String nombre, String direccion) {
        this.IDcentro = IDcentro;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public CentroVacunacion(int IDcentro, String nombre, String direccion, String provincia, String localidad) {
        this.IDcentro = IDcentro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.provincia = provincia;
        this.localidad = localidad;
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
        return "CentroVacunacion{" + "IDcentro=" + IDcentro + ", nombre=" + nombre + ", direccion=" + direccion + ", provincia=" + provincia + ", localidad=" + localidad + '}';
    }
       
        
}
