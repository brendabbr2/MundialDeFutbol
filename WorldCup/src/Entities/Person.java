/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Person {
    private int idPerson;
    private int idGender;
    private int idAddress;
    private int idEvent;
    private String date;
    private String personName;
    private String photo;

    public Person(int idPerson, int idGender, int idAddress, int idEvent, String date, String personName) {
        this.idPerson = idPerson;
        this.idGender = idGender;
        this.idAddress = idAddress;
        this.idEvent = idEvent;
        this.date = date;
        this.personName = personName;
        this.photo = "";
    }
    
    public Person(int idPerson, int idGender, int idAddress, int idEvent, String date, String personName, String photo) {
        this.idPerson = idPerson;
        this.idGender = idGender;
        this.idAddress = idAddress;
        this.idEvent = idEvent;
        this.date = date;
        this.personName = personName;
        this.photo = photo;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", idGender=" + idGender + ", idAddress=" + idAddress 
                + ", idEvent=" + idEvent + ", date=" + date + ", personName=" + personName + ", photo=" + photo + '}';
    }
    
    
    
    
}
