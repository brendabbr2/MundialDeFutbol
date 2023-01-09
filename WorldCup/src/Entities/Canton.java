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
    private int idDistrict;
    private String nameCanton;

    public Canton(int idCanton, int idDistrict, String nameCanton) {
        this.idCanton = idCanton;
        this.idDistrict = idDistrict;
        this.nameCanton = nameCanton;
    }
    
    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getNameCanton() {
        return nameCanton;
    }

    public void setNameCanton(String nameCanton) {
        this.nameCanton = nameCanton;
    }

    @Override
    public String toString() {
        return "Canton{" + "idCanton=" + idCanton + ", idDistrict=" + idDistrict + ", nameCanton=" + nameCanton + '}';
    }
}
