/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.UserType;
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
public class UserTypeDAO {
    private String message = "";
    
    public String insertUserType(Connection conn, UserType usertype){
        PreparedStatement pst = null;
        String sql = "CALL insertUserType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usertype.getNameUserType());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "User Type inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "User Type not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateUserType(Connection conn, UserType usertype){
        PreparedStatement pst = null;
        String sql = "CALL updateUserType(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, usertype.getIdUserType());
            pst.setString(2, usertype.getNameUserType());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "User Type updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "User Type not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteUserType(Connection conn, int idUserType){
        PreparedStatement pst = null;
        String sql = "CALL deleteUserType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idUserType);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "User Type deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "User Type not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getUserTypes(Connection conn){
        String [] columns = {"idUserType", "nameUserType", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getUserType(?,?)";
        
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

            JOptionPane.showMessageDialog(null, "Unable to show table User Type");

            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getUserType(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<UserType> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                UserType user = new UserType();
                user.setIdUserType(rs.getInt(1));
                user.setNameUserType(rs.getString(2));
                
                ObjectList.add(user);
            }
            System.out.println("Succesfully listed UserType");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get UserType list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
    
}
