/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserDAO;
import Entities.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jox
 */
public class UserBO {
    
    private UserDAO userDao;
    private String message;

    public UserBO() {
        this.userDao = new UserDAO();
        this.message = "";
    }
    
    public String insertUser(User user){
        Connection conn = SysConnection.connect();
        try{
            message = userDao.insertUser(conn, user);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close(); 
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }
    public String updateUser(User user){
        Connection conn = SysConnection.connect();
        try{
            message = userDao.updateUser(conn, user);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close(); 
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }
    public String deleteUser(int id){
        Connection conn = SysConnection.connect();
        try{
            message = userDao.deleteUser(conn, id);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            try {
                if (conn != null){
                    conn.close(); 
                }
            } catch (Exception e) {
                message = message + " " + e.getMessage();
            }
        }
        return message;
    }
    public DefaultTableModel getUsers(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = userDao.getUsers(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    public int verifyUser(User user){
        Connection conn = SysConnection.connect();
        int idUserType = userDao.verifyUser(conn, user);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return idUserType;
    }
}
