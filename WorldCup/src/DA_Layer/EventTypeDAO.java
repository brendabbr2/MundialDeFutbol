/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.EventType;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class EventTypeDAO {
    private String message = "";
    
        public String insertEventType(Connection conn, EventType etype){
        PreparedStatement pst = null;
        String sql = "CALL insertEventType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, etype.getName());
     
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
        
    public String updateEventType(Connection conn, EventType etype){
        PreparedStatement pst = null;
        String sql = "CALL updateEventType(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, etype.getIdEvenType());
            pst.setString(2, etype.getName());
            
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    
        public String deleteEventType(Connection conn, int idEtype){
        PreparedStatement pst = null;
        String sql = "CALL deleteEventType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idEtype);
            
            pst.execute();
            message = "Succesfully deleted";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
        }
        return message;
    }
        
        public DefaultTableModel getEventType(Connection conn){
        String [] columns = {"idEventType", "nameEventType", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getEventType(?,?)";
        
        String [] row = new String[6];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table event type");
            System.out.println(e.getMessage());
        }
        
        return model;
    }
}
