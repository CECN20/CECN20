/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Carlos Eduardo
 */
public class ConexionSuper {
  
     private static Connection conn;
    String url = "jdbc:oracle:thin:@localhost:1521/xe";
    String usuario = "SuperMercadoUn";
    String password = "SuperMercado1";

    ConexionSuper() throws Exception {
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection(url, usuario, password);
    }

    public static Connection getConnection() throws Exception {
        if (conn == null) {
            ConexionSuper conexionSuper = new ConexionSuper();
        }
        return conn;
    }
    
}
