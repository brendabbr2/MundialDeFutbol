/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.ParameterDAO;
import Entities.ParameterEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ParameterBO {
    private ParameterDAO parameterDao;
    private String message;

    public ParameterBO() {
        this.parameterDao = new ParameterDAO();
        this.message = "";
    }
    
    public String insertParameter(ParameterEvent parameter){
        Connection conn = SysConnection.connect();
        try{
            message = parameterDao.insertParameter(conn, parameter);
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
    public String updateParameter(ParameterEvent parameter){
        Connection conn = SysConnection.connect();
        try{
            message = parameterDao.updateParameter(conn, parameter);
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
    public String deleteParameter(int id){
        Connection conn = SysConnection.connect();
        try{
            message = parameterDao.deleteParameter(conn, id);
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
    public DefaultTableModel getParameters(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = parameterDao.getParameters(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
