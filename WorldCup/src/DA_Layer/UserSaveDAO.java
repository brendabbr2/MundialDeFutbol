/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserSaveDAO {
    private String message = "";
    
    public DefaultTableModel getUserSaveMostVoted(Connection conn){
        String [] columns = {"idNews", "voting"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getUserSaveMostVoted(?)";
        
        String [] row = new String[2];
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.registerOutParameter(1, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(1);
            
            while (rs.next()) {
                for (int i = 0; i < 2; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to show table UserSave");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
