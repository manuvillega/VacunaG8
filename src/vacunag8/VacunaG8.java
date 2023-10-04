package vacunag8;

import Entidades.Ciudadano;
import java.sql.Connection;
import vacunag8.accesoADatos.CiudadanoData;
import vacunag8.accesoADatos.Conexion;


public class VacunaG8 {


    public static void main(String[] args) {

        Connection conexion = Conexion.getConexion();
        
        CiudadanoData ciudadanoData = new CiudadanoData(conexion);

        Ciudadano ciudadano1 = new Ciudadano (23456177,"Juan Perez", "JPerez@gmail.com","3578882228", "asma", "Policia");
        
//        ciudadanoData.insertarCiudadano(ciudadano1);

        
        ciudadano1.setPatologia("hepatitis");
        ciudadanoData.actualizarCiudadano(ciudadano1);
        
    }
    
}



       
        