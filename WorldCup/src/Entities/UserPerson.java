/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class UserPerson {
    private int idUser;
    private int idUserType;
    private String userName;
    private String passwordUser;

    public UserPerson(int idUser, int idUserType, String userName, String passwordUser) {
        this.idUser = idUser;
        this.idUserType = idUserType;
        this.userName = userName;
        this.passwordUser = passwordUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public String toString() {
        return "UserPerson{" + "idUser=" + idUser + ", idUserType=" + idUserType + ", userName=" + userName + ", passwordUser=" + passwordUser + '}';
    }
}
