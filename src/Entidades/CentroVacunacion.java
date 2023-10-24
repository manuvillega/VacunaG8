package Entidades;

public class CentroVacunacion {
        private int IDcentro;
        private String nombre;
        private String direccion;
        private String Provincia;
        private String Ciudad;

    public CentroVacunacion(int IDcentro, String nombre, String direccion, String Provincia, String Ciudad) {
        this.IDcentro = IDcentro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Provincia = Provincia;
        this.Ciudad = Ciudad;
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
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    
  
        
        
}
