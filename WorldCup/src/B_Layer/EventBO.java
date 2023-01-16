/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.EventDAO;
import Entities.Event;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jox
 */
public class EventBO {
 
    private EventDAO eventDAO;
    private String message;

    public EventBO() {
        this.eventDAO = new EventDAO();
        this.message = "";
    }
    
    public String insertEvent(Event event){
        Connection conn = SysConnection.connect();
        try{
            message = eventDAO.insertEvent(conn, event);
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
    public String updateEvent(Event event){
        Connection conn = SysConnection.connect();
        try{
            message = eventDAO.updateEvent(conn, event);
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
    public String deleteUser(int id){
        Connection conn = SysConnection.connect();
        try{
            message = eventDAO.deleteEvent(conn, id);
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
    public DefaultTableModel getEvents(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = eventDAO.getEvents(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }

    public ArrayList getUserTypeList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = eventDAO.getList(conn);
        conn.close();
        return list;
    }
}
