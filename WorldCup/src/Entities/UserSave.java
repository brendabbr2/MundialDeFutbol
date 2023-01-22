/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class UserSave {
    private int idSave;
    private int idNews;
    private int idUser;

    public UserSave(int idSave, int idNews, int idUser) {
        this.idSave = idSave;
        this.idNews = idNews;
        this.idUser = idUser;
    }

    public UserSave() {
    }
    
    public int getIdSave() {
        return idSave;
    }

    public void setIdSave(int idSave) {
        this.idSave = idSave;
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

    @Override
    public String toString() {
        return "UserSave{" + "idSave=" + idSave + ", idNews=" + idNews + ", idUser=" + idUser + '}';
    }
    
    
}
