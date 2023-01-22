/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;


import Entities.SportMatch;
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
 * @author Datos
 */
public class SportMatchDAO {
    private String message = "";
    
    public String insertSportMatch(Connection conn, SportMatch sportMatch){
        PreparedStatement pst = null;
        String sql = "CALL insertSportMatch(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, sportMatch.getIdEvent());
            
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Team inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Team not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String DeleteSportMatch(Connection conn,SportMatch sportMatch){
        PreparedStatement pst = null;
        String sql = "CALL deleteSportMatch(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, sportMatch.getIdSportMatch());
            
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Team inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Team not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
public DefaultTableModel getTable(Connection conn){
        String [] columns = {"idSportsMatch", "idEvent","creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getSportMatch(?,?)";
        
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

            JOptionPane.showMessageDialog(null, "Unable to show table playerPosition");

            System.out.println(e.getMessage());
        }
        return model;
    }

    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getSportMatch(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<SportMatch> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                SportMatch sportMatch = new SportMatch();
                sportMatch.setIdSportMatch(rs.getInt(1));
                sportMatch.setIdEvent(rs.getInt(2));
                
                ObjectList.add(sportMatch);
            }
            System.out.println("Succesfully listed PlayerPosition");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get PlayerPosition list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }    
}
