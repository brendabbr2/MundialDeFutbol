/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.GroupDAO;
import DA_Layer.TeamDAO;
import Entities.Group;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class GroupBO {
    private GroupDAO groupDAO;
    private String message;

    public GroupBO() {
        this.groupDAO = new GroupDAO();
        this.message = "";
    }
    
    public String insertGroup(Group group){
        Connection conn = SysConnection.connect();
        try{
            message = groupDAO.insertGroup(conn, group);
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
    
    public String updateGroup(Group group){
        Connection conn = SysConnection.connect();
        try{
            message = groupDAO.updateGroup(conn, group);
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
    
        public String deleteGroup(Group group){
        Connection conn = SysConnection.connect();
        try{
            message = groupDAO.deleteGroup(conn, group.getIdGroup());
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
        DefaultTableModel model = groupDAO.getTable(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = groupDAO.getList(conn);
        conn.close();
        return list;
    }
}
