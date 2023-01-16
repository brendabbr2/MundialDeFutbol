/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.CantonDAO;
import Entities.Canton;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class CantonBO {
    private CantonDAO cantonDao;
    private String message;

    public CantonBO() {
        this.cantonDao = new CantonDAO();
        this.message = "";
    }
    
    public String insertCanton(Canton canton){
        Connection conn = SysConnection.connect();
        try{
            message = cantonDao.insertCanton(conn, canton);
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
    public String updateCanton(Canton canton){
        Connection conn = SysConnection.connect();
        try{
            message = cantonDao.updateCanton(conn, canton);
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
    public String deleteCanton(int id){
        Connection conn = SysConnection.connect();
        try{
            message = cantonDao.deleteCanton(conn, id);
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
    
    public DefaultTableModel getCantons(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = cantonDao.getCantons(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
