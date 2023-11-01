/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas2;

import Entidades.CentroVacunacion;
import Entidades.Laboratorio;
import accesoADatos.Conexion;
import accesoADatos.LaboratorioData;
import static java.awt.Event.INSERT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static javafx.scene.input.KeyCode.INSERT;
import static javax.accessibility.AccessibleTableModelChange.INSERT;
import static javax.swing.DropMode.INSERT;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.event.DocumentEvent.EventType.INSERT;
import static javax.swing.event.TableModelEvent.INSERT;

/**
 *
 * @author tian_
 */
public class LaboratorioVista extends javax.swing.JPanel {

    /**
     * Creates new form LaboratorioVista
     */
    private LaboratorioData laboratoriodata;
    private Laboratorio laboratorio;
    private Connection con = null;

    public LaboratorioVista() {
        con = Conexion.getConexion();
        initComponents();
        laboratoriodata = new LaboratorioData(con);

        // laboratorio = new Laboratorio(con);
        //agregarLaboratorio();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLCUIT = new javax.swing.JLabel();
        jLNomLab = new javax.swing.JLabel();
        jLPais = new javax.swing.JLabel();
        jLDomCom = new javax.swing.JLabel();
        jTcuit = new javax.swing.JTextField();
        jTnomlab = new javax.swing.JTextField();
        jTpais = new javax.swing.JTextField();
        jTdomcom = new javax.swing.JTextField();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jTID = new javax.swing.JTextField();
        jTCUIT = new javax.swing.JTextField();
        jTNomLab = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jTDomCom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jBModificar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(17, 24, 39));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(9, 9, 11));

        kGradientPanel2.setkEndColor(new java.awt.Color(30, 58, 138));
        kGradientPanel2.setkStartColor(new java.awt.Color(9, 9, 11));

        kGradientPanel3.setkEndColor(new java.awt.Color(30, 58, 138));
        kGradientPanel3.setkStartColor(new java.awt.Color(9, 9, 11));

        jLCUIT.setForeground(new java.awt.Color(102, 255, 0));
        jLCUIT.setText("CUIT");

        jLNomLab.setForeground(new java.awt.Color(102, 255, 0));
        jLNomLab.setText("Nombre Laboratorio");

        jLPais.setForeground(new java.awt.Color(102, 255, 0));
        jLPais.setText("Pais");

        jLDomCom.setForeground(new java.awt.Color(102, 255, 0));
        jLDomCom.setText("Dom Comercial");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(jLCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jTcuit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPais, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnomlab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTpais, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTdomcom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcuit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnomlab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdomcom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 147, Short.MAX_VALUE))
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(30, 58, 138));
        kGradientPanel4.setkStartColor(new java.awt.Color(9, 9, 11));

        jTID.setText("jTextField1");

        jTCUIT.setText("jTextField2");

        jTNomLab.setText("jTextField1");

        jTCiudad.setText("jTextField1");

        jTDomCom.setText("jTextField1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTDomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(276, 276, 276)
                                .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTNomLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTNomLab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTDomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        kGradientPanel5.setkEndColor(new java.awt.Color(30, 58, 138));
        kGradientPanel5.setkStartColor(new java.awt.Color(9, 9, 11));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(30, 58, 138));
        kGradientPanel6.setkStartColor(new java.awt.Color(9, 9, 11));

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBAgregar)
                .addGap(43, 43, 43)
                .addComponent(jBModificar)
                .addGap(52, 52, 52)
                .addComponent(jBBuscar)
                .addGap(59, 59, 59)
                .addComponent(jBEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBModificar)
                    .addComponent(jBBuscar)
                    .addComponent(jBEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        jTabbedPane1.addTab("tab1", kGradientPanel2);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        add(kGradientPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        String sql = "INSERT INTO Laboratorio (CUIT, nomLaboratorio, pais, domComercial) VALUES (?, ?, ?, ?)";

        try {
            String cuitCompleto = JOptionPane.showInputDialog("Ingrese el CUIT completo (11 dígitos):");
            String nombreLaboratorio = JOptionPane.showInputDialog("Ingrese el nombre del laboratorio:");
            String pais = JOptionPane.showInputDialog("Ingrese el país:");
            String provincia = JOptionPane.showInputDialog("Ingrese la provincia:");
            String domcom = JOptionPane.showInputDialog("Ingrese el domicilio:");

            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/vacuna23 (1)", "root", "");

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, cuitCompleto);
            statement.setString(2, nombreLaboratorio);
            statement.setString(3, pais);
            statement.setString(4, domcom);
            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Laboratorio agregado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el laboratorio");
            }

//             Cerrar la conexión;
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

//        } catch (Exception e) {
//            JOptionPane.showInputDialog(null, "No se pudo agregar laboratorio" + e);
//        }
//
////
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String cuitStr = jTcuit.getText();
        int cuit = 0;
        try {
            cuit = Integer.parseInt(cuitStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El cuit debe ser un número válido");
        }
        if (cuit <= 0) {
            JOptionPane.showMessageDialog(this, "El cuit no puede ser 0 o número negativo");

            Laboratorio laboratorio = laboratoriodata.obtenerLaboratorioPorCUIT("CUIT");
            if (laboratorio != null) {

                String nomLaboratorio = jTnomlab.getText();
                String pais = jTpais.getText();
                String domComercial = jTdomcom.getText();

                laboratorio.setNomLaboratorio(nomLaboratorio);
                laboratorio.setPais(pais);
                laboratorio.setDomComercial(domComercial);
                laboratoriodata.actualizarLaboratorio(laboratorio);
                JOptionPane.showMessageDialog(this, "Laboratorio actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No existe un laboratorio con ese CUIT");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El CUIT no puede ser 0 o un número negativo");
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String CUITBuscar;
        try {
            CUITBuscar = jTcuit.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser solo un número.", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Laboratorio laboratorioEncontrado = laboratoriodata.obtenerLaboratorioPorCUIT("CUITBuscar");

        if (laboratorioEncontrado != null) {
            // Mostramos los datos del alumno en los campos de texto
            String cuitCompleto = JOptionPane.showInputDialog("Ingrese el CUIT completo (11 dígitos):");
            String nombreLaboratorio = JOptionPane.showInputDialog("Ingrese el nombre del laboratorio:");
            String pais = JOptionPane.showInputDialog("Ingrese el país:");
            String domiciloComercial = JOptionPane.showInputDialog("Ingrese el domicilio:");
        } else {
            JOptionPane.showMessageDialog(this, "Laboratorio no encontrado.", "", JOptionPane.ERROR_MESSAGE);

            limpiarCampos();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        Laboratorio cuitLaboratorio = laboratoriodata.obtenerLaboratorioPorCUIT(jTcuit.getText());

        //validamos campos nulos
        if (cuitLaboratorio != null) {
            laboratoriodata.eliminarLaboratorio("cuit");
        } else {
            JOptionPane.showMessageDialog(this, "Laboratorio Inexistente!");
        }

        limpiarCampos();

    }//GEN-LAST:event_jBEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLCUIT;
    private javax.swing.JLabel jLDomCom;
    private javax.swing.JLabel jLNomLab;
    private javax.swing.JLabel jLPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTCUIT;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDomCom;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNomLab;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTcuit;
    private javax.swing.JTextField jTdomcom;
    private javax.swing.JTextField jTnomlab;
    private javax.swing.JTextField jTpais;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTcuit.setText("");
        jTcuit.setText("");
        jTnomlab.setText("");
        jTpais.setText("");
        jTdomcom.setText("");

    }

}
