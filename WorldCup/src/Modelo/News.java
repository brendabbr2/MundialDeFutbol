/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Datos
 */
public class News extends Table{
    public String title;
    public String text;
    public String author;
    public String date;
    public String photo;

    public News(String title, String text, String author, String date, String photo) {
        this.title = title;
        this.text = text;
        this.author = author;
        this.date = date;
        this.photo = photo;
    }

    public News(String title, String text, String author, String date, String photo, String CreationUser, String CreationDate, String ModificationUser, String ModificationDate) {
        super(CreationUser, CreationDate, ModificationUser, ModificationDate);
        this.title = title;
        this.text = text;
        this.author = author;
        this.date = date;
        this.photo = photo;
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

    public String getDate() {
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    
}
