/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Lineup;
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
public class LineupDAO {
        
    private String message = "";
    
    public String insertLineup(Connection conn, Lineup lineup){
        PreparedStatement pst = null;
        String sql = "CALL insertLineup(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, lineup.getNameLineup());
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
    public String updateLineup(Connection conn, Lineup lineup){
        PreparedStatement pst = null;
        String sql = "CALL updateLineup(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, lineup.getIdLineup());
            pst.setString(2, lineup.getNameLineup());
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    public String deleteLineup(Connection conn, int idLineup){
        PreparedStatement pst = null;
        String sql = "CALL deleteLineup(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idLineup);
            
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
    public DefaultTableModel getLineups(Connection conn){
        String [] columns = {"idLineup", "nameLineup", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getLineup(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show Lineup");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
