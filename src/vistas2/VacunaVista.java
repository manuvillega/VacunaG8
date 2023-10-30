package vistas2;

/**
 *
 * @author Gonz@_
 */
public class VacunaVista extends javax.swing.JPanel {
    private boolean esAplicada = false;
    /**
     * Creates new form VacunaVista
     */
    public VacunaVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_aplicada = new javax.swing.ButtonGroup();
        jP_vacuna_fondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel_vacuna = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txt_Laboratorio_Cuit = new javax.swing.JTextField();
        txt_laboratorio_nombreLab = new javax.swing.JTextField();
        txt_Laboratorio_pais = new javax.swing.JTextField();
        txt_Laboratorio_domComercial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jCBox_no_falso = new javax.swing.JCheckBox();
        jCBox_si_verdadero = new javax.swing.JCheckBox();
        jPanel_titulo_ciudadano1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        btn_vacuna_agregar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btn_modificar_modificar = new javax.swing.JButton();
        btn_laboratorio_eliminar = new javax.swing.JButton();

        jP_vacuna_fondo.setBackground(new java.awt.Color(137, 161, 209));

        jTabbedPane1.setBackground(new java.awt.Color(191, 200, 209));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jPanel_vacuna.setBackground(new java.awt.Color(59, 66, 109));

        jPanel6.setBackground(new java.awt.Color(191, 200, 209));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Laboratorio_Cuit.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_Laboratorio_Cuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        txt_laboratorio_nombreLab.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_laboratorio_nombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        txt_Laboratorio_pais.setBackground(new java.awt.Color(137, 161, 209));
        txt_Laboratorio_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Laboratorio_paisActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Laboratorio_pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 30));

        txt_Laboratorio_domComercial.setBackground(new java.awt.Color(137, 161, 209));
        jPanel6.add(txt_Laboratorio_domComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 30));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(59, 66, 109));
        jLabel18.setText("Marca:");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 30));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(59, 66, 109));
        jLabel19.setText("Nímero de Serie");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 30));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(59, 66, 109));
        jLabel20.setText("Medida:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 30));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(59, 66, 109));
        jLabel22.setText("Vacuna Aplicada:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 20, 240));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(59, 66, 109));
        jLabel23.setText("Fecha Caducidad:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        jCBox_no_falso.setBackground(new java.awt.Color(191, 200, 209));
        buttonGroup_aplicada.add(jCBox_no_falso);
        jCBox_no_falso.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jCBox_no_falso.setForeground(new java.awt.Color(59, 66, 109));
        jCBox_no_falso.setText("No");
        jCBox_no_falso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_no_falsoActionPerformed(evt);
            }
        });
        jPanel6.add(jCBox_no_falso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, 30));

        jCBox_si_verdadero.setBackground(new java.awt.Color(191, 200, 209));
        buttonGroup_aplicada.add(jCBox_si_verdadero);
        jCBox_si_verdadero.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jCBox_si_verdadero.setForeground(new java.awt.Color(59, 66, 109));
        jCBox_si_verdadero.setText("Si");
        jCBox_si_verdadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBox_si_verdaderoActionPerformed(evt);
            }
        });
        jPanel6.add(jCBox_si_verdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));

        jPanel_titulo_ciudadano1.setBackground(new java.awt.Color(108, 132, 197));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 52, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario Vacuna");
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

        btn_vacuna_agregar.setBackground(new java.awt.Color(59, 66, 109));
        btn_vacuna_agregar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_vacuna_agregar.setForeground(new java.awt.Color(246, 247, 248));
        btn_vacuna_agregar.setText("Agregar");
        btn_vacuna_agregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_vacuna_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vacuna_agregarActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(48, 52, 59));
        jSeparator6.setForeground(new java.awt.Color(48, 52, 59));

        btn_modificar_modificar.setBackground(new java.awt.Color(59, 66, 109));
        btn_modificar_modificar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_modificar_modificar.setForeground(new java.awt.Color(246, 247, 248));
        btn_modificar_modificar.setText("Modificar");
        btn_modificar_modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_modificar_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_modificarActionPerformed(evt);
            }
        });

        btn_laboratorio_eliminar.setBackground(new java.awt.Color(59, 66, 109));
        btn_laboratorio_eliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_laboratorio_eliminar.setForeground(new java.awt.Color(246, 247, 248));
        btn_laboratorio_eliminar.setText("Eliminar");
        btn_laboratorio_eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(51, 0, 255)));
        btn_laboratorio_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laboratorio_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_vacuna_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(260, 260, 260)
                .addComponent(btn_modificar_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(255, 255, 255)
                .addComponent(btn_laboratorio_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btn_vacuna_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_laboratorio_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_vacunaLayout = new javax.swing.GroupLayout(jPanel_vacuna);
        jPanel_vacuna.setLayout(jPanel_vacunaLayout);
        jPanel_vacunaLayout.setHorizontalGroup(
            jPanel_vacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_vacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_vacunaLayout.setVerticalGroup(
            jPanel_vacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_vacunaLayout.createSequentialGroup()
                .addComponent(jPanel_titulo_ciudadano1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vacuna", jPanel_vacuna);

        javax.swing.GroupLayout jP_vacuna_fondoLayout = new javax.swing.GroupLayout(jP_vacuna_fondo);
        jP_vacuna_fondo.setLayout(jP_vacuna_fondoLayout);
        jP_vacuna_fondoLayout.setHorizontalGroup(
            jP_vacuna_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        jP_vacuna_fondoLayout.setVerticalGroup(
            jP_vacuna_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_vacuna_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_vacuna_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Laboratorio_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Laboratorio_paisActionPerformed

    }//GEN-LAST:event_txt_Laboratorio_paisActionPerformed

    private void btn_vacuna_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vacuna_agregarActionPerformed

    }//GEN-LAST:event_btn_vacuna_agregarActionPerformed

    private void btn_modificar_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_modificarActionPerformed

    }//GEN-LAST:event_btn_modificar_modificarActionPerformed

    private void btn_laboratorio_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laboratorio_eliminarActionPerformed

    }//GEN-LAST:event_btn_laboratorio_eliminarActionPerformed

    private void jCBox_no_falsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_no_falsoActionPerformed
        esAplicada = !jCBox_no_falso.isSelected();
    }//GEN-LAST:event_jCBox_no_falsoActionPerformed

    private void jCBox_si_verdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBox_si_verdaderoActionPerformed
        esAplicada = jCBox_si_verdadero.isSelected();
    }//GEN-LAST:event_jCBox_si_verdaderoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_laboratorio_eliminar;
    public javax.swing.JButton btn_modificar_modificar;
    public javax.swing.JButton btn_vacuna_agregar;
    private javax.swing.ButtonGroup buttonGroup_aplicada;
    public javax.swing.JCheckBox jCBox_no_falso;
    public javax.swing.JCheckBox jCBox_si_verdadero;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jP_vacuna_fondo;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_titulo_ciudadano1;
    private javax.swing.JPanel jPanel_vacuna;
    public javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField txt_Laboratorio_Cuit;
    public javax.swing.JTextField txt_Laboratorio_domComercial;
    public javax.swing.JTextField txt_Laboratorio_pais;
    public javax.swing.JTextField txt_laboratorio_nombreLab;
    // End of variables declaration//GEN-END:variables

public boolean esAplicada() {
    return esAplicada;
}
}