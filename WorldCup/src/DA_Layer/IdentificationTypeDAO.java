/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.IdentificationType;
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
public class IdentificationTypeDAO {
    private String message = "";
    public String insertIdentificationType(Connection conn, IdentificationType idType){
        PreparedStatement pst = null;
        String sql = "CALL insertIdentificationType(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, idType.getIdName());
            pst.setInt(1, idType.getIdMask());
     
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Identification Type"
                    + " inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Identification Type not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateIdentificationType(Connection conn, IdentificationType idType){
        PreparedStatement pst = null;
        String sql = "CALL updateIdentificationType(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idType.getIdIdentificationType());
            pst.setString(2, idType.getIdName());
            pst.setInt(3, idType.getIdMask());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Identification Type"
                    + " updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Identification Type not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
        public String deleteIdentificationType(Connection conn, int idDemonym){
        PreparedStatement pst = null;
        String sql = "CALL deleteIdentificationType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idDemonym);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Identification Type"
                    + " deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Identification Type not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
        
     public DefaultTableModel getIdentificationType(Connection conn){
        String [] columns = {"idIdentificationType", "IdentificationType Name", "Mask", "Creation User", "Creation Date","Modification User","Modification Date"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getIdentificationType(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table idType");

            System.out.println(e.getMessage());
        }
        
        return model;
    }   
    
     public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getIdentificationType(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<IdentificationType> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                IdentificationType idType = new IdentificationType();
                idType.setIdIdentificationType(rs.getInt(1));
                idType.setIdName(rs.getString(2));
                idType.setIdMask(rs.getInt(3));
                
                ObjectList.add(idType);
            }
            System.out.println("Succesfully listed identificationType");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get identificationType list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
    
}
