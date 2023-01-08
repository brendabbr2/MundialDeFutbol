/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class UserLog extends Table{
    private int idLog;
    private int idNews;
    private int idUser;
    private String logDate;
    private String logText;

    public UserLog(int idLog, int idNews, int idUser, String commentDate, String logText) {
        this.idLog = idLog;
        this.idNews = idNews;
        this.idUser = idUser;
        this.logDate = logDate;
        this.logText = logText;
    }

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
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

    public String getCommentDate() {
        return logDate;
    }

    public void setCommentDate(String commentDate) {
        this.logDate = commentDate;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }

    @Override
    public String toString() {
        return "UserLog{" + "idLog=" + idLog + ", idNews=" + idNews 
                + ", idUser=" + idUser + ", commentDate=" 
                + logDate + ", logText=" + logText + '}';
    }
}
