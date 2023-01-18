/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.PersonDAO;
import Entities.Person;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class PersonBO {
    private PersonDAO personDAO;
    private String message;
    
    public PersonBO(){
        this.personDAO = new PersonDAO();
        this.message = "";
    }
    public String insertPerson(Person person){
        Connection conn = SysConnection.connect();
        try{
            message = personDAO.insertPerson(conn, person);
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
    public String updatePerson(Person person){
        Connection conn = SysConnection.connect();
        try{
            message = personDAO.uodatePerson(conn, person);
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
    public String deletePerson(int id){
        Connection conn = SysConnection.connect();
        try{
            message = personDAO.deletePerson(conn, id);
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
        DefaultTableModel model = personDAO.getTable(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = personDAO.getList(conn);
        conn.close();
        return list;
    }    
}
