/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.TeamDAO;
import Entities.Team;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Datos
 */
public class TeamBO {
    private TeamDAO teamDAO;
    private String message;

    public TeamBO() {
        this.teamDAO = new TeamDAO();
        this.message = "";
    }
    
    public String insertTeam(Team team){
        Connection conn = SysConnection.connect();
        try{
            message = teamDAO.insertTeam(conn, team);
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
    public String updateTeam(Team team){
        Connection conn = SysConnection.connect();
        try{
            message = teamDAO.updateTeam(conn, team);
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
    public String deleteTeam(int id){
        Connection conn = SysConnection.connect();
        try{
            message = teamDAO.deleteTeam(conn, id);
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
    public DefaultTableModel getTable(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = teamDAO.getTeamTable(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
    
    public ArrayList getList() throws SQLException{
        Connection conn = SysConnection.connect();
        ArrayList list = teamDAO.getList(conn);
        conn.close();
        return list;
    }
}
