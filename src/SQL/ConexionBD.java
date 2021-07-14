/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class ConexionBD {

    private static String url = "jdbc:mysql://localhost/reservacion_habitaciones";
    private static String usuario = "root";
    private static String password = "root";

    public static Connection conectar() throws ClassNotFoundException {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Exitosa.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }

        return conexion;
    }


}
