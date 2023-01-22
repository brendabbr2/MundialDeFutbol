/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.HelperDAO;
import Entities.Helper;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class HelperBO {
    private HelperDAO helperDao;
    private String message;

    public HelperBO() {
        this.helperDao = new HelperDAO();
        this.message = "";
    }
    
    public String insertHelper(Helper helper){
        Connection conn = SysConnection.connect();
        try{
            message = helperDao.insertHelper(conn, helper);
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
    public String updateHelper(Helper helper){
        Connection conn = SysConnection.connect();
        try{
            message = helperDao.updateHelper(conn, helper);
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
    public String deleteHelper(int id){
        Connection conn = SysConnection.connect();
        try{
            message = helperDao.deleteHelper(conn, id);
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
    
    public DefaultTableModel getHelpers(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = helperDao.getHelpers(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
