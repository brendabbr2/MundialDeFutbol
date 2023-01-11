/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.ParameterEvent;
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
public class ParameterDAO {
        private String message = "";
    
    public String insertParameter(Connection conn, ParameterEvent lineup){
        PreparedStatement pst = null;
        String sql = "CALL insertParameterEvent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, lineup.getIdParameter());
            pst.setString(2, lineup.getNameParameter());
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
    public String updateParameter(Connection conn, ParameterEvent lineup){
        PreparedStatement pst = null;
        String sql = "CALL updateParameterEvent(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, lineup.getIdParameter());
            pst.setString(2, lineup.getNameParameter());
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    public String deleteParameter(Connection conn, int idParameter){
        PreparedStatement pst = null;
        String sql = "CALL deleteParameterEvent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idParameter);
            
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
    public DefaultTableModel getParameters(Connection conn){
        String [] columns = {"idParameter", "nameParameter", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getParameterEvent(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
