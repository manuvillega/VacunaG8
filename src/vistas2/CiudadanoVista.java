package vistas2;

import Entidades.*;
import accesoADatos.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import utilidades.ProvinciasCiudades;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JPanel;


/**
 *
 * @author tian_
 */
public class CiudadanoVista extends javax.swing.JPanel {
    private Connection con = null;
    private Ciudadano ciudadano;
    private CiudadanoData ciudadanoData;
    //private final Principal principal;
    /**
     * Creates new form CiudadanoVista
     */
    public CiudadanoVista(Principal principal) {
//       con = Conexion.getConexion();
       // this.principal = principal;
        initComponents();

//        ciudadanoData = new CiudadanoData( con);
//        ciudadano = new Ciudadano(con);


        cargarProvincias();

     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jCB_Ciudadano_Provincias = new javax.swing.JComboBox<>();
        jCB_Ciudadano_Ciudades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel_titulo_ciudadano = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane1.setBackground(new java.awt.Color(191, 200, 209));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(59, 66, 109));

        jPanel5.setBackground(new java.awt.Color(191, 200, 209));

        jTextField1.setBackground(new java.awt.Color(137, 161, 209));

        jTextField2.setBackground(new java.awt.Color(137, 161, 209));

        jTextField3.setBackground(new java.awt.Color(137, 161, 209));

        jTextField4.setBackground(new java.awt.Color(137, 161, 209));

