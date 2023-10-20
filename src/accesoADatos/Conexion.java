package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.Connection;

public class Conexion {

    private static final String URL = "jdbc:mariadb://bbyx1f66fejrhqycvlsk-mysql.services.clever-cloud.com:3306/bbyx1f66fejrhqycvlsk";
    private static final String USUARIO = "uwx9m784mafknkzw";
    private static final String PASSWORD = "sRnSQH1IJ9uqBhl1knas";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
                
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver: " + ex.getMessage(), "Error al conectarse a la Base de Datos", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
        return connection;
    }
    
    
    public static void desconectar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada!.", "",  JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
