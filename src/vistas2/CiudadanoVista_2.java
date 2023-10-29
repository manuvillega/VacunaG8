/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas2;

import Entidades.Ciudadano;
import accesoADatos.CiudadanoData;
import controladores.CiudadanoControlador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import utilidades.ProvinciasCiudades;

/**
 *
 * @author tian_
 */
public class CiudadanoVista_2 extends javax.swing.JPanel {

    private boolean esPrioritario = false; // Validar despues
    private final Principal principal;
    private CiudadanoData ciudadanoData;
    private CiudadanoControlador ciudadanoControlador;

    /**
     * Creates new form CiudadanoVista_2
     */
    public CiudadanoVista_2(Principal principal) {
//       con = Conexion.getConexion();
        this.principal = principal;
        initComponents();

//      ciudadanoData = new CiudadanoData( con);
//      ciudadano = new Ciudadano(con);
        cargarProvincias();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGrupo_prioritarios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txt_ciudadano_dni = new javax.swing.JTextField();
        txt_ciudadano_nombreCompleto = new javax.swing.JTextField();
        txt_ciudadano_email = new javax.swing.JTextField();
        txt_ciudadano_celular = new javax.swing.JTextField();
        txt_ciudadano_patologia = new javax.swing.JTextField();
        txt_ciudadano_ambito_laboral1 = new javax.swing.JTextField();
        jCB_Ciudadano_Provincias1 = new javax.swing.JComboBox<>();
        jCB_Ciudadano_Ciudades1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jCBox_no_prioritario1 = new javax.swing.JCheckBox();
        jCBox_prioritario1 = new javax.swing.JCheckBox();
        jPanel_titulo_ciudadano1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        btn_ciudadano_agregar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btn_ciudadano_modificar = new javax.swing.JButton();
        btn_ciudadano_eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txt_ciudadano_buscar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ciudadano_tabla = new javax.swing.JTable();
        jPanel_titulo_ciudadano2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        btn_ciudadano_nuevo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane1.setBackground(new java.awt.Color(191, 200, 209));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(59, 66, 109));

