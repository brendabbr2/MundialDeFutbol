/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DA_Layer;

import Entities.Country;
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
 * @author david
 */
public class CountryDAO {
    private String message = "";
    
    public String insertCountry(Connection conn, Country country){
        PreparedStatement pst = null;
        String sql = "CALL insertCountry(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, country.getIdContinent());
            pst.setInt(2, country.getIdDemonym());
            pst.setString(3, country.getNameCountry());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Country inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Country not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateCountry(Connection conn, Country country){
        PreparedStatement pst = null;
        String sql = "CALL updateCountry(?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, country.getIdCountry());
            pst.setString(2, country.getNameCountry());
            pst.setInt(3, country.getIdDemonym());
            pst.setInt(4, country.getIdContinent());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Country updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Country not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteCountry(Connection conn, int idCountry){
        PreparedStatement pst = null;
        String sql = "CALL deleteCountry(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idCountry);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Country deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Country not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getCountrys(Connection conn){
        String [] columns = {"ID", "Continent","Country","Demonym", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getCountry(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Country");
            System.out.println(e.getMessage());
        }
        return model;
    }
    /*
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getCountry(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Country> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Country country = new Country();
                country.setIdCountry(rs.getInt(1));
                country.set.getString(2));
                
                ObjectList.add(demo);
            }
            System.out.println("Succesfully listed Demonym");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get Demonym list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }*/
}
