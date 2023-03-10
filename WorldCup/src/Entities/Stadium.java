/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Stadium {
    private int idStadium;
    private int idAddress;
    private int idEvent;
    private String nameStadium;

    public Stadium(int idStadium, int idAddress, int idEvent, String nameStadium) {
        this.idStadium = idStadium;
        this.idAddress = idAddress;
        this.idEvent = idEvent;
        this.nameStadium = nameStadium;
    }

    public int getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(int idStadium) {
        this.idStadium = idStadium;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getNameStadium() {
        return nameStadium;
    }

    public void setNameStadium(String nameStadium) {
        this.nameStadium = nameStadium;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "Stadium{" + "idStadium=" + idStadium + ", idAddress=" + idAddress + ", idEvent=" + idEvent + ", nameStadium=" + nameStadium + '}';
    }
    
    
}
