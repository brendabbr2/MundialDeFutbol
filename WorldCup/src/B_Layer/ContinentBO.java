/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.ContinentDAO;
import Entities.Continent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ContinentBO {
    private ContinentDAO continentDao;
    private String message;

    public ContinentBO() {
        this.continentDao = new ContinentDAO();
        this.message = "";
    }
    
    public String insertContinent(Continent continent){
        Connection conn = SysConnection.connect();
        try{
            message = continentDao.insertContinent(conn, continent);
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
    public String updateContinent(Continent continent){
        Connection conn = SysConnection.connect();
        try{
            message = continentDao.updateContinent(conn, continent);
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
    public String deleteContinent(int id){
        Connection conn = SysConnection.connect();
        try{
            message = continentDao.deleteContinent(conn, id);
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
    
    public DefaultTableModel getContinents(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = continentDao.getContinents(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
