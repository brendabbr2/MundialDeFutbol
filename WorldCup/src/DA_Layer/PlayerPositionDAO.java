/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.PlayerPosition;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class PlayerPositionDAO {
    private String message = "";
    
    public String insertPlayerPosition(Connection conn, PlayerPosition playerposition){
        PreparedStatement pst = null;
        String sql = "CALL insertPlayerPosition(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, playerposition.getPlayerPositionName());
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
    
    public String updatePlayerPosition(Connection conn, PlayerPosition playerposition){
        PreparedStatement pst = null;
        String sql = "CALL updatePlayerPosition(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, playerposition.getIdPlayerPosition());
            pst.setString(2, playerposition.getPlayerPositionName());
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    public String deletePlayerPosition(Connection conn, int idPlayerPosition){
        PreparedStatement pst = null;
        String sql = "CALL deletePlayerPosition(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idPlayerPosition);
            
            pst.execute();
            message = "Succesfully deleted";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
        }
        return message;
    }
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getPlayerPositions(Connection conn){
        String [] columns = {"idPlayerPosition", "playerPositionName", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getPlayerPosition(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Player Position");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
