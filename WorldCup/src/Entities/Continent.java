/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Continent {
    private int idContinent;
    private String nameContinent;
    private int idEvent;

    public Continent(int idContinent, int idEvent, String nameContinent) {
        this.idContinent = idContinent;
        this.nameContinent = nameContinent;
        this.idEvent = idEvent;
    }

    public int getIdContinent() {
        return idContinent;
    }

    public void setIdContinent(int idContinent) {
        this.idContinent = idContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public void setNameContinent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "Continent{" + "idContinent=" + idContinent + ", nameContinent=" + nameContinent + ", idEvent=" + idEvent + '}';
    }

    
}
