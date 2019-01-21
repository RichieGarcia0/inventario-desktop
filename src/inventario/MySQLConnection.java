/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richie
 */
public class MySQLConnection {

    Connection conexion = null;

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/gacetas";
            String usuario = "root";
            String pass = "richie";
            conexion = DriverManager.getConnection(servidor, usuario, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            conexion = null;
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            conexion = null;
        } finally {
            return conexion;
        }
    }

    public Connection Desconectar() {
        if (conexion != null) {
            conexion = null;
        }
        return conexion;
    }
}
