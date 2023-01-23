/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.CountryDAO;
import Entities.Country;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class CountryBO {
    private CountryDAO countryDao;
    private String message;

    public CountryBO() {
        this.countryDao = new CountryDAO();
        this.message = "";
    }
    
    public String insertCountry(Country country){
        Connection conn = SysConnection.connect();
        try{
            message = countryDao.insertCountry(conn, country);
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
    public String updateCountry(Country country){
        Connection conn = SysConnection.connect();
        try{
            message = countryDao.updateCountry(conn, country);
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
    public String deleteCountry(int id){
        Connection conn = SysConnection.connect();
        try{
            message = countryDao.deleteCountry(conn, id);
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
    
    public DefaultTableModel getCountrys(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = countryDao.getCountrys(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = countryDao.getList(conn);
        conn.close();
        return list;
    }
}
