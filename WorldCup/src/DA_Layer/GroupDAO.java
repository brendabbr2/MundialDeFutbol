/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Group;
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
 * @author Datos
 */
public class GroupDAO {
        private String message = "";
    
    public String insertGroup(Connection conn, Group group){
        PreparedStatement pst = null;
        String sql = "CALL insertTeam(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, group.getIdEvent());
            pst.setString(2, group.getName());
            
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Team inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Team not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateGroup(Connection conn, Group group){
        PreparedStatement pst = null;
        String sql = "CALL updateTeam(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, group.getIdGroup());
            pst.setInt(2, group.getIdEvent());
            pst.setString(3, group.getName());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Player Position updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Player Postion not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public String deleteGroup(Connection conn, int idGroup){
        PreparedStatement pst = null;
        String sql = "CALL deleteTeam(?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idGroup);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Player Position deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Player Postion not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public DefaultTableModel getTable(Connection conn){
        String [] columns = {"idGroup", "idEvent","Group Name","creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getTeam(?,?)";
        
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
            System.out.println("Succesfully listed");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to show table playerPosition");

            System.out.println(e.getMessage());
        }
        return model;
    }

    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getTeam(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Group> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Group group = new Group();
                group.setIdGroup(rs.getInt(1));
                group.setName(rs.getString(2));
                group.setIdEvent(rs.getInt(3));
                
                ObjectList.add(group);
            }
            System.out.println("Succesfully listed PlayerPosition");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get PlayerPosition list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }    
}