        jPanel6.setBackground(new java.awt.Color(191, 200, 209));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ciudadano_dni.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_ciudadano_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        txt_ciudadano_nombreCompleto.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_ciudadano_nombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        txt_ciudadano_email.setBackground(new java.awt.Color(137, 161, 209));
        txt_ciudadano_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciudadano_emailActionPerformed(evt);
            }
        });
        jPanel6.add(txt_ciudadano_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 30));

        txt_ciudadano_celular.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_ciudadano_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 30));

        txt_ciudadano_patologia.setBackground(new java.awt.Color(137, 161, 209));
        txt_ciudadano_patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciudadano_patologiaActionPerformed(evt);
            }
        });
        jPanel6.add(txt_ciudadano_patologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 210, 30));

        txt_ciudadano_ambito_laboral1.setBackground(new java.awt.Color(137, 161, 209));
        txt_ciudadano_ambito_laboral1.setForeground(new java.awt.Color(51, 51, 51));
        txt_ciudadano_ambito_laboral1.setEnabled(false);
        jPanel6.add(txt_ciudadano_ambito_laboral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 210, 28));

        jCB_Ciudadano_Provincias1.setBackground(new java.awt.Color(137, 161, 209));
        jCB_Ciudadano_Provincias1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_Ciudadano_Provincias1.setForeground(new java.awt.Color(59, 66, 109));
        jCB_Ciudadano_Provincias1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincias" }));
        jCB_Ciudadano_Provincias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_Ciudadano_Provincias1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCB_Ciudadano_Provincias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 210, 30));

        jCB_Ciudadano_Ciudades1.setBackground(new java.awt.Color(137, 161, 209));
        jCB_Ciudadano_Ciudades1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jCB_Ciudadano_Ciudades1.setForeground(new java.awt.Color(59, 66, 109));
        jCB_Ciudadano_Ciudades1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudades" }));
        jCB_Ciudadano_Ciudades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_Ciudadano_Ciudades1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCB_Ciudadano_Ciudades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 210, 32));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(59, 66, 109));
        jLabel18.setText("Nombre Completo:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 30));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(59, 66, 109));
        jLabel19.setText("DNI:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(59, 66, 109));
        jLabel20.setText("Email:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 30));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(59, 66, 109));
        jLabel21.setText("Patología:");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 140, 30));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(59, 66, 109));
        jLabel22.setText("Celular:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(59, 66, 109));
        jLabel23.setText("Provincia:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 140, 30));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(59, 66, 109));
        jLabel24.setText("Ambito Laboral:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 140, 28));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(59, 66, 109));
        jLabel25.setText("Ciudad / Localidad:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 140, 32));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 20, 240));

        jCBox_no_prioritario1.setBackground(new java.awt.Color(191, 200, 209));
        bGrupo_prioritarios.add(jCBox_no_prioritario1);
        jCBox_no_prioritario1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jCBox_no_prioritario1.setForeground(new java.awt.Color(59, 66, 109));
        jCBox_no_prioritario1.setText("No prioritario");
        jCBox_no_prioritario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_no_prioritario1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCBox_no_prioritario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, 30));

        jCBox_prioritario1.setBackground(new java.awt.Color(191, 200, 209));
        bGrupo_prioritarios.add(jCBox_prioritario1);
        jCBox_prioritario1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jCBox_prioritario1.setForeground(new java.awt.Color(59, 66, 109));
        jCBox_prioritario1.setText("Pioritario");
        jCBox_prioritario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_prioritario1ActionPerformed(evt);
            }
        });
        jPanel6.add(jCBox_prioritario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, 30));

        jPanel_titulo_ciudadano1.setBackground(new java.awt.Color(108, 132, 197));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 52, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario Ciudadano");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator5.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator5.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel_titulo_ciudadano1Layout = new javax.swing.GroupLayout(jPanel_titulo_ciudadano1);
        jPanel_titulo_ciudadano1.setLayout(jPanel_titulo_ciudadano1Layout);
        jPanel_titulo_ciudadano1Layout.setHorizontalGroup(
            jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGap(269, 269, 269)))
        );
        jPanel_titulo_ciudadano1Layout.setVerticalGroup(
            jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano1Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel9.setBackground(new java.awt.Color(108, 132, 197));

        btn_ciudadano_agregar.setBackground(new java.awt.Color(59, 66, 109));
        btn_ciudadano_agregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_ciudadano_agregar.setForeground(new java.awt.Color(246, 247, 248));
        btn_ciudadano_agregar.setText("Agregar");
        btn_ciudadano_agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));

        jSeparator6.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator6.setForeground(new java.awt.Color(48, 52, 59));

        btn_ciudadano_modificar.setBackground(new java.awt.Color(59, 66, 109));
        btn_ciudadano_modificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_ciudadano_modificar.setForeground(new java.awt.Color(246, 247, 248));
        btn_ciudadano_modificar.setText("Modificar");
        btn_ciudadano_modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_ciudadano_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudadano_modificarActionPerformed(evt);
            }
        });

        btn_ciudadano_eliminar.setBackground(new java.awt.Color(59, 66, 109));
        btn_ciudadano_eliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_ciudadano_eliminar.setForeground(new java.awt.Color(246, 247, 248));
        btn_ciudadano_eliminar.setText("Eliminar");
        btn_ciudadano_eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_ciudadano_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ciudadano_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_ciudadano_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(260, 260, 260)
                .addComponent(btn_ciudadano_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(255, 255, 255)
                .addComponent(btn_ciudadano_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ciudadano_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ciudadano_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ciudadano_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ciudadano", jPanel3);

        jPanel4.setBackground(new java.awt.Color(59, 66, 109));

        jPanel7.setBackground(new java.awt.Color(191, 200, 209));

        txt_ciudadano_buscar.setBackground(new java.awt.Color(137, 161, 209));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(59, 66, 109));
        jLabel27.setText("Buscar:");

        jTable_ciudadano_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombre Completo", "Email", "Celular", "Patologia", "AmbitoLaboral", "Provincia", "Localidad"
            }
        ));
        jScrollPane1.setViewportView(jTable_ciudadano_tabla);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ciudadano_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ciudadano_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_titulo_ciudadano2.setBackground(new java.awt.Color(108, 132, 197));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 52, 59));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Formulario Ciudadano");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator7.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator7.setForeground(new java.awt.Color(48, 52, 59));

        javax.swing.GroupLayout jPanel_titulo_ciudadano2Layout = new javax.swing.GroupLayout(jPanel_titulo_ciudadano2);
        jPanel_titulo_ciudadano2.setLayout(jPanel_titulo_ciudadano2Layout);
        jPanel_titulo_ciudadano2Layout.setHorizontalGroup(
            jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGap(149, 149, 149))
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGap(269, 269, 269)))
        );
        jPanel_titulo_ciudadano2Layout.setVerticalGroup(
            jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel_titulo_ciudadano2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_titulo_ciudadano2Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel10.setBackground(new java.awt.Color(108, 132, 197));

        jSeparator8.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator8.setForeground(new java.awt.Color(48, 52, 59));

        btn_ciudadano_nuevo.setBackground(new java.awt.Color(59, 66, 109));
        btn_ciudadano_nuevo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_ciudadano_nuevo.setForeground(new java.awt.Color(246, 247, 248));
        btn_ciudadano_nuevo.setText("Nuevo");
        btn_ciudadano_nuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_ciudadano_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(752, 752, 752))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_ciudadano_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista Ciudadano", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
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

    private void txt_ciudadano_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciudadano_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciudadano_emailActionPerformed

    private void txt_ciudadano_patologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciudadano_patologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciudadano_patologiaActionPerformed

                //SELECCION PROVINCIA COMBOBOX
    private void jCB_Ciudadano_Provincias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_Ciudadano_Provincias1ActionPerformed
         if (jCB_Ciudadano_Provincias1.getSelectedItem() != null) {
            String provinciaSeleccionada = jCB_Ciudadano_Provincias1.getSelectedItem().toString();
            cargarCiudadesPorProvincia(provinciaSeleccionada);
            jCB_Ciudadano_Ciudades1.setEnabled(true);  // habilito el ComboBox de ciudades
        }
    }//GEN-LAST:event_jCB_Ciudadano_Provincias1ActionPerformed

    
            //CHECK BOX CIUDADANO PRIORITARIO O NO
    private void jCBox_no_prioritario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_no_prioritario1ActionPerformed
        if (jCBox_no_prioritario1.isSelected()) {
            // "No Prioritario" está seleccionado, habilita la caja de texto
            txt_ciudadano_ambito_laboral1.setEnabled(true);
            esPrioritario = false; // No es prioritario
        }
    }//GEN-LAST:event_jCBox_no_prioritario1ActionPerformed

    private void jCBox_prioritario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_prioritario1ActionPerformed
        if (jCBox_prioritario1.isSelected()) {
            // "Prioritario" está seleccionado, habilita la caja de texto
            txt_ciudadano_ambito_laboral1.setEnabled(true);
            esPrioritario = true; ///si es prioritario
        }
    }//GEN-LAST:event_jCBox_prioritario1ActionPerformed

    
    
    private void jCB_Ciudadano_Ciudades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_Ciudadano_Ciudades1ActionPerformed

    }//GEN-LAST:event_jCB_Ciudadano_Ciudades1ActionPerformed

    private void btn_ciudadano_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudadano_modificarActionPerformed
        
    }//GEN-LAST:event_btn_ciudadano_modificarActionPerformed

    private void btn_ciudadano_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ciudadano_eliminarActionPerformed
               int DNI;
        try{
        DNI = Integer.parseInt(txt_ciudadano_dni.getText());
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser solo números!.");
            return;
        }
        if(DNI != 0 || txt_ciudadano_dni.getText().length() != 8){
            Ciudadano ciudadano = ciudadanoData.buscarCiudadanoPorDNI(DNI);
            
            if(ciudadano != null){
                ciudadanoData.borrarCiudadano(ciudadano);
                JOptionPane.showMessageDialog(this, "Ciudadano eliminado");
                ciudadanoControlador.limpiarCampos();
            } else{
                JOptionPane.showMessageDialog(this, "No existe ciudadano con ese dni");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un DNI valido");
        }
    
    }//GEN-LAST:event_btn_ciudadano_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupo_prioritarios;
    public javax.swing.JButton btn_ciudadano_agregar;
    public javax.swing.JButton btn_ciudadano_eliminar;
    public javax.swing.JButton btn_ciudadano_modificar;
    public javax.swing.JButton btn_ciudadano_nuevo;
    public javax.swing.JComboBox<String> jCB_Ciudadano_Ciudades1;
    public javax.swing.JComboBox<String> jCB_Ciudadano_Provincias1;
    public javax.swing.JCheckBox jCBox_no_prioritario1;
    public javax.swing.JCheckBox jCBox_prioritario1;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_titulo_ciudadano1;
    private javax.swing.JPanel jPanel_titulo_ciudadano2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable_ciudadano_tabla;
    public javax.swing.JTextField txt_ciudadano_ambito_laboral1;
    public javax.swing.JTextField txt_ciudadano_buscar;
    public javax.swing.JTextField txt_ciudadano_celular;
    public javax.swing.JTextField txt_ciudadano_dni;
    public javax.swing.JTextField txt_ciudadano_email;
    public javax.swing.JTextField txt_ciudadano_nombreCompleto;
    public javax.swing.JTextField txt_ciudadano_patologia;
    // End of variables declaration//GEN-END:variables

    private void cargarProvincias() {
        String[] provinciasArgentina = ProvinciasCiudades.obtenerProvinciasArgentina();
        jCB_Ciudadano_Provincias1.setModel(new DefaultComboBoxModel<>(provinciasArgentina));
    }

    private void cargarCiudadesPorProvincia(String provincia) {
        String[] ciudades = ProvinciasCiudades.obtenerCiudadesPorProvincia(provincia);
        jCB_Ciudadano_Ciudades1.setModel(new DefaultComboBoxModel<>(ciudades));
    }

    ///Obtener prioridad del ciudadano
    public boolean esPrioritario() {
        return esPrioritario;
    }

//        public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                // Crea el JFrame para mostrar el JPanel
//                JFrame frame = new JFrame("Carga de Provincias");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(900, 500);
//
//                // Crea y agrega el panel al frame
//                CiudadanoVista_2 ciudadanoPanel = new CiudadanoVista_2();
//                frame.add(ciudadanoPanel);
//
//                // Haz visible el frame
//                frame.setVisible(true);
//            }
//        });
//    }
}
