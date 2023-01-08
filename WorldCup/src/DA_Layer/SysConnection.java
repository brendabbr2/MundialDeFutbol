/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import java.sql.*;

/**
 *
 * @author jox
 */
public class SysConnection {
    public static Connection connect(){
        try{
            String myDB = "jdbc:oracle:thin:@//localhost:1521/DBPRUEBA";
            String user = "proj";
            String password = "proj";
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting to data base...");
            java.sql.Connection connection = DriverManager.getConnection(myDB, user, password);
            return connection;
        } catch(SQLException e){
            System.out.println("Not able to stablish connection...");
        }
        return null;
    }
}
