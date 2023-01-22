/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Helper {
    private int idHelper;
    private int idTeam;
    private int idHelperType;
    private String hireDate;
    private int idEvent;

    public Helper(int idHelper, int idTeam, int idHelperType, String hireDate, int idEvent) {
        this.idHelper = idHelper;
        this.idTeam = idTeam;
        this.idHelperType = idHelperType;
        this.hireDate = hireDate;
        this.idEvent = idEvent;
    }

    public Helper() {
    }
    
    public int getIdHelper() {
        return idHelper;
    }

    public void setIdHelper(int idHelper) {
        this.idHelper = idHelper;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdHelperType() {
        return idHelperType;
    }

    public void setIdHelperType(int idHelperType) {
        this.idHelperType = idHelperType;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "Helper{" + "idHelper=" + idHelper + ", idTeam=" + idTeam + ", idHelperType=" + idHelperType + ", hireDate=" + hireDate + ", idEvent=" + idEvent + '}';
    }
}
