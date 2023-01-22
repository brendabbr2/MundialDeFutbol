/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.SportMatchDAO;
import Entities.SportMatch;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class SportMatchBO {
    private SportMatchDAO sportMatchDAO;
    private String message;

    public SportMatchBO() {
        this.sportMatchDAO = new SportMatchDAO();
        this.message = "";
    }
    
    public String insertSportMatch(SportMatch sportMatch){
        Connection conn = SysConnection.connect();
        try{
            message = sportMatchDAO.insertSportMatch(conn, sportMatch);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close(); 
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }    
    
    public String deleteSportMatch(SportMatch sportMatch){
        Connection conn = SysConnection.connect();
        try{
            message = sportMatchDAO.insertSportMatch(conn, sportMatch);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close(); 
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }
            
    public DefaultTableModel getTable(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = sportMatchDAO.getTable(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = sportMatchDAO.getList(conn);
        conn.close();
        return list;
    }
}
