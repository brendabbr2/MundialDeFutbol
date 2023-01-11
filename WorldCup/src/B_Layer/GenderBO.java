/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.GenderDAO;
import Entities.Gender;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class GenderBO {
    
    private GenderDAO genderDao;
    private String message;

    public GenderBO() {
        this.genderDao = new GenderDAO();
        this.message = "";
    }
    
    public String insertGender(Gender gender){
        Connection conn = SysConnection.connect();
        try{
            message = genderDao.insertGender(conn, gender);
            System.out.println("Todo bien mi pana");
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
    public String updateGender(Gender gender){
        Connection conn = SysConnection.connect();
        try{
            message = genderDao.updateGender(conn, gender);
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
    public String deleteGender(int id){
        Connection conn = SysConnection.connect();
        try{
            message = genderDao.deleteGender(conn, id);
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
    public DefaultTableModel getGenders(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = genderDao.getGenders(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
