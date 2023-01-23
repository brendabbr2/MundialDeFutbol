/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Province {
    private int idProvince;
    private int idCountry;
    private String nameProvince;

    public Province(int idProvince, int idCountry, String nameProvince) {
        this.idProvince = idProvince;
        this.idCountry = idCountry;
        this.nameProvince = nameProvince;
    }

    public Province() {
    }

    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    @Override
    public String toString() {
        return "Province{" + "idProvince=" + idProvince + ", idCountry=" + idCountry + ", nameProvince=" + nameProvince + '}';
    }
}
