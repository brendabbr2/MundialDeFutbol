/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.HelperTypeDAO;
import Entities.HelperType;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class HelperTypeBO {
    private HelperTypeDAO HelperTypeDAO;
    private String message;
    
    public HelperTypeBO() {
        this.HelperTypeDAO = new HelperTypeDAO();
        this.message = "";
    }
    
    public String insertHelperType(HelperType data){
        Connection conn = SysConnection.connect();
        try{
            message = HelperTypeDAO.insertHelperType(conn, data);
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
    
        public String updateHelperType(HelperType data){
        Connection conn = SysConnection.connect();
        try{
            message = HelperTypeDAO.updateHelperType(conn, data);
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
    public String deleteHelperType(int id){
        Connection conn = SysConnection.connect();
        try{
            message = HelperTypeDAO.deleteHelperType(conn, id);
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
    public DefaultTableModel getHelperType(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = HelperTypeDAO.getHelperType(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
