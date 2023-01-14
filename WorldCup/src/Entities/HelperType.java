/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class HelperType {
    private int idHelperType;
    private String nameHelperType;

    public HelperType() {
    }
    
    public HelperType(int idHelperType, String nameHelperType) {
        this.idHelperType = idHelperType;
        this.nameHelperType = nameHelperType;
    }

    public int getIdHelperType() {
        return idHelperType;
    }

    public void setIdHelperType(int idHelperType) {
        this.idHelperType = idHelperType;
    }

    public String getNameHelperType() {
        return nameHelperType;
    }

    public void setNameHelperType(String nameHelperType) {
        this.nameHelperType = nameHelperType;
    }

    @Override
    public String toString() {
        return "HelperType{" + "idHelperType=" + idHelperType + ", nameHelperType=" + nameHelperType + '}';
    }
}
