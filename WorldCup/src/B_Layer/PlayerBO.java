/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.PlayerDAO;
import Entities.Player;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Datos
 */
public class PlayerBO {
    private PlayerDAO playerpositionDao;
    private String message;
    
    public PlayerBO() {
        this.playerpositionDao = new PlayerDAO();
        this.message = "";
    }
  public String insertPlayerPosition(Player player){
        Connection conn = SysConnection.connect();
        try{
            message = playerpositionDao.insertPlayer(conn, player);
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
    public String updatePlayerPosition(Player player){
        Connection conn = SysConnection.connect();
        try{
            message = playerpositionDao.updatePlayer(conn, player);
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
    public String deletePlayerPosition(int id){
        Connection conn = SysConnection.connect();
        try{
            message = playerpositionDao.deletePlayer(conn, id);
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
    public DefaultTableModel getPlayer(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = playerpositionDao.getPlayer(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getPlayerList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = playerpositionDao.getList(conn);
        conn.close();
        return list;
    }   
}
