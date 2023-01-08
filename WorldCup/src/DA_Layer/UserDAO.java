/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Connection.SysConnection;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            message = "Succesfully saved";
            pst.execute();
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
            
            message = "Succesfully updated";
            pst.execute();
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
            
            message = "Succesfully deleted";
            pst.execute();
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
        }
        return message;
    }
    public DefaultTableModel getUser(Connection conn){
        String [] columns = {"idUser", "userType", "username", "password"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        String sql = "CALL getUser(?)";
        
        String [] row = new String[5];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    row[i] = rs.getString(i+1);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table");
        }
        
        return model;
    }
}
