/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class UserType extends Table{
    private int idUserType;
    private String nameUserType;

    public UserType(int idUserType, String nameUserType) {
        this.idUserType = idUserType;
        this.nameUserType = nameUserType;
    }

    public int getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public String getNameUserType() {
        return nameUserType;
    }

    public void setNameUserType(String nameUserType) {
        this.nameUserType = nameUserType;
    }

    @Override
    public String toString() {
        return "userType{" + "idUserType=" + idUserType + ", nameUserType=" + nameUserType + '}';
    }
    
    
}
