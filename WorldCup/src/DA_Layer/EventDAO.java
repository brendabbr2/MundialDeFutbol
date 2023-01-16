/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Event;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jox
 */
public class EventDAO {
private String message = "";
    
    public String insertEvent(Connection conn, Event event){
        PreparedStatement pst = null;
        String sql = "CALL insertEvent(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, event.getIdEvenType());
            pst.setString(2, event.getName());
     
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Event inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Event not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateEvent(Connection conn, Event event){
        PreparedStatement pst = null;
        String sql = "CALL updateEvent(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, event.getIdEvent());
            pst.setInt(2, event.getIdEvenType());
            pst.setString(3, event.getName());
            
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Event updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Event not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    public String deleteEvent(Connection conn, int idEvent){
        PreparedStatement pst = null;
        String sql = "CALL deleteEvent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idEvent);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Event deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Event not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getEvents(Connection conn){
        String [] columns = {"idEvent", "Event Type", "Name", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getEvent(?,?)";
        
        String [] row = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed table Events");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table Events"
                    , null, JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getEvent(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Event> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Event event = new Event();
                event.setIdEvenType(rs.getInt(1));
                event.setIdEvent(rs.getInt(2));
                event.setName(rs.getString(3));
                
                ObjectList.add(event);
            }
            System.out.println("Succesfully listed Event");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get Event list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
}
