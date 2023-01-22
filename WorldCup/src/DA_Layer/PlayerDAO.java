/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.Player;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class PlayerDAO {
    private String message = "";
    
    public String insertPlayer(Connection conn, Player player){
        PreparedStatement pst = null;
        String sql = "CALL insertPlayer(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, player.getIdPlayer());
            pst.setInt(2, player.getIdTeam());
            pst.setInt(3, player.getIdPosition());
            pst.setInt(4, player.getNumberPlayer());
            pst.setInt(5, player.getIdEvent());
            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "Player Position inserted correctly");
            pst.close();
            
        } catch (SQLException e){
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "Player Postion not inserted"
                    , null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }
    
    public String updatePlayer(Connection conn, Player player){
        PreparedStatement pst = null;
        String sql = "CALL updatePlayer(?,?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, player.getIdPlayer());
            pst.setInt(2, player.getIdTeam());
            pst.setInt(3, player.getIdPosition());
            pst.setInt(4, player.getNumberPlayer());
            pst.setInt(5, player.getIdEvent());
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

    public String deletePlayer(Connection conn, int idPlayer){
        PreparedStatement pst = null;
        String sql = "CALL deletePlayer(?)";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idPlayer);
            
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
    
    public DefaultTableModel getPlayer(Connection conn){
        String [] columns = {"idPlayer", "idTeam", "idPosition", "numberPlayer","creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getPlayer(?,?,?)";
        
        String [] row = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.setNull(2, Types.NUMERIC);
            statement.registerOutParameter(3, Types.REF_CURSOR);
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

            JOptionPane.showMessageDialog(null, "Unable to show table playerPosition");

            System.out.println(e.getMessage());
        }
        return model;
    }
    
    public ArrayList getList(Connection conn){
        CallableStatement statement = null;
        String sql = "CALL getPlayer(?,?,?)";
        Statement st = null;
        ResultSet rs = null; 
        ArrayList<Player> ObjectList = new ArrayList<>();
        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.setNull(2, Types.NUMERIC);
            statement.registerOutParameter(3, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);
            
            while (rs.next()) {
                Player player = new Player();
                player.setIdPlayer(rs.getInt(1));
                player.setIdTeam(rs.getInt(2));
                player.setIdPosition(rs.getInt(3));
                player.setNumberPlayer(rs.getInt(4));
                ObjectList.add(player);
            }
            System.out.println("Succesfully listed PlayerPosition");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to get PlayerPosition list");
            System.out.println(e.getMessage());
        }
        return ObjectList;
    }        
    
}