        jTextField5.setBackground(new java.awt.Color(137, 161, 209));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(137, 161, 209));

        jCB_Ciudadano_Provincias.setBackground(new java.awt.Color(137, 161, 209));
        jCB_Ciudadano_Provincias.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_Ciudadano_Provincias.setForeground(new java.awt.Color(59, 66, 109));
        jCB_Ciudadano_Provincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincias" }));
        jCB_Ciudadano_Provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_Ciudadano_ProvinciasActionPerformed(evt);
            }
        });

        jCB_Ciudadano_Ciudades.setBackground(new java.awt.Color(137, 161, 209));
        jCB_Ciudadano_Ciudades.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_Ciudadano_Ciudades.setForeground(new java.awt.Color(59, 66, 109));
        jCB_Ciudadano_Ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudades" }));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(59, 66, 109));
        jLabel10.setText("Nombre Completo:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(59, 66, 109));
        jLabel11.setText("DNI:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(59, 66, 109));
        jLabel12.setText("Email:");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(59, 66, 109));
        jLabel13.setText("Patología:");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(59, 66, 109));
        jLabel14.setText("Celular:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(59, 66, 109));
        jLabel15.setText("Provincia:");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(59, 66, 109));
        jLabel16.setText("Ambito Laboral:");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(59, 66, 109));
        jLabel17.setText("Ciudad / Localidad:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_Ciudadano_Provincias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_Ciudadano_Ciudades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCB_Ciudadano_Provincias, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCB_Ciudadano_Ciudades, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        jPanel6.setBackground(new java.awt.Color(191, 200, 209));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_titulo_ciudadano.setBackground(new java.awt.Color(108, 132, 197));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(48, 52, 59));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Ciudadano");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator1.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator1.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel_titulo_ciudadanoLayout = new javax.swing.GroupLayout(jPanel_titulo_ciudadano);
        jPanel_titulo_ciudadano.setLayout(jPanel_titulo_ciudadanoLayout);
        jPanel_titulo_ciudadanoLayout.setHorizontalGroup(
            jPanel_titulo_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadanoLayout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel_titulo_ciudadanoLayout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGap(269, 269, 269)))
        );
        jPanel_titulo_ciudadanoLayout.setVerticalGroup(
            jPanel_titulo_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadanoLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel8.setBackground(new java.awt.Color(108, 132, 197));

        jButton9.setBackground(new java.awt.Color(59, 66, 109));
        jButton9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(246, 247, 248));
        jButton9.setText("Buscar");

        jButton10.setBackground(new java.awt.Color(59, 66, 109));
        jButton10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(246, 247, 248));
        jButton10.setText("Buscar");

        jButton11.setBackground(new java.awt.Color(59, 66, 109));
        jButton11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(246, 247, 248));
        jButton11.setText("Buscar");

        jButton12.setBackground(new java.awt.Color(59, 66, 109));
        jButton12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(246, 247, 248));
        jButton12.setText("Buscar");

        jSeparator4.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator4.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(122, 122, 122)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(129, 129, 129)
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(118, 118, 118)
                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel_titulo_ciudadano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ciudadano", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
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

    private void jCB_Ciudadano_ProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_Ciudadano_ProvinciasActionPerformed
        if (jCB_Ciudadano_Provincias.getSelectedItem() != null) {
            String provinciaSeleccionada = jCB_Ciudadano_Provincias.getSelectedItem().toString();
            cargarCiudadesPorProvincia(provinciaSeleccionada);
            jCB_Ciudadano_Ciudades.setEnabled(true);  // habilito el ComboBox de ciudades
        }
    }//GEN-LAST:event_jCB_Ciudadano_ProvinciasActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jCB_Ciudadano_Ciudades;
    private javax.swing.JComboBox<String> jCB_Ciudadano_Provincias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel_titulo_ciudadano;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void cargarProvincias() {
        String[] provinciasArgentina = ProvinciasCiudades.obtenerProvinciasArgentina();
        jCB_Ciudadano_Provincias.setModel(new DefaultComboBoxModel<>(provinciasArgentina));

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

    private void cargarCiudadesPorProvincia(String provincia) {
        String[] ciudades = ProvinciasCiudades.obtenerCiudadesPorProvincia(provincia);
        jCB_Ciudadano_Ciudades.setModel(new DefaultComboBoxModel<>(ciudades));
    }

//    private void cargarProvincias() {
//        String[] provinciasArgentina = {"Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego, Antártida e Islas del Atlántico Sur", "Tucumán"};
//        jCB_Ciudadano_Provincias.setModel(new DefaultComboBoxModel<>(provinciasArgentina));
//        // Agrega un listener para el ComboBox de provincias
//        jComboBoxProvincias.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (jComboBoxProvincias.getSelectedItem() != null) {
//                    String provinciaSeleccionada = jComboBoxProvincias.getSelectedItem().toString();
//                    cargarCiudadesPorProvincia(provinciaSeleccionada);
//                    jComboBoxCiudades.setEnabled(true);  // Habilita el ComboBox de ciudades
//                }
//            }
//        });
//    }
//       private void cargarCiudadesPorProvincia(String provincia) {
//        String[] ciudadBuenosAires = {"Almirante Brown", "Avellaneda", "Berazategui", "Berisso", "Brandsen", "Campana", "Cañuelas", "Ensenada", "Escobar", "Esteban Echeverría", 
//            "Exaltación de la Cruz", "Ezeiza", "Florencio Varela", "General Las Heras", "General Rodríguez", "General San Martín", "Hurlingham", "Ituzaingó", "José C. Paz", "La Matanza",
//            "La Plata", "Lanús", "Luján", "Lomas de Zamora", "Malvinas Argentinas", "Marcos Paz", "Merlo", "Moreno", "Morón", "Pilar", "Presidente Perón", "Quilmes", "San Fernando", 
//            "San Isidro", "San Miguel", "San Vicente", "Tigre", "Tres de Febrero", "Vicente López", "Zárate"};
//        
//        String[] ciudadCatamarca = {"San Fernando del Valle de Catamarca", "Valle Viejo", "Santa María", "Recreo", "Tinogasta", "Belén", "Andalgalá",  "Fray Mamerto Esquiú"};
//       
//         String[] ciudades;
//
//        // Asigna las ciudades correspondientes a la provincia seleccionada
//        switch (provincia) {
//            case "Buenos Aires":
//                ciudades = ciudadBuenosAires;
//                break;
//            case "Catamarca":
//                ciudades = ciudadCatamarca;
//                break;
//            default:
//                // si no se esta la provincia,  deja el ComboBox vacío
//                ciudades = new String[0];
//                break;
//        }
//
//        jCB_Ciudadano_Ciudades.setModel(new DefaultComboBoxModel<>(ciudades));
//    }
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                // Crea el JFrame para mostrar el JPanel
//                JFrame frame = new JFrame("Carga de Provincias");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(900, 500);
//
//                // Crea y agrega el panel al frame
//                CiudadanoVista ciudadanoPanel = new CiudadanoVista();
//                frame.add(ciudadanoPanel);
//
//                // Haz visible el frame
//                frame.setVisible(true);
//            }
//        });
//    }

}
