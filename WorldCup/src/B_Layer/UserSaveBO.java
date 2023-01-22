/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserSaveDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserSaveBO {
    private UserSaveDAO cantonDao;
    private String message;

    public UserSaveBO() {
        this.cantonDao = new UserSaveDAO();
        this.message = "";
    }
    
    public DefaultTableModel getUserSaveMostVoted(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = cantonDao.getUserSaveMostVoted(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
