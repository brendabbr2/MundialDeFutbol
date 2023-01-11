/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;


import Entities.WorkerType;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class WorkerTypeDAO {
    private String message = "";
    
    public String insertWorkerType(Connection conn, WorkerType worker){
        PreparedStatement pst = null;
        String sql = "CALL insertWorkerType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, worker.getNameWorkerType());
     
            pst.execute();
            message = "Succesfully saved";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
        }
        return message;
    }
    
        public String updateWorkerType(Connection conn, WorkerType worker){
        PreparedStatement pst = null;
        String sql = "CALL updateWorkerType(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, worker.getIdWorkerType());
            pst.setString(2, worker.getNameWorkerType());
            
            pst.execute();
            message = "Succesfully updated";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
        }
        return message;
    }
    public String deleteWorkerType(Connection conn, int idWorker){
        PreparedStatement pst = null;
        String sql = "CALL deleteWorkerType(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idWorker);
            
            pst.execute();
            message = "Succesfully deleted";
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
        }
        return message;
    }
    
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getWorkerTypes(Connection conn){
        String [] columns = {"idWorkertype", "Name", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getWorkerType(?,?)";
        
        String [] row = new String[6];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to show table");
            System.out.println(e.getMessage());
        }
        return model;
    }
    
}
