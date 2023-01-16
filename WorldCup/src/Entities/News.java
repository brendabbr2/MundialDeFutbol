/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author Datos
 */
public class News {
    private int idNews;
    private int idEvent;
    private String title;
    private String text;
    private String author;
    private Date date;
    private String photo;

    public News(int idNews, int idEvent, String title, String text, String author, Date date, String photo) {
        this.idNews = idNews;
        this.idEvent = idEvent;
        this.title = title;
        this.text = text;
        this.author = author;
        this.date = date;
        this.photo = photo;
    }

    public News() {
    }
    
    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "News{" + "idNews=" + idNews + ", idEvent=" + idEvent 
                + ", title=" + title + ", text=" + text + ", author=" 
                + author + ", date=" + date + ", photo=" + photo + '}';
    }
    
}
