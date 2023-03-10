/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.ParameterEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class ParameterDAO {
        private String message = "";
    
    public String insertParameter(Connection conn, ParameterEvent parameter){
        PreparedStatement pst = null;
        String sql = "CALL insertParameterEvent(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, parameter.getNameParameter());
            pst.setInt(2, parameter.getValueParameter());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Parameter inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Parameter not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    public String updateParameter(Connection conn, ParameterEvent parameter){
        PreparedStatement pst = null;
        String sql = "CALL updateParameterEvent(?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, parameter.getIdParameter());
            pst.setString(2, parameter.getNameParameter());
            pst.setInt(3, parameter.getValueParameter());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Parameter updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Parameter not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    public String deleteParameter(Connection conn, int idParameter){
        PreparedStatement pst = null;
        String sql = "CALL deleteParameterEvent(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idParameter);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Parameter deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Parameter not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getParameters(Connection conn){
        String [] columns = {"idParameter", "nameParameter", "valueParameter", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getParameterEvent(?,?)";
        
        String [] row = new String[7];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to show table parameter");

            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getParameterEvent(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<ParameterEvent> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                ParameterEvent parameter = new ParameterEvent();
                parameter.setIdParameter(rs.getInt(1));
                parameter.setNameParameter(rs.getString(2));
                parameter.setValueParameter(rs.getInt(3));
                
                ObjectList.add(parameter);
            }
            System.out.println("Succesfully listed Parameter");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get Parameter list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }
}
