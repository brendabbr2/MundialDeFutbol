/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Layer;

import Connection.SysConnection;
import DA_Layer.UserCommentDAO;
import Entities.UserComment;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class UserCommentBO {
    private UserCommentDAO usercommentDao;
    private String message;

    public UserCommentBO() {
        this.usercommentDao = new UserCommentDAO();
        this.message = "";
    }

        public String insertUserComment(UserComment usercomment){
        Connection conn = SysConnection.connect();
        try{
            message = usercommentDao.insertUserComment(conn, usercomment);
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
        
//    public String deleteNews(UserComment usercomment){
//        Connection conn = SysConnection.connect();
//        try{
//            message = usercommentDao.deleteUserComment(conn, usercomment);
//        }catch (Exception e){
//            message = message + " " + e.getMessage();
//        }finally{
//            try {
//                if (conn != null){
//                    conn.close(); 
//                }
//            } catch (Exception e) {
//                message = message + " " + e.getMessage();
//            }
//        }
//        return message;
//    }
    
    public DefaultTableModel getUserComment(){
        Connection conn = SysConnection.connect();
        DefaultTableModel model = usercommentDao.getUserComment(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }
}
