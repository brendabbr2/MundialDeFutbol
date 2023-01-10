/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Canton {
    private int idCanton;
    private int idProvince;
    private String nameCanton;

    public Canton(int idCanton, int idProvince, String nameCanton) {
        this.idCanton = idCanton;
        this.idProvince = idProvince;
        this.nameCanton = nameCanton;
    }
    
    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public int getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public String getNameCanton() {
        return nameCanton;
    }

    public void setNameCanton(String nameCanton) {
        this.nameCanton = nameCanton;
    }

    @Override
    public String toString() {
        return "Canton{" + "idCanton=" + idCanton + ", idProvince=" + idProvince + ", nameCanton=" + nameCanton + '}';
    }
}
