/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.*;
/**
 *
 * @author david
 */
public class sysConexion {
    public static Connection obtConexion(){
        try{
            String myDB = "jdbc:oracle:thin:@//localhost:1521/DBPRUEBA";
            String user = "ge";
            String password = "ge";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting to data base...");
            java.sql.Connection connection = DriverManager.getConnection(myDB, user, password);
            return connection;
        } catch(SQLException e){
            System.out.println("No se pudo establecer la conexion");
        }
        return null;
    }
}
