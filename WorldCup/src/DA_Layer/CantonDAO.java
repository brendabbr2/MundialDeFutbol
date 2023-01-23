/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Canton;
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
public class CantonDAO {
    private String message = "";
    
    public String insertCanton(Connection conn, Canton canton){
        PreparedStatement pst = null;
        String sql = "CALL insertCanton(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, canton.getIdProvince());
            pst.setString(2, canton.getNameCanton());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Canton inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Canton not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateCanton(Connection conn, Canton canton){
        PreparedStatement pst = null;
        String sql = "CALL updateCanton(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, canton.getIdCanton());
            pst.setString(2, canton.getNameCanton());
            pst.setInt(3, canton.getIdProvince());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Canton updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Canton not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteCanton(Connection conn, int idCanton){
        PreparedStatement pst = null;
        String sql = "CALL deleteCanton(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idCanton);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Canton deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Canton not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getCantons(Connection conn){
        String [] columns = {"ID", "Canton","Province", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getCanton(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Canton");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
