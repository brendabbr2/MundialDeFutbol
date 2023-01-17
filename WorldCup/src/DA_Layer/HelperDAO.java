/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Helper;
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
public class HelperDAO {
    private String message = "";
    
    public String insertHelper(Connection conn, Helper helper){
        PreparedStatement pst = null;
        String sql = "CALL insertHelper(?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, helper.getIdHelper());
            pst.setInt(2, helper.getIdTeam());
            pst.setInt(3, helper.getIdHelperType());
            pst.setString(4, helper.getHireDate());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Helper inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Helper not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateHelper(Connection conn, Helper helper){
        PreparedStatement pst = null;
        String sql = "CALL updateHelper(?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, helper.getIdHelper());
            pst.setInt(2, helper.getIdTeam());
            pst.setInt(3, helper.getIdHelperType());
            pst.setString(4, helper.getHireDate());
            pst.setInt(5, helper.getIdEvent());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Helper updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Helper not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteHelper(Connection conn, int idHelper){
        PreparedStatement pst = null;
        String sql = "CALL deleteHelper(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idHelper);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Helper deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Helper not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getHelpers(Connection conn){
        String [] columns = {"idHelper", "idTeam", "idHelperType", "hireDate", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getHelper(?,?)";
        
        String [] row = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table Helper");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
