/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class IdentificationType {
    private int idIdentificationType;
    private String idName;
    private int idMask;

    public IdentificationType(int idIdentificationType, String idName, int idMask) {
        this.idIdentificationType = idIdentificationType;
        this.idName = idName;
        this.idMask = idMask;
    }

    public IdentificationType() {
    }

    public int getIdIdentificationType() {
        return idIdentificationType;
    }

    public void setIdIdentificationType(int idIdentificationType) {
        this.idIdentificationType = idIdentificationType;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public int getIdMask() {
        return idMask;
    }

    public void setIdMask(int idMask) {
        this.idMask = idMask;
    }

    @Override
    public String toString() {
        return "IdentificationType{" + "idIdentificationType=" + idIdentificationType + ", idName=" + idName + ", idMask=" + idMask + '}';
    } 
}
