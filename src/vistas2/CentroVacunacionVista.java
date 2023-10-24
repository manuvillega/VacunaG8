package vistas2;

import Entidades.CentroVacunacion;
import AccesoADatos.Conexion;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javafx.embed.swing.JFXPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import utilidades.ProvinciasCiudades;
import AccesoADatos.CentroVacunacionData;


/**
 *
 * @author Gonz@_
 */
public class CentroVacunacionVista extends javax.swing.JPanel {
    private JFXPanel jfxPanel;
    private GoogleMapPanel googleMapPanel;
    private CentroVacunacionData centroVacunacionData;

    public CentroVacunacionVista() {
        initComponents();
        cargarProvincias();
         initFX();
       centroVacunacionData = new CentroVacunacionData(Conexion.getConexion());
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel_googleMap = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jTID = new javax.swing.JTextField();
        jCB_CentroVacunacion_Provincias = new javax.swing.JComboBox<>();
        jCB_CentroVacunacion_Ciudades = new javax.swing.JComboBox<>();
        jTNombre = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane1.setBackground(new java.awt.Color(59, 66, 109));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(137, 161, 209));

        jPanel_googleMap.setBackground(new java.awt.Color(137, 161, 209));

        javax.swing.GroupLayout jPanel_googleMapLayout = new javax.swing.GroupLayout(jPanel_googleMap);
        jPanel_googleMap.setLayout(jPanel_googleMapLayout);
        jPanel_googleMapLayout.setHorizontalGroup(
            jPanel_googleMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_googleMapLayout.setVerticalGroup(
            jPanel_googleMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(108, 132, 197));

        jBBuscar.setBackground(new java.awt.Color(59, 66, 109));
        jBBuscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(246, 247, 248));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(59, 66, 109));
        jBModificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(246, 247, 248));
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(59, 66, 109));
        jBEliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(246, 247, 248));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(59, 66, 109));
        jBGuardar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(246, 247, 248));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator6.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(122, 122, 122)
                .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(129, 129, 129)
                .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(118, 118, 118)
                .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 31, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(108, 132, 197));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 52, 59));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Formulario Centro de Vacunación");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator10.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator10.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addGap(257, 257, 257)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGap(6, 6, 6)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(59, 66, 109));

        jTID.setBackground(new java.awt.Color(137, 161, 209));
        jTID.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTID.setForeground(new java.awt.Color(59, 66, 109));
        jTID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(24, 35, 57)), "ID Centro Vacunación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jCB_CentroVacunacion_Provincias.setBackground(new java.awt.Color(137, 161, 209));
        jCB_CentroVacunacion_Provincias.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_CentroVacunacion_Provincias.setForeground(new java.awt.Color(59, 66, 109));
        jCB_CentroVacunacion_Provincias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(24, 35, 57)), "Provincia", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(24, 35, 57))); // NOI18N
        jCB_CentroVacunacion_Provincias.setFocusable(false);
        jCB_CentroVacunacion_Provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_CentroVacunacion_ProvinciasActionPerformed(evt);
            }
        });

        jCB_CentroVacunacion_Ciudades.setBackground(new java.awt.Color(137, 161, 209));
        jCB_CentroVacunacion_Ciudades.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_CentroVacunacion_Ciudades.setForeground(new java.awt.Color(59, 66, 109));
        jCB_CentroVacunacion_Ciudades.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(24, 35, 57)), "Ciudad/ Localidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(24, 35, 57))); // NOI18N
        jCB_CentroVacunacion_Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_CentroVacunacion_CiudadesActionPerformed(evt);
            }
        });

        jTNombre.setBackground(new java.awt.Color(137, 161, 209));
        jTNombre.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(59, 66, 109));
        jTNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(24, 35, 57)), "Nombre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        jTDireccion.setBackground(new java.awt.Color(137, 161, 209));
        jTDireccion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jTDireccion.setForeground(new java.awt.Color(59, 66, 109));
        jTDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(24, 35, 57)), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCB_CentroVacunacion_Ciudades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCB_CentroVacunacion_Provincias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTNombre))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCB_CentroVacunacion_Provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCB_CentroVacunacion_Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_googleMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_googleMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Centro de Vacunación", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_CentroVacunacion_CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_CentroVacunacion_CiudadesActionPerformed
        String ciudadSelecionada = jCB_CentroVacunacion_Ciudades.getSelectedItem().toString();
        //googleMapPanel.showMapForCity(ciudadSelecionada);
        //jPanel_googleMap.add(jCB_CentroVacunacion_Ciudades);
    }//GEN-LAST:event_jCB_CentroVacunacion_CiudadesActionPerformed

    private void jCB_CentroVacunacion_ProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_CentroVacunacion_ProvinciasActionPerformed
        if (jCB_CentroVacunacion_Provincias.getSelectedItem() != null) {
            String provinciaSeleccionada = jCB_CentroVacunacion_Provincias.getSelectedItem().toString();
            cargarCiudadesPorProvincia(provinciaSeleccionada);
            jCB_CentroVacunacion_Ciudades.setEnabled(true);  // habilito el ComboBox de ciudades
        }
    }//GEN-LAST:event_jCB_CentroVacunacion_ProvinciasActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
         int id = Integer.parseInt(jTID.getText());
         if(id != 0){
          CentroVacunacion centroVacunacion =  centroVacunacionData.obtenerCentroVacunacionPorId(id);
          if(centroVacunacion != null){
          jTNombre.setText(centroVacunacion.getNombre());
          jTDireccion.setText(centroVacunacion.getDireccion());
          for (int i = 0; i < jCB_CentroVacunacion_Provincias.getItemCount(); i++) {
            if (centroVacunacion.getProvincia().equals(jCB_CentroVacunacion_Provincias.getItemAt(i).toString())) {
                jCB_CentroVacunacion_Provincias.setSelectedIndex(i);
                break;
            }
          jCB_CentroVacunacion_Provincias.setSelectedIndex(id);
         }
           for (int i = 0; i < jCB_CentroVacunacion_Ciudades.getItemCount(); i++) {
            if (centroVacunacion.getCiudad().equals(jCB_CentroVacunacion_Ciudades.getItemAt(i).toString())) {
                jCB_CentroVacunacion_Ciudades.setSelectedIndex(i);
                break;
            }
          jCB_CentroVacunacion_Ciudades.setSelectedIndex(id);
         }
          
          
         } else{
             JOptionPane.showMessageDialog(this, "No existe un centro de vacunacion con ese ID, por favor pruebe nuevamente con otro ID");
         }
         } else{
             JOptionPane.showMessageDialog(this, "El ID no puede ser 0 o un numero negativo");
         }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int id = Integer.parseInt(jTID.getText());
        if(id != 0){
            CentroVacunacion centroVacunacion = centroVacunacionData.obtenerCentroVacunacionPorId(id);
            if(centroVacunacion != null){
                String nombre = jTNombre.getText();
                String direccion = jTDireccion.getText();
                String provincia = jCB_CentroVacunacion_Provincias.getSelectedItem().toString();
                String ciudad = jCB_CentroVacunacion_Ciudades.getSelectedItem().toString();
                centroVacunacion = new CentroVacunacion(id, nombre, direccion, provincia, ciudad);
                centroVacunacionData.modificarCentro(centroVacunacion);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un centro de vacunacion con ese ID, por favor pruebe nuevamente con otro ID");
            }
        } else{
             JOptionPane.showMessageDialog(this, "El ID no puede ser 0 o un numero negativo");
        }
             
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int id = Integer.parseInt(jTID.getText());
        if(id != 0){
            CentroVacunacion centroVacunacion = centroVacunacionData.obtenerCentroVacunacionPorId(id);
            if(centroVacunacion != null){
                centroVacunacionData.borrarCentro(id);
            } else{
                JOptionPane.showMessageDialog(this, "No existe un centro de vacunacion con ese ID, por favor pruebe nuevamente con otro ID");
            }
        } else{
            JOptionPane.showMessageDialog(this, "El ID no puede ser 0 o un numero negativo");
        }       
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
            try{
            int id = Integer.parseInt(jTID.getText());
            if(id > 0){
                JOptionPane.showMessageDialog(this, "Por favor para crear un centro de vacunacion nuevo, deje el campo ID vacio");
            }
            } catch(NumberFormatException ex){
                
            }
            int idN = 0;
            String nombre = jTNombre.getText(); 
            String direccion = jTDireccion.getText();
            String provincia = jCB_CentroVacunacion_Provincias.getSelectedItem().toString();
            String ciudad = jCB_CentroVacunacion_Ciudades.getSelectedItem().toString();
            CentroVacunacion centroVacunacion = new CentroVacunacion(idN, nombre, direccion, provincia, ciudad);
            centroVacunacionData.crearCentro(centroVacunacion);
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCB_CentroVacunacion_Ciudades;
    private javax.swing.JComboBox<String> jCB_CentroVacunacion_Provincias;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_googleMap;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarProvincias() {
        String[] provinciasArgentina = ProvinciasCiudades.obtenerProvinciasArgentina();
        jCB_CentroVacunacion_Provincias.setModel(new DefaultComboBoxModel<>(provinciasArgentina));

        // Agrega un listener para el ComboBox de provincias
//    jCB_Ciudadano_Provincias.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (jCB_Ciudadano_Provincias.getSelectedItem() != null) {
//                String provinciaSeleccionada = jCB_Ciudadano_Provincias.getSelectedItem().toString();
//                cargarCiudadesPorProvincia(provinciaSeleccionada);
//                jCB_Ciudadano_Ciudades.setEnabled(true);  // Habilita el ComboBox de ciudades
//            }
//        }
//    });
    }

