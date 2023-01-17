/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.WorkerDAO;
import Entities.Worker;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class WorkerBO {
    private WorkerDAO workerDao;
    private String message;

    public WorkerBO() {
        this.workerDao = new WorkerDAO();
        this.message = "";
    }
    
    public String insertWorker(Worker worker){
        Connection conn = SysConnection.connect();
        try{
            message = workerDao.insertWorker(conn, worker);
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
    public String updateWorker(Worker worker){
        Connection conn = SysConnection.connect();
        try{
            message = workerDao.updateWorker(conn, worker);
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
    public String deleteWorker(int id){
        Connection conn = SysConnection.connect();
        try{
            message = workerDao.deleteWorker(conn, id);
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
    
    public DefaultTableModel getWorkers(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = workerDao.getWorkers(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
