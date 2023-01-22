/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.IdentificationTypeDAO;
import Entities.Demonym;
import Entities.IdentificationType;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class IdentificationTypeBO {
    private IdentificationTypeDAO idTypeDAO;
    private String message;
    
    public IdentificationTypeBO() {
        this.idTypeDAO = new IdentificationTypeDAO();
        message = "";
    }
    
    public String insertIdentificationType(IdentificationType idType){
        Connection conn = SysConnection.connect();
        try{
            message = idTypeDAO.insertIdentificationType(conn, idType);
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
    
    public String updateIdentificationType(IdentificationType idType){
        Connection conn = SysConnection.connect();
        try{
            message = idTypeDAO.updateIdentificationType(conn, idType);
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
    
    public String deleteIdentificationType(int id){
        Connection conn = SysConnection.connect();
        try{
            message = idTypeDAO.deleteIdentificationType(conn, id);
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
        DefaultTableModel model = idTypeDAO.getIdentificationType(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }

    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = idTypeDAO.getList(conn);
        conn.close();
        return list;
    }
    
}
