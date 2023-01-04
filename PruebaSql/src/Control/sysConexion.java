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
            String myDB = "";
            String user = "";
            String password = "";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting to data base...");
            java.sql.Connection connection = DriverManager.getConnection(myDB, user, password);
            return connection;
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        return null;
    }
}
