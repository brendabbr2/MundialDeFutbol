/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author david
 */
public class UserComment {
    private int idComment;
    private int idNews;
    private int idUser;
    private Date commentDate;
    private String commentText;

    public UserComment(int idComment, int idNews, int idUser, Date commentDate, String commentText) {
        this.idComment = idComment;
        this.idNews = idNews;
        this.idUser = idUser;
        this.commentDate = commentDate;
        this.commentText = commentText;
    }

    public UserComment() {
    }
    
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        Date comment = Date.valueOf(commentDate);
        this.commentDate = comment;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setLogText(String logText) {
        this.commentText = logText;
    }

    @Override
    public String toString() {
        return "UserComment{" + "idComment=" + idComment + ", idNews=" 
                + idNews + ", idUser=" + idUser + ", commentDate=" 
                + commentDate + ", logText=" + commentText + '}';
    }
    
    
}
