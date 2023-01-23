/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class District {
    private int idDistrict;
    private int idCanton;
    private String nameDistrict;

    public District(int idDistrict, int idCanton, String nameDistrict) {
        this.idDistrict = idDistrict;
        this.idCanton = idCanton;
        this.nameDistrict = nameDistrict;
    }

    public District() {
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    @Override
    public String toString() {
        return "District{" + "idDistrict=" + idDistrict + ", idCanton=" + idCanton + ", nameDistrict=" + nameDistrict + '}';
    }
    
    
}
