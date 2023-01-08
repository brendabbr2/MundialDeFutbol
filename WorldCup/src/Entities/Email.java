/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Email extends Table{
    private int idEmail;
    private int idPerson;
    private String mail;

    public Email(int idEmail, int idPerson, String mail) {
        this.idEmail = idEmail;
        this.idPerson = idPerson;
        this.mail = mail;
    }

    public int getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(int idEmail) {
        this.idEmail = idEmail;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Email{" + "idEmail=" + idEmail + ", idPerson=" + idPerson + ", mail=" + mail + '}';
    }
}
