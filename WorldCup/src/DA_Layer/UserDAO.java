/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Connection.SysConnection;
import Entities.User;
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
 * @author jox
 */
public class UserDAO {
    
    private String message = "";
    
    public String insertUser(Connection conn, User user){
        PreparedStatement pst = null;
        String sql = "CALL insertUserPerson(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, user.getIdUserType());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getPassword());
     
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
    
    public String updateUser(Connection conn, User user){
        PreparedStatement pst = null;
        String sql = "CALL updateUserPerson(?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, user.getIdUser());
            pst.setInt(2, user.getIdUserType());
            pst.setString(3, user.getUsername());
            pst.setString(4, user.getPassword());
            
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    public String deleteUser(Connection conn, int idUser){
        PreparedStatement pst = null;
        String sql = "CALL deleteUserPerson(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idUser);
            
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
    public DefaultTableModel getUsers(Connection conn){
        String [] columns = {"idUser", "userType", "username", "password", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getUserPerson(?,?)";
        
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
            System.out.println("Succesfully listed table users");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table User");
            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public User verifyUser(Connection conn, User user){
        
        CallableStatement statement = null;
        
        String sql = "CALL verifyUserPerson(?,?,?)";
        
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.registerOutParameter(3, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(3);
            
            if (rs.next()){
                if (rs.getString(1) != null){
                    user.setIdUser(rs.getInt(1));
                    user.setIdUserType(rs.getInt(2));
                }
                
            }
            
            System.out.println("Succesfully verified");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return user;
    }
}
