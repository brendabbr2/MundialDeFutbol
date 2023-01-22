/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserDAO;
import Entities.User;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    private byte[] hash;

    public UserBO() {
        this.userDao = new UserDAO();
        this.message = "";
    }
    
    public String insertUser(User user) throws NoSuchAlgorithmException{
        encryptPassword(user);
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
    public String updateUser(User user) throws NoSuchAlgorithmException{
        encryptPassword(user);
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
    
    public User verifyUser(User user){
        Connection conn = SysConnection.connect();
        // in [0] we set the idUser
        // in [1] we set the idUserType
        User userVerified = userDao.verifyUser(conn, user);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return userVerified;
    }
    
    public byte[] getHash(String password) throws NoSuchAlgorithmException{
        MessageDigest messageDisgest = MessageDigest.getInstance("SHA-256");
        return hash = messageDisgest.digest(password.getBytes(StandardCharsets.UTF_8));
    }
    
    public void encryptPassword(User user) throws NoSuchAlgorithmException{
        user.setPassword(Hash(getHash(user.getPassword())));
    }
    
    public static String Hash(byte[] hash){
        StringBuffer hexString = new StringBuffer();
        for(int i = 0; i < hash.length; i++){
            String hex = Integer.toHexString(255 & hash[i]);
            if(hex.length() == 1){
                hexString.append('0');
            }
            hexString.append(hex);
        }
        System.out.println(hexString);
        return hexString.toString();
    }
}
