/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class UserReview {
    private int idReview;
    private int idNews;
    private int idUser;
    private int Score;

    public UserReview(int idReview, int idNews, int idUser, int Score) {
        this.idReview = idReview;
        this.idNews = idNews;
        this.idUser = idUser;
        this.Score = Score;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
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

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    @Override
    public String toString() {
        return "UserReview{" + "idReview=" + idReview + ", idNews=" + idNews + ", idUser=" + idUser + ", Score=" + Score + '}';
    }
}
