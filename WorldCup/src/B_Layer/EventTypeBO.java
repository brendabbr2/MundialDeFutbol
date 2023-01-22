/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.EventTypeDAO;
import Entities.EventType;
import Entities.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class EventTypeBO {
    private EventTypeDAO EtypeDao;
    private String message;

    public EventTypeBO() {
        this.EtypeDao = new EventTypeDAO();
        this.message = "";
    }
    
        public String insertEventType(EventType Etype){
        Connection conn = SysConnection.connect();
        try{
            message = EtypeDao.insertEventType(conn, Etype);
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
        
        public String updateEventType(EventType Etype){
        Connection conn = SysConnection.connect();
        try{
            message = EtypeDao.updateEventType(conn, Etype);
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
    public String deleteEventType(int id){
        Connection conn = SysConnection.connect();
        try{
            message = EtypeDao.deleteEventType(conn, id);
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
    public DefaultTableModel getEventTypes(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = EtypeDao.getEventType(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getUserTypeList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = EtypeDao.getList(conn);
        conn.close();
        return list;
    }
}
