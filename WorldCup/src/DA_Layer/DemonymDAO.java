/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Demonym;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class DemonymDAO {
    private String message = "";
    
    public String insertDemonym(Connection conn, Demonym demonym){
        PreparedStatement pst = null;
        String sql = "CALL insertDemonym(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, demonym.getNameDemonym());
     
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Demonym inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Demonym not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updateDemonym(Connection conn, Demonym demo){
        PreparedStatement pst = null;
        String sql = "CALL updateDemonym(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, demo.getIdDemonym());
            pst.setString(2, demo.getNameDemonym());
            System.out.println(demo.toString());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Demonym updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Demonym not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
        public String deleteDemonym(Connection conn, int idDemonym){
        PreparedStatement pst = null;
        String sql = "CALL deleteDemonym(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idDemonym);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Demonym deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Demonym not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
        
     public DefaultTableModel getDemonym(Connection conn){
        String [] columns = {"idDemonym", "Demonym Name", "Creation User", "Creation Date","Modification User","Modification Date"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getDemonym(?,?)";
        
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
            JOptionPane.showMessageDialog(null, "Unable to show table Demonym");
            System.out.println(e.getMessage());
        }
        
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getDemonym(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Demonym> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Demonym demo = new Demonym();
                demo.setIdDemonym(rs.getInt(1));
                demo.setNameDemonym(rs.getString(2));
                
                ObjectList.add(demo);
            }
            System.out.println("Succesfully listed Demonym");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get Demonym list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
 }
