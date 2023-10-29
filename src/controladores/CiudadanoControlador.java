package controladores;

import Entidades.Ciudadano;
import accesoADatos.CiudadanoData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vistas2.CiudadanoVista_2;

/**
 *
 * @author Gonz@_
 */
public class CiudadanoControlador implements ActionListener, MouseListener, KeyListener {

    private Ciudadano ciudadano;
    private CiudadanoData ciudadanoData;
    private CiudadanoVista_2 ciudadanoVista;

    boolean esPrioritario = false; //usar para validar
    DefaultTableModel model = new DefaultTableModel(); //tabla

    public CiudadanoControlador(Ciudadano ciudadano, CiudadanoData ciudadanoData, CiudadanoVista_2 ciudadanoVista) {
        this.ciudadano = ciudadano;
        this.ciudadanoData = ciudadanoData;
        this.ciudadanoVista = ciudadanoVista;

        //BOTONES CIUDADANO
        this.ciudadanoVista.btn_ciudadano_agregar.addActionListener(this);//boton agregar ciudadano a la escucha
        this.ciudadanoVista.btn_ciudadano_modificar.addActionListener(this);//botom modificar 

        //TABLA CIUDADANO
        this.ciudadanoVista.jTable_ciudadano_tabla.addMouseListener(this);//tabla ciudadano a la escucha de cuando se hace un click del moise en una fila con un ciudadano

        //BUSCADOR CIUDADANO
        this.ciudadanoVista.txt_ciudadano_buscar.addKeyListener(this);

    }

