/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.DemonymDAO;
import Entities.Demonym;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class DemonymBO {
    private DemonymDAO DemonymDao;
    private String message;

    public DemonymBO() {
        this.DemonymDao = new DemonymDAO();
        message = "";
    }
    
    public String insertDemonym(Demonym demo){
        Connection conn = SysConnection.connect();
        try{
            message = DemonymDao.insertDemonym(conn, demo);
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
    
    public String updateDemonym(Demonym demo){
        Connection conn = SysConnection.connect();
        try{
            message = DemonymDao.updateDemonym(conn, demo);
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
    
    public String deleteDemonym(int id){
        Connection conn = SysConnection.connect();
        try{
            message = DemonymDao.deleteDemonym(conn, id);
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
        DefaultTableModel model = DemonymDao.getDemonym(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = DemonymDao.getList(conn);
        conn.close();
        return list;
    }
    
}
