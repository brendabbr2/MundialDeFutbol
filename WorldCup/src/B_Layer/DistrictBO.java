/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.DistrictDAO;
import Entities.District;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class DistrictBO {
    private DistrictDAO districtDao;
    private String message;

    public DistrictBO() {
        this.districtDao = new DistrictDAO();
        this.message = "";
    }
    
    public String insertDistrict(District district){
        Connection conn = SysConnection.connect();
        try{
            message = districtDao.insertDistrict(conn, district);
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
    public String updateDistrict(District district){
        Connection conn = SysConnection.connect();
        try{
            message = districtDao.updateDistrict(conn, district);
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
    public String deleteDistrict(int id){
        Connection conn = SysConnection.connect();
        try{
            message = districtDao.deleteDistrict(conn, id);
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
    
    public DefaultTableModel getDistricts(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = districtDao.getDistricts(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(int idProvince){
        Connection conn = SysConnection.connect();
        ArrayList list = districtDao.getList(conn,idProvince);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
}
