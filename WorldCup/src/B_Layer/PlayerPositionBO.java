/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.PlayerPositionDAO;
import Entities.PlayerPosition;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class PlayerPositionBO {
    private PlayerPositionDAO playerpositionDao;
    private String message;

    public PlayerPositionBO() {
        this.playerpositionDao = new PlayerPositionDAO();
        this.message = "";
    }
    
    public String insertPlayerPosition(PlayerPosition playerposition){
        Connection conn = SysConnection.connect();
        try{
            message = playerpositionDao.insertPlayerPosition(conn, playerposition);
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
    public String updatePlayerPosition(PlayerPosition playerposition){
        Connection conn = SysConnection.connect();
        try{
            message = playerpositionDao.updatePlayerPosition(conn, playerposition);
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
            message = playerpositionDao.deletePlayerPosition(conn, id);
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
    public DefaultTableModel getPlayerPositions(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = playerpositionDao.getPlayerPositions(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
