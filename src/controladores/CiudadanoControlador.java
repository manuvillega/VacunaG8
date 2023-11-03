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
        this.ciudadano = ciudadano != null ? ciudadano : new Ciudadano();
        this.ciudadanoData = ciudadanoData;
        this.ciudadanoVista = ciudadanoVista;

        //BOTONES CIUDADANO
        this.ciudadanoVista.btn_ciudadano_agregar.addActionListener(this);//boton agregar ciudadano a la escucha
        this.ciudadanoVista.btn_ciudadano_modificar.addActionListener(this);//botom modificar 
        this.ciudadanoVista.btn_ciudadano_eliminar.addActionListener(this);//boton eliminar

        //TABLA CIUDADANO
        this.ciudadanoVista.jTable_ciudadano_tabla.addMouseListener(this);//tabla ciudadano a la escucha de cuando se hace un click del moise en una fila con un ciudadano

        //BUSCADOR CIUDADANO
        this.ciudadanoVista.txt_ciudadano_buscar.addKeyListener(this);

    }

    //EVENTOS
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ciudadanoVista.btn_ciudadano_agregar) {
            String dni = ciudadanoVista.txt_ciudadano_dni.getText().trim();
            String nombreCompleto = ciudadanoVista.txt_ciudadano_nombreCompleto.getText().trim();
            String email = ciudadanoVista.txt_ciudadano_email.getText().trim();
            String celular = ciudadanoVista.txt_ciudadano_celular.getText().trim();
            String patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
            String ambitoLaboral = ciudadanoVista.txt_ciudadano_ambito_laboral1.getText().trim();

            if (dni.isEmpty() || nombreCompleto.isEmpty() || email.isEmpty() || celular.isEmpty() || ambitoLaboral.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios. Por favor, complete todos los datos.", "", JOptionPane.ERROR_MESSAGE);
            } else if (!dni.isEmpty() && !dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(null, "DNI no válido. Debe contener solo 8 dígitos.", "", JOptionPane.ERROR_MESSAGE);
            } else if (!nombreCompleto.isEmpty() && !nombreCompleto.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\s]+$")) {
                JOptionPane.showMessageDialog(null, "Nombre completo no válido. Debe contener solo letras y espacios.", "", JOptionPane.ERROR_MESSAGE);
            } else if (!email.isEmpty() && !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                JOptionPane.showMessageDialog(null, "Dirección de correo electrónico no válida.", "", JOptionPane.ERROR_MESSAGE);
            } else if (!celular.isEmpty() && !celular.matches("\\d{1,15}")) {
                JOptionPane.showMessageDialog(null, "Número de celular no válido. Debe contener solo dígitos y tener entre 1 y 15 caracteres.", "", JOptionPane.ERROR_MESSAGE);
            } else if (!ambitoLaboral.isEmpty() && !ambitoLaboral.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\d\\s]+$")) {
                JOptionPane.showMessageDialog(null, "Ámbito laboral no válido. Debe contener solo letras, números y espacios.", "", JOptionPane.ERROR_MESSAGE);
            } else {
                // Si pasa todas las validaciones, procede a agregar el ciudadano
                ciudadano.setDNI(Integer.parseInt(dni));
                ciudadano.setNombreCompleto(nombreCompleto);
                ciudadano.setEmail(email);
                ciudadano.setCelular(celular);
                ciudadano.setPatologia(patologia);
                ciudadano.setAmbitoLaboral(ambitoLaboral);
                ciudadano.setProvincia((String) ciudadanoVista.jCB_Ciudadano_Provincias1.getSelectedItem());
                ciudadano.setLocalidad((String) ciudadanoVista.jCB_Ciudadano_Ciudades1.getSelectedItem());

                if (ciudadanoData.insertarCiudadano(ciudadano)) {
                    limpiarCampos();
                    listarTodosLosCiudadanos();
                    JOptionPane.showMessageDialog(null, "Ciudadano agregado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar Ciudadano.");
                }
            }
        } else if (e.getSource() == ciudadanoVista.btn_ciudadano_modificar) {
            String dni = ciudadanoVista.txt_ciudadano_dni.getText().trim();
            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Seleccione una fila.");
            } else if (!dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(null, "DNI no válido. Debe contener solo 8 dígitos.", "", JOptionPane.ERROR_MESSAGE);
            } else {
                // Si pasa la validación, procede a modificar el ciudadano
                String patologia = ciudadanoVista.txt_ciudadano_patologia.getText().trim();
                String ambitoLaboral = ciudadanoVista.txt_ciudadano_ambito_laboral1.getText().trim();
                if (!patologia.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\d\\s]*$")) {
                    JOptionPane.showMessageDialog(null, "Patología no válida. Debe contener solo letras, números y espacios.", "", JOptionPane.ERROR_MESSAGE);
                } else if (!ambitoLaboral.matches("^[a-zA-ZñÑáÁéÉíÍóÓúÚ\\d\\s]*$")) {
                    JOptionPane.showMessageDialog(null, "Ámbito laboral no válido. Debe contener solo letras, números y espacios.", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    ciudadano.setDNI(Integer.parseInt(dni));
                    ciudadano.setPatologia(patologia);
                    ciudadano.setAmbitoLaboral(ambitoLaboral);

                    if (ciudadanoData.actualizarCiudadano(ciudadano)) {
                        limpiarTabla();
                        limpiarCampos();
                        listarTodosLosCiudadanos();
                       ciudadanoVista.btn_ciudadano_agregar.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Ciudadano actualizado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al actualizar Ciudadano.");
                    }
                }
            }
        } else if (e.getSource() == ciudadanoVista.btn_ciudadano_eliminar) {
            int row = ciudadanoVista.jTable_ciudadano_tabla.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un Ciudadano para eliminar.");
            } else {
                int dni = Integer.parseInt(ciudadanoVista.jTable_ciudadano_tabla.getValueAt(row, 0).toString());
                int preguntaConfir = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar este ciudadano?");

                if (preguntaConfir == 0 && ciudadanoData.borrarCiudadano(dni)) {
                    limpiarTabla();
                    limpiarCampos();
                    listarTodosLosCiudadanos();
                    ciudadanoVista.btn_ciudadano_agregar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Ciudadano eliminado.");
                }
            }
        } 
    }
    //llena la tabla ciudadano con el metodo listarCiudadanos de ciudadanoData
    public void listarTodosLosCiudadanos() {
        List<Ciudadano> listaCiudadanos = ciudadanoData.listarCiudadanos(ciudadanoVista.txt_ciudadano_buscar.getText());
        model = (DefaultTableModel) ciudadanoVista.jTable_ciudadano_tabla.getModel();
        model.setRowCount(0); // Limpia todas las filas existentes en la tabla

        for (int i = 0; i < listaCiudadanos.size(); i++) {
            Object[] row = new Object[8];
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
        ciudadanoVista.jTable_ciudadano_tabla.setModel(model);
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
    public void limpiarCampos() {
        ciudadanoVista.txt_ciudadano_dni.setText("");
        ciudadanoVista.txt_ciudadano_dni.setEditable(true);
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
