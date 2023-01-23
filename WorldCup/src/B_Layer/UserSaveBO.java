/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserSaveDAO;
import Entities.UserSave;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserSaveBO {
    private UserSaveDAO usersaveDao;
    private String message;

    public UserSaveBO() {
        this.usersaveDao = new UserSaveDAO();
        this.message = "";
    }

        public String insertUserSave(UserSave usersave){
        Connection conn = SysConnection.connect();
        try{
            message = usersaveDao.insertUserSave(conn, usersave);
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
        
    public String deleteNews(UserSave usersave){
        Connection conn = SysConnection.connect();
        try{
            message = usersaveDao.deleteUserSave(conn, usersave);
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
    
    public DefaultTableModel getUserSaveMostVoted(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = usersaveDao.getUserSaveMostVoted(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
