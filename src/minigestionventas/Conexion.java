/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minigestionventas;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dam09
 */
public class Conexion {
    
    private int i=-1;            // Variable usada para elegir opciones
    static Connection conexion;
    static Statement sentencia;
    static DatabaseMetaData metadatos;
    static ResultSetMetaData rsmetadatos;
    
    public Conexion(){       
    }
    public Conexion (int i){
        this.i= i;
    }
    public Connection getConexion(){
        return conexion;
    }
    public int tipoConexion(){
      return i;
    }
           
    public void Conectar (String usuario, String pass) throws ClassNotFoundException, SQLException{
        String driver;
        String cadena;
        
        if (i==1){
            // Conexion Oracle
            driver ="oracle.jdbc.driver.OracleDriver";
            cadena ="jdbc:oracle:thin:@172.20.0.76:1521:XE";
            
            Class.forName(driver);
            conexion=DriverManager.getConnection(cadena,usuario,pass);
            System.out.println(" Conectado a Oracle ");
                    
        }
        if (i==2){
            // Conexion MySQL
            driver = "com.mysql.jdbc.Driver";
            cadena = "jdbc:mysql://172.20.0.158/gesventas";
            
            Class.forName(driver);
            conexion=DriverManager.getConnection(cadena,usuario,pass);
            System.out.println(" Conectado a MySQL");
            
        }
        if (i==3){
            // Conexion SQLite
            driver = "org.sqlite.JDBC";
            cadena = "jdbc:sqlite:GesVentas.bd";
  
            Class.forName(driver);
            conexion=DriverManager.getConnection(cadena,usuario,pass);
            System.out.println(" Conectado a SQLite");
            
        }
        if (i==4){
            // Conexion Apache
            System.out.println(" Conectado a Apache");
        }
            
    }
    
}
