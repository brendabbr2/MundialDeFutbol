/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.UserComment;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserCommentDAO {
   private String message = "";

    public String insertUserComment(Connection conn, UserComment usercomment) {
        PreparedStatement pst = null;
        String sql = "CALL insertUserComment(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, usercomment.getIdNews());
            pst.setInt(2, usercomment.getIdUser());
            pst.setDate(3, usercomment.getCommentDate());
            pst.setString(4, usercomment.getCommentText());

            pst.execute();
            message = "Succesfully commentd";
            pst.close();

        } catch (SQLException e) {
            message = "Unsuccessfully commentd\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "UserComment not inserted",
                     null, JOptionPane.ERROR_MESSAGE);
            System.out.println(message);
        }
        return message;
    }
    
//    public String deleteUserComment(Connection conn, UserComment usercomment) {
//        PreparedStatement pst = null;
//        String sql = "CALL deleteUserComment(?,?)";
//        try {
//            pst = conn.prepareStatement(sql);
//            pst.setInt(1, usercomment.getIdUser());
//            pst.setInt(2, usercomment.getIdNews());
//
//            pst.execute();
//            message = "Succesfully deleted";
//            JOptionPane.showMessageDialog(null, "UserComment deleted correctly");
//            pst.close();
//
//        } catch (SQLException e) {
//            message = "Unsuccessfully deleted\n" + e.getMessage();
//            JOptionPane.showMessageDialog(null, "UserComment not deleted",
//                     null, JOptionPane.ERROR_MESSAGE);
//        }
//        return message;
//    }
    
    public DefaultTableModel getUserComment(Connection conn){
        String [] columns = {"commentText", "cammentDate", "userName"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        
        CallableStatement statement = null;
        
        String sql = "CALL getUserComment(?)";
        
        String [] row = new String[3];
        ResultSet rs = null;
        
        try {
            statement = conn.prepareCall(sql);
            statement.registerOutParameter(1, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(1);
            
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to show table UserComment");
            System.out.println(e.getMessage());
        }
        return model;
    }
}
