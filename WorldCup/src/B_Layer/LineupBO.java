/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.LineupDAO;
import Entities.Lineup;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class LineupBO {
    private LineupDAO lineupDao;
    private String message;

    public LineupBO() {
        this.lineupDao = new LineupDAO();
        this.message = "";
    }
    
    public String insertLineup(Lineup lineup){
        Connection conn = SysConnection.connect();
        try{
            message = lineupDao.insertLineup(conn, lineup);
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
    public String updateLineup(Lineup lineup){
        Connection conn = SysConnection.connect();
        try{
            message = lineupDao.updateLineup(conn, lineup);
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
    public String deleteLineup(int id){
        Connection conn = SysConnection.connect();
        try{
            message = lineupDao.deleteLineup(conn, id);
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
    public DefaultTableModel getLineups(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = lineupDao.getLineups(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