// private void initFX() {
//        googleMapsPanel = new GoogleMapPanel();
//
//        // Agregar ActionListener para el ComboBox de ciudades
//        jCB_CentroVacunacion_Ciudades.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String ciudadSeleccionada = jCB_CentroVacunacion_Ciudades.getSelectedItem().toString();
//                googleMapsPanel.showMapForCity(ciudadSeleccionada);
//            }
//        });
//
//        // Remueve todos los componentes del jPanel_googleMap antes de agregar el GoogleMapPanel
//        jPanel_googleMap.removeAll();
//
//        // Agrega el GoogleMapPanel al jPanel_googleMap
//        jPanel_googleMap.setLayout(new BorderLayout());  // Asegura que se use BorderLayout
//        jPanel_googleMap.add(googleMapsPanel, BorderLayout.CENTER);
//
//        // Actualiza el panel para que se reflejen los cambios
//        jPanel_googleMap.revalidate();
//        jPanel_googleMap.repaint();
//    }

         private void initFX() {
        googleMapPanel = new GoogleMapPanel();

        jPanel_googleMap.setLayout(new BorderLayout());
        jPanel_googleMap.add(googleMapPanel, BorderLayout.CENTER);
    }
         
    private void cargarCiudadesPorProvincia(String provincia) {
        String[] ciudades = ProvinciasCiudades.obtenerCiudadesPorProvincia(provincia);
        jCB_CentroVacunacion_Ciudades.setModel(new DefaultComboBoxModel<>(ciudades));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Centro de Vacunación");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 500);

            CentroVacunacionVista centroVacunacionPanel = new CentroVacunacionVista();
            frame.add(centroVacunacionPanel);

            frame.setVisible(true);
        });
    }

}
