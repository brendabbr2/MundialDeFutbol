/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA_Layer;

import Entities.News;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jox
 */
public class NewsDAO {

    private String message = "";

    public String insertNews(Connection conn, News news) {
        PreparedStatement pst = null;
        String sql = "CALL insertNews(?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, news.getIdEvent());
            pst.setString(2, news.getTitle());
            pst.setString(3, news.getText());
            pst.setString(4, news.getAuthor());
            pst.setDate(5, news.getDate());
            pst.setString(6, news.getPhoto());

            pst.execute();
            message = "Succesfully saved";
            JOptionPane.showMessageDialog(null, "News inserted correctly");
            pst.close();

        } catch (SQLException e) {
            message = "Unsuccessfully saved\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "News not inserted",
                     null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public String updateNews(Connection conn, News news) {
        PreparedStatement pst = null;
        String sql = "CALL updateNews(?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, news.getIdNews());
            pst.setInt(2, news.getIdEvent());
            pst.setString(3, news.getTitle());
            pst.setString(4, news.getText());
            pst.setString(5, news.getAuthor());
            pst.setDate(6, news.getDate());
            pst.setString(7, news.getPhoto());

            pst.execute();
            message = "Succesfully updated";
            JOptionPane.showMessageDialog(null, "News updated correctly");
            pst.close();

        } catch (SQLException e) {
            message = "Unsuccessfully updated\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "News not updated",
                     null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    public String deleteNews(Connection conn, int idNews) {
        PreparedStatement pst = null;
        String sql = "CALL deleteNews(?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idNews);

            pst.execute();
            message = "Succesfully deleted";
            JOptionPane.showMessageDialog(null, "News deleted correctly");
            pst.close();

        } catch (SQLException e) {
            message = "Unsuccessfully deleted\n" + e.getMessage();
            JOptionPane.showMessageDialog(null, "News not deleted",
                     null, JOptionPane.ERROR_MESSAGE);
        }
        return message;
    }

    // for the table to read the model, eliminate the default model of the table
    // in view: table right click >> properties >> model >> delete all registes
    public DefaultTableModel getNews(Connection conn) {
        String[] columns = {"idNews", "idEvent", "nameEvent", "title", "text", "author", "newsDate",
            "photo", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);

        CallableStatement statement = null;

        String sql = "CALL getNews(?,?)";

        String[] row = new String[12];
        Statement st = null;
        ResultSet rs = null;

        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.registerOutParameter(2, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(2);

            while (rs.next()) {
                for (int i = 0; i < 12; i++) {
                    row[i] = rs.getString(i + 1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to show table News");

            System.out.println(e.getMessage());
        }

        return model;
    }
    
    public DefaultTableModel getNewsEvent(Connection conn, int idEvent) {
        String[] columns = {"idNews", "idEvent", "nameEvent", "title", "text", "author", "newsDate",
            "photo", "creationUser", "creationDate", "modificationUser", "modificationDate"};
        DefaultTableModel model = new DefaultTableModel(null, columns);

        CallableStatement statement = null;

        String sql = "CALL getNewsEvent(?,?,?)";

        String[] row = new String[12];
        Statement st = null;
        ResultSet rs = null;

        try {
            statement = conn.prepareCall(sql);
            statement.setNull(1, Types.NUMERIC);
            statement.setInt(2, idEvent);
            statement.registerOutParameter(3, Types.REF_CURSOR);
            statement.execute();
            rs = (ResultSet) statement.getObject(3);

            while (rs.next()) {
                for (int i = 0; i < 12; i++) {
                    row[i] = rs.getString(i + 1);
                }
                model.addRow(row);
            }
            System.out.println("Succesfully listed");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to show table News");

            System.out.println(e.getMessage());
        }

        return model;
    }
}
