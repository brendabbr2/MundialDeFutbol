/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.District;
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
public class DistrictDAO {
    private String message = "";
    
    public String insertDistrict(Connection conn, District district){
        PreparedStatement pst = null;
        String sql = "CALL insertDistrict(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, district.getIdCanton());
            pst.setString(2, district.getNameDistrict());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "District inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "District not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateDistrict(Connection conn, District district){
        PreparedStatement pst = null;
        String sql = "CALL updateDistrict(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, district.getIdDistrict());
            pst.setString(2, district.getNameDistrict());
            pst.setInt(3, district.getIdCanton());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "District updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "District not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteDistrict(Connection conn, int idDistrict){
        PreparedStatement pst = null;
        String sql = "CALL deleteDistrict(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idDistrict);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "District deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "District not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getDistricts(Connection conn){
        String [] columns = {"idDistrict", "nameDistrict", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getDistrict(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table District");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
