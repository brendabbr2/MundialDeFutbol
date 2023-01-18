/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Team;
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
public class TeamDAO {
    private String message = "";
    
    public String insertTeam(Connection conn, Team team){
        PreparedStatement pst = null;
        String sql = "CALL insertTeam(?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, team.getIdGroup());
            pst.setInt(2, team.getIdCountry());
            pst.setInt(3, team.getIdEvent());
            pst.setInt(4, team.getLineup());
            pst.setInt(5, team.getCaptainNumber());
            pst.setString(6, team.getLogoPhoto());
            
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
    
    public String updateTeam(Connection conn, Team team){
        PreparedStatement pst = null;
        String sql = "CALL updateTeam(?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, team.getIdTeam());
            pst.setInt(2, team.getIdGroup());
            pst.setInt(3, team.getIdCountry());
            pst.setInt(4, team.getIdEvent());
            pst.setInt(5, team.getLineup());
            pst.setInt(6, team.getCaptainNumber());
            pst.setString(7, team.getLogoPhoto());
            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "Player Position updated correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Player Postion not updated"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public String deleteTeam(Connection conn, int idTeam){
        PreparedStatement pst = null;
        String sql = "CALL deleteTeam(?,?,?,?,?,?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idTeam);
            
            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "Player Position deleted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Player Postion not deleted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public DefaultTableModel getTeamTable(Connection conn){
        String [] columns = {"idTeam", "idGroup","idCountry","idEvent","idLineup","Captain Number", "Team Photo", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getTeam(?,?)";
        
        String [] row = new String[11];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            while (rs.next()) {
                for (int i = 0; i < 11; i++) {
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
        String sql = "CALL getTeam(?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Team> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Team team = new Team();
                team.setIdTeam(rs.getInt(1));
                team.setIdGroup(rs.getInt(2));
                team.setIdCountry(rs.getInt(3));
                team.setIdEvent(rs.getInt(4));
                team.setLineup(rs.getInt(5));
                team.setCaptainNumber(rs.getInt(6));
                team.setLogoPhoto(rs.getString(7));
                
                ObjectList.add(team);
            }
            System.out.println("Succesfully listed PlayerPosition");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get PlayerPosition list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }    
}
