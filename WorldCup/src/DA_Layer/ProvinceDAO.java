/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Country;
import Entities.Province;
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
public class ProvinceDAO {
    private String message = "";
    
    public String insertProvince(Connection conn, Province province){
        PreparedStatement pst = null;
        String sql = "CALL insertProvince(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, province.getIdCountry());
            pst.setString(2, province.getNameProvince());
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
    
    public String updateProvince(Connection conn, Province province){
        PreparedStatement pst = null;
        String sql = "CALL updateProvince(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, province.getIdProvince());
            pst.setString(2, province.getNameProvince());
            pst.setInt(3, province.getIdCountry());
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
    public DefaultTableModel getTable(Connection conn){
        String [] columns = {"ID","Country", "Province", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getProvince(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Province");
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getProvince(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Province> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Province province = new Province();
                province.setIdProvince(rs.getInt(1));
                province.setIdCountry(rs.getInt(2));
                province.setNameProvince(rs.getString(3));
                
                ObjectList.add(province);
            }
            System.out.println("Succesfully listed Demonym");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get Demonym list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
}
