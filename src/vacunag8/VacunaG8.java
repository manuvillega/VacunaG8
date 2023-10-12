package vacunag8;

/**
 *
 * @author Gonz@_
 */

import Entidades.Laboratorio;
import Utilidades.ValidarCUIT;
import java.sql.Connection;
import java.util.List;
import accesoADatos.Conexion;
import accesoADatos.LaboratorioData;
import javax.swing.JOptionPane;
import utilidades.ValidarCUIT;

public class VacunaG8 {

    public static void main(String[] args) {

        Connection conexion = Conexion.getConexion();

        /* ##################################################################################
                //##CIUDADANO##
                    // instancias
                 // pide y obtiene los datos ingresados para crear el Ciudadano /despiues se reutilizaràn en la GUI
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI:"));
        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        String email = JOptionPane.showInputDialog("Ingrese email:");
        String telefono = JOptionPane.showInputDialog("Ingrese teléfono:");
        String profesion = JOptionPane.showInputDialog("Ingrese profesión:");
        String patologia = JOptionPane.showInputDialog("Ingrese patología:");

        CiudadanoData ciudadanoData = new CiudadanoData(conexion);

        // crear el objeto Ciudadano con los datos ingresados
        Ciudadano ciudadano = new Ciudadano(dni, nombre, email, telefono, profesion);
        ciudadano.setPatologia(patologia);

        //metodo  insertar ciudadano
        ciudadanoData.insertarCiudadano(ciudadano);

        // Modificar un atributo-variable
        ciudadano.setPatologia("hepatitis");

        // Actualizar-Modificar ciudadano
        ciudadanoData.actualizarCiudadano(ciudadano);

        // Listar ciudadanos
        List<Ciudadano> ciudadanos = ciudadanoData.listarCiudadanos();
        System.out.println("Listar ciudadanos:");
        for (Ciudadano ciudad : ciudadanos) {
            System.out.println(ciudad);
        }

        // borrar- eliminar ciudadano
        ciudadanoData.borrarCiudadano(ciudadano);
    }
         ###################################################################################*/
        
        
                //##LABORATORIO##
        // instancias
         LaboratorioData laboratorioData = new LaboratorioData(conexion);

        // pide y obtiene los datos ingresados para crear el Laboratorio /despiues se reutilizaràn en la GUI
        String cuitCompleto = JOptionPane.showInputDialog("Ingrese el CUIT completo (11 dígitos):");
        String nombreLaboratorio = JOptionPane.showInputDialog("Ingrese el nombre del laboratorio:");
        String pais = JOptionPane.showInputDialog("Ingrese el país:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección:");

//        // validacion de apoyo
        if (!ValidarCUIT.esUnCUITValido(cuitCompleto)) {
            String cuitSinUltimoDigito = cuitCompleto.substring(0, 10);
            int digitoVerificadorCalculado = ValidarCUIT.calcularDigitoVerificador(cuitSinUltimoDigito);
            int option = JOptionPane.showConfirmDialog(
                    null,
                    "El CUIT ingresado es incorrecto. ¿Desea utilizar el CUIT corregido: " + cuitSinUltimoDigito + digitoVerificadorCalculado + "?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION
            );
            if (option == JOptionPane.YES_OPTION) {
                cuitCompleto = cuitSinUltimoDigito + digitoVerificadorCalculado;
            } else {
                // cierra sale el programa si el usaario no quiere el CUIT correcto 
                System.exit(0);
            }
        }

        // inserta-crear un nuevo laboratorio
        Laboratorio laboratorio = new Laboratorio(cuitCompleto, nombreLaboratorio, pais, direccion);
        laboratorioData.agregarLaboratorio(laboratorio);

        // obtiene un laboratorio por CUIT
        Laboratorio laboratorioObtenido = laboratorioData.obtenerLaboratorioPorCUIT(cuitCompleto);
        System.out.println("Laboratorio obtenido: " + laboratorioObtenido);

        // actualiza- modifica un laboratorio
        /*laboratorioObtenido.setNomLaboratorio("Laboratorio 4");
        laboratorioData.actualizarLaboratorio(laboratorioObtenido);*/

        // borra-eliminar un laboratorio
        //laboratorioData.eliminarLaboratorio("...");
        
        // listar laboratorios
        List<Laboratorio> laboratorios = laboratorioData.listarLaboratorios();
        System.out.println("Lista de laboratorios: " + laboratorios);

        // cerrar la conexión al finalizar
        Conexion.desconectar();
    }

}
