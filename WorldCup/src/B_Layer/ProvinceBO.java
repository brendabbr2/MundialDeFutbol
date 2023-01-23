/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.ProvinceDAO;
import Entities.Province;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class ProvinceBO {
    private ProvinceDAO provinceDAO;
    private String message;
    
    public ProvinceBO(){
        this.provinceDAO = new ProvinceDAO();
        this.message = "";
    }
    
    public String insertProvince(Province province){
        Connection conn = SysConnection.connect();
        try{
            message = provinceDAO.insertProvince(conn, province);
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
    
    public String updateProvince(Province province){
        Connection conn = SysConnection.connect();
        try{
            message = provinceDAO.updateProvince(conn, province);
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
    
    public DefaultTableModel getTable(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = provinceDAO.getTable(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = provinceDAO.getList(conn);
        conn.close();
        return list;
    }
}
