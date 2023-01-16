/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserTypeDAO;
import Entities.UserType;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserTypeBO {
    private UserTypeDAO usertypeDao;
    private String message;

    public UserTypeBO() {
        this.usertypeDao = new UserTypeDAO();
        this.message = "";
    }
    
    public String insertUserType(UserType usertype){
        Connection conn = SysConnection.connect();
        System.out.println("primero");
        try{
            System.out.println("Pasamos aca");
            message = usertypeDao.insertUserType(conn, usertype);
        }catch (Exception e){
            message = message + " " + e.getMessage();
        }finally{
            System.out.println("Segundo");
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
    public String updateUserType(UserType usertype){
        Connection conn = SysConnection.connect();
        try{
            message = usertypeDao.updateUserType(conn, usertype);
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
    public String deleteUserType(int id){
        Connection conn = SysConnection.connect();
        try{
            message = usertypeDao.deleteUserType(conn, id);
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
    public DefaultTableModel getUserTypes(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = usertypeDao.getUserTypes(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getUserTypeList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = usertypeDao.getList(conn);
        conn.close();
        return list;
    }
}
