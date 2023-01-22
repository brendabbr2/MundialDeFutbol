/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Address;
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
public class AddressDAO {
    private String message = "";
    
    public String insertAddress(Connection conn, Address address){
        PreparedStatement pst = null;
        String sql = "CALL insertAddress(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, address.getIdDistrict());
            pst.setString(2, address.getNameAddress());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Address inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Address not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateAddress(Connection conn, Address address){
        PreparedStatement pst = null;
        String sql = "CALL updateAddress(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, address.getIdAddress());
            pst.setString(2, address.getNameAddress());
            pst.setInt(3, address.getIdDistrict());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Address updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Address not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteAddress(Connection conn, int idAddress){
        PreparedStatement pst = null;
        String sql = "CALL deleteAddress(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idAddress);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Address deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Address not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getAddresss(Connection conn){
        String [] columns = {"idAddress", "nameAddress", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getAddress(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Address");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
