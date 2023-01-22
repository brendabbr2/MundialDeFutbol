/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.AddressDAO;
import Entities.Address;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class AddressBO {
    private AddressDAO addressDao;
    private String message;

    public AddressBO() {
        this.addressDao = new AddressDAO();
        this.message = "";
    }
    
    public String insertAddress(Address address){
        Connection conn = SysConnection.connect();
        try{
            message = addressDao.insertAddress(conn, address);
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
    public String updateAddress(Address address){
        Connection conn = SysConnection.connect();
        try{
            message = addressDao.updateAddress(conn, address);
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
    public String deleteAddress(int id){
        Connection conn = SysConnection.connect();
        try{
            message = addressDao.deleteAddress(conn, id);
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
    
    public DefaultTableModel getAddresss(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = addressDao.getAddresss(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
