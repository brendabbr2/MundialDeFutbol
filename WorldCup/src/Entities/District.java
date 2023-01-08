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
    private int idProvince;
    private String nameDistrict;

    public District(int idDistrict, int idProvince, String nameDistrict) {
        this.idDistrict = idDistrict;
        this.idProvince = idProvince;
        this.nameDistrict = nameDistrict;
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    @Override
    public String toString() {
        return "District{" + "idDistrict=" + idDistrict + ", idProvince=" + idProvince + ", nameDistrict=" + nameDistrict + '}';
    }
    
    
}
