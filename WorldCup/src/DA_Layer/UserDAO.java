/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Connection.SysConnection;
import Entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public void getUser(){

    }
}
