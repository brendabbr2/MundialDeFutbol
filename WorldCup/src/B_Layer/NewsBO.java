/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.NewsDAO;
import Entities.News;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jox
 */
public class NewsBO {
    private NewsDAO newsDao;
    private String message;

    public NewsBO() {
        this.newsDao = new NewsDAO();
        this.message = "";
    }
    
    public String insertNews(News news){
        Connection conn = SysConnection.connect();
        try{
            message = newsDao.insertNews(conn, news);
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
    public String updateNews(News news){
        Connection conn = SysConnection.connect();
        try{
            message = newsDao.updateNews(conn, news);
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
    public String deleteNews(int id){
        Connection conn = SysConnection.connect();
        try{
            message = newsDao.deleteNews(conn, id);
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
    public DefaultTableModel getNews(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = newsDao.getNews(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
