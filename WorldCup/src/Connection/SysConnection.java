/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jox
 */
public class SysConnection {
    private static Connection conn = null;
    private static String url = "jdbc:oracle:thin:@//localhost:1521/DBVERANO";
    private static String user = "proj";
    private static String password = "proj";
    
    public static Connection connect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            if (conn != null){
                System.out.println("Successful Connection");
            }else{
                System.out.println("Unsuccessful Connection");
            }
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Unsuccessful connection");
        }
        return conn;
    }
    
    public void disconnect(){
        try{
            conn.close();
        }catch (Exception e){
            System.out.println("Error at disconnect " + e.getMessage());
        }
    }

    // test connection code
//    public static void main(String[] args) {
//        SysConnection c = new SysConnection();
//        c.connect();
//    }
}
