package vistas2;

import Entidades.*;
import accesoADatos.*;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import controladores.CiudadanoControlador;
import controladores.ConfiguracionControlador;
import desplazable.Desface;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonz@_
 */
public class Principal extends javax.swing.JFrame {

    //ATRIBUTOS MENUS
    private Desface desplazar;
    private boolean menuDesplegado = false;
    //ATRIBUTOS CLASES PANELES
    private CiudadanoVista_2 ciudadanoVista;
    private CitaVacunacionVista citaVacunacionVista;
    private CentroVacunacionVista centroVacunacionVista;
    private LaboratorioVista laboratorioVista;
//    private VacinaVista VacinaVista;
    private Ciudadano ciudadano;
    private CiudadanoData ciudadanoData ;
    
    public Principal() {
        initComponents();
        setSize(1200, 650);
        setLocationRelativeTo(null);
        // jPanel_botones_principal.setVisible(true);
        jDesktopVacuna.setVisible(true);
        desplazar = new Desface();
        conifgDate();
        Connection conexion = Conexion.getConexion();

    
         ciudadanoVista = new CiudadanoVista_2(this);
        ciudadano = new Ciudadano();
        ciudadanoData = new CiudadanoData(conexion);
        laboratorioVista = new LaboratorioVista();

        
        //CONFIGS CONTROLADOR
       ConfiguracionControlador controladorconfig = new ConfiguracionControlador(this);
        // CIUDADANO CONTTROLADOR
        CiudadanoControlador controladorCiudadano = new CiudadanoControlador(ciudadano, ciudadanoData, ciudadanoVista);
        controladorCiudadano.listarTodosLosCiudadanos();
         
     
       this.repaint(); //al final siempre
    }

    public void mostrarLaboratorio() {
        jPanel_Escritorio.removeAll();
        jPanel_Escritorio.add(laboratorioVista);
        laboratorioVista.setVisible(true);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vacunación Grupo 8");
        setBackground(new java.awt.Color(24, 24, 27));
        setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1113, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
                //VUELVE A MOSTRAR EL ESCRITORIO AL CLICKEAR LOGO ULP (funcion escondida -_º)...
        private void mostrarEscritorio() {
        jPanel_Escritorio.removeAll();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/escritorio_principal.jpg"));
        Image image = icon.getImage();
        jDesktopVacuna = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPanel_Escritorio.setSize(jPanel_Escritorio.getWidth(), jDesktopVacuna.getHeight());
        jPanel_Escritorio.setVisible(true);
        jPanel_Escritorio.add(jDesktopVacuna);
        //  jD_desktop   activo en el jPanel_desktop
        jPanel_Escritorio.setComponentZOrder(jDesktopVacuna, 0);
        jPanel_Escritorio.revalidate();
        jPanel_Escritorio.repaint();
    }

       
     private void conifgDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        jL_fechaHora.setText(now.format(DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
        try {
            UIManager.setLookAndFeel(new McWinLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        // crea e inicializa el  principal
        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();  // misma intancia
            principal.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