    //EVENTOS
    @Override
    public void actionPerformed(ActionEvent e) {
        //SI CLIC BOTON AGREGAR/NUEVO CIUDADANO
        if (e.getSource() == ciudadanoVista.btn_ciudadano_agregar) {
            // Verifica campos nulos o vacíos
            if (ciudadanoVista.txt_ciudadano_dni.getText().isEmpty()
                    || ciudadanoVista.txt_ciudadano_nombreCompleto.getText().isEmpty()
                    || ciudadanoVista.txt_ciudadano_email.getText().isEmpty()
                    || ciudadanoVista.txt_ciudadano_celular.getText().isEmpty()
                    || ciudadanoVista.txt_ciudadano_ambito_laboral1.getText().isEmpty()
                    || ciudadanoVista.jCB_Ciudadano_Provincias1.getSelectedItem() == null
                    || ciudadanoVista.jCB_Ciudadano_Ciudades1.getSelectedItem() == null) {

                // Verifica si el campo patologia no está vacío antes de asignarlo
                String patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
                if (!patologia.isEmpty()) {
                    ciudadano.setPatologia(patologia);
                }
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, complete todos los datos!.   ⚠", "", JOptionPane.ERROR_MESSAGE);
            } else {
                //  validaciones antes de agregar el ciudadano
                if (validarCampos()) {
                    //sino NO están los campos vacíos, modifica los valores con los que ingresa el usuario en los campos de texto
                    ciudadano.setDNI(Integer.parseInt(ciudadanoVista.txt_ciudadano_dni.getText().trim()));
                    ciudadano.setNombreCompleto(ciudadanoVista.txt_ciudadano_nombreCompleto.getText().trim());
                    ciudadano.setEmail(ciudadanoVista.txt_ciudadano_email.getText().trim());
                    ciudadano.setCelular(ciudadanoVista.txt_ciudadano_celular.getText().trim());

                    // Verifica si el campo patologia no está vacío antes de asignarlo
                    /* String patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
                if (!patologia.isEmpty()) {
                    ciudadano.setPatologia(patologia);
                }*/
                    ciudadano.setAmbitoLaboral(ciudadanoVista.txt_ciudadano_ambito_laboral1.getText().trim());
                    ciudadano.setProvincia((String) ciudadanoVista.jCB_Ciudadano_Provincias1.getSelectedItem());
                    ciudadano.setLocalidad((String) ciudadanoVista.jCB_Ciudadano_Ciudades1.getSelectedItem());

                    if (ciudadanoData.insertarCiudadano(ciudadano)) {

                        // LIMPIA LOS CAMPOS DESPUÉS DE LA INSERCIÓN
                        limpiarCampos();
                        listarTodosLosCiudadanos();
                        JOptionPane.showMessageDialog(null, "Ciudadano agregado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al agregar Ciudadano!.");
                    }
                }
            }
            //       //SI CLIC BOTON MODIFICAR CIUDADANO
        } else if (e.getSource() == ciudadanoVista.btn_ciudadano_modificar) {
            int DNI;
            try {
                DNI = Integer.parseInt(ciudadanoVista.txt_ciudadano_dni.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El documento debe ser solo números.");
                return;
            }
            // Aquí, no necesitas verificar la longitud del DNI

            Ciudadano ciudadano = ciudadanoData.buscarCiudadanoPorDNI(DNI);
            if (ciudadano != null) {
                DNI = Integer.parseInt(ciudadanoVista.txt_ciudadano_dni.getText());
                String nombre = ciudadanoVista.txt_ciudadano_nombreCompleto.getText();
                String email = ciudadanoVista.txt_ciudadano_email.getText();
                String celular = ciudadanoVista.txt_ciudadano_celular.getText();
                String patologia = ciudadanoVista.txt_ciudadano_patologia.getText();
                String ambito = ciudadanoVista.txt_ciudadano_ambito_laboral1.getText();
                String provincia = ciudadanoVista.jCB_Ciudadano_Provincias1.getSelectedItem().toString();
                String ciudad = ciudadanoVista.jCB_Ciudadano_Ciudades1.getSelectedItem().toString();
                ciudadano = new Ciudadano(DNI, nombre, email, celular, patologia, ambito, provincia, ciudad);
                if (nombre.isEmpty() || email.isEmpty() || celular.isEmpty() || ambito.isEmpty() || provincia.isEmpty() || ciudad.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, complete todos los datos.");
                } else if (!nombre.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$")) {
                    JOptionPane.showMessageDialog(null, "El nombre y apellido solo deben tener letras.");
                } else {
                    ciudadanoData.actualizarCiudadano(ciudadano);
                    limpiarCampos();
                   listarTodosLosCiudadanos();
                    JOptionPane.showMessageDialog(null, "Ciudadano actualizado");
                   
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe ciudadano con ese DNI");
            }

        }

    }

    //llena la tabla ciudadano con el metodo listarCiudadanos de ciudadanoData
    public void listarTodosLosCiudadanos() {
        List<Ciudadano> listaCiudadanos = ciudadanoData.listarCiudadanos(ciudadanoVista.txt_ciudadano_buscar.getText());
        model = (DefaultTableModel) ciudadanoVista.jTable_ciudadano_tabla.getModel();

        Object[] row = new Object[8];

        for (int i = 0; i < listaCiudadanos.size(); i++) {
            row[0] = listaCiudadanos.get(i).getDNI();
            row[1] = listaCiudadanos.get(i).getNombreCompleto();
            row[2] = listaCiudadanos.get(i).getEmail();
            row[3] = listaCiudadanos.get(i).getCelular();
            row[4] = listaCiudadanos.get(i).getPatologia();
            row[5] = listaCiudadanos.get(i).getAmbitoLaboral();
            row[6] = listaCiudadanos.get(i).getProvincia();
            row[7] = listaCiudadanos.get(i).getLocalidad();
            model.addRow(row);

        }
        ciudadanoVista.jTable_ciudadano_tabla.setModel(model); //establece los valores de las filas
    }

    //MOUSE
    @Override
    public void mouseClicked(MouseEvent e) {
        //SI SE HACE CLIC EN ALGUNA FILA CIUDADANO ME RELLENE LOS  CAMPOS DE TEXTO CO ESOS VALORES
        if (e.getSource() == ciudadanoVista.jTable_ciudadano_tabla) {
            int row = ciudadanoVista.jTable_ciudadano_tabla.getSelectedRow();
            if (row != -1) { // Verifica si se seleccionó una fila válida
                ciudadanoVista.txt_ciudadano_dni.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 0).toString());
                ciudadanoVista.txt_ciudadano_nombreCompleto.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 1).toString());
                ciudadanoVista.txt_ciudadano_email.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 2).toString());
                ciudadanoVista.txt_ciudadano_celular.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 3).toString());
                //ciudadanoVista.txt_ciudadano_patologia.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 4).toString());
                ciudadanoVista.txt_ciudadano_patologia.setText(obtenerValorCelda(row, 4));
                ciudadanoVista.txt_ciudadano_ambito_laboral1.setText(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 5).toString());

                // Obtiene los valores de provincia y ciudad 
                String provincia = ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 6).toString();
                String ciudad = ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 7).toString();

                // selecciona los elementos especificos en los JComboBox
                ciudadanoVista.jCB_Ciudadano_Provincias1.setSelectedItem(provincia);
                ciudadanoVista.jCB_Ciudadano_Ciudades1.setSelectedItem(ciudad);

                //INHABILITAR BOTONES UNA VEZ SELECCIONADA LAA FILA PARA EVITAR MODIFICACIONES
                ciudadanoVista.btn_ciudadano_agregar.setEnabled(false);
                //ciudadanoVista.btn_ciudadano_eliminar.setEnabled(false);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //KEYS
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //DETECTA  QUE TECLA  SE PRESIONÒ (de mis epocas de pseudo 'hacker' 🤣-_-)
        if (e.getSource() == ciudadanoVista.txt_ciudadano_buscar) {
            //LIMPIA LA TABLA
            limpiarTabla();
            //LISTA CIUDADANOS
            listarTodosLosCiudadanos();
        }

    }

    private boolean validarCampos() {
        String dni = ciudadanoVista.txt_ciudadano_dni.getText().trim();
        String nombreCompleto = ciudadanoVista.txt_ciudadano_nombreCompleto.getText().trim();
        String email = ciudadanoVista.txt_ciudadano_email.getText().trim();
        String celular = ciudadanoVista.txt_ciudadano_celular.getText().trim();
        String patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
        String ambitoLaboral = ciudadanoVista.txt_ciudadano_ambito_laboral1.getText().trim();

        // Validar DNI
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "DNI no válido. Debe contener solo 8  dígitos", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // validar nombre completo
        if (!nombreCompleto.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$")) {
            JOptionPane.showMessageDialog(null, "Nombre completo no válido. Debe contener solo letras y espacios.", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // validar email
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(null, "Dirección de correo electrónico no válida.", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // validar celular
        if (!celular.matches("\\d{1,15}")) {
            JOptionPane.showMessageDialog(null, "Número de celular no válido. Debe contener solo dígitos y tener entre 1 y 15 caracteres.", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // validar patología (permitir que sea nulo o diferente a vacia y cumpla las validaciones)
        patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
        if (patologia != null && !patologia.isEmpty() && !patologia.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\d\\s]+$")) {
            JOptionPane.showMessageDialog(null, "Patología no válida. Debe contener solo letras, números y espacios.", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar ámbito laboral
        if (!ambitoLaboral.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\d\\s]+$")) {
            JOptionPane.showMessageDialog(null, "Ámbito laboral no válido. Debe contener solo letras, números y espacios.", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // si todas las validaciones pasan, retorna verdadero
    }

    //METODO LIMPIAR TABLA
    public void limpiarTabla() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    //METODO LIMPIAR TABLA 2
    /*public void limpiarTabla() {
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.removeRow(0); // elimina la primera fila en cada iteración
        }
    }*/
    // Métod limpia los campos de la vista del ciudadano
    public  void limpiarCampos() {
        ciudadanoVista.txt_ciudadano_dni.setText("");
        ciudadanoVista.txt_ciudadano_nombreCompleto.setText("");
        ciudadanoVista.txt_ciudadano_email.setText("");
        ciudadanoVista.txt_ciudadano_celular.setText("");
        ciudadanoVista.txt_ciudadano_patologia.setText("");
        ciudadanoVista.txt_ciudadano_ambito_laboral1.setText("");
        ciudadanoVista.jCB_Ciudadano_Provincias1.setSelectedIndex(0); // vuelve al estado inicial
        ciudadanoVista.jCB_Ciudadano_Ciudades1.setSelectedIndex(0);
    }

    //  obtiene el valor de una celda en la tabla y manejar valores nulos
    private String obtenerValorCelda(int row, int column) {
        Object valor = ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, column);
        return (valor != null) ? valor.toString() : "";
    }

}
