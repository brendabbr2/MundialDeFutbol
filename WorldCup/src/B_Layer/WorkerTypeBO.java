/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.WorkerTypeDAO;
import Entities.WorkerType;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class WorkerTypeBO {
    private WorkerTypeDAO workerDAO;
    private String message;

    public WorkerTypeBO() {
        this.workerDAO = new WorkerTypeDAO();
        this.message = "";
    }
    
    
    public String insertWorkerType(WorkerType worker){
        Connection conn = SysConnection.connect();
        try{
            message = workerDAO.insertWorkerType(conn, worker);
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
    
    public String updateWorkerType(WorkerType user){
        Connection conn = SysConnection.connect();
        try{
            message = workerDAO.updateWorkerType(conn, user);
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
    public String deleteWorkerType(int id){
        Connection conn = SysConnection.connect();
        try{
            message = workerDAO.deleteWorkerType(conn, id);
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
    public DefaultTableModel getWorkerType(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = workerDAO.getWorkerTypes(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
