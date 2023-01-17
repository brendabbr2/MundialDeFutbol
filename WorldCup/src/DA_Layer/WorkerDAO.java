/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Worker;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class WorkerDAO {
    private String message = "";
    
    public String insertWorker(Connection conn, Worker worker){
        PreparedStatement pst = null;
        String sql = "CALL insertWorker(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, worker.getIdWorkerType());
            pst.setString(2, worker.getHireDate());
            pst.setInt(3, worker.getIdEvent());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Worker inserted correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Worker not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateWorker(Connection conn, Worker worker){
        PreparedStatement pst = null;
        String sql = "CALL updateWorker(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, worker.getIdWorker());
            pst.setInt(2, worker.getIdEvent());
            pst.setString(3, worker.getHireDate());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Worker updated correctly");
            pst.close();
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Worker not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String deleteWorker(Connection conn, int idWorker){
        PreparedStatement pst = null;
        String sql = "CALL deleteWorker(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idWorker);
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Worker deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Worker not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getWorkers(Connection conn){
        String [] columns = {"idWorker", "idWorkerType", "idEvent", "hireDate", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getWorker(?,?)";
        
        String [] row = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table Worker");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
