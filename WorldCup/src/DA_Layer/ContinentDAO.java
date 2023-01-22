/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Continent;
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
public class ContinentDAO {

    private String message = "";
    
    public String insertContinent(Connection conn, Continent continent){
        PreparedStatement pst = null;
        String sql = "CALL insertContinent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, continent.getNameContinent());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Continent inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Continent not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateContinent(Connection conn, Continent continent){
        PreparedStatement pst = null;
        String sql = "CALL updateContinent(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, continent.getIdContinent());
            pst.setString(2, continent.getNameContinent());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Continent updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Continent not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    public String deleteContinent(Connection conn, int idContinent){
        PreparedStatement pst = null;
        String sql = "CALL deleteContinent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idContinent);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Continent deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Continent not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getContinents(Connection conn){
        String [] columns = {"idContinent", "Continent Name", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getContinent(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Continent");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
