/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Event extends Table{
    private int idEvent;
    private int idEvenType;
    private String name;

    public Event(int idEvent, int idEvenType, String name) {
        this.idEvent = idEvent;
        this.idEvenType = idEvenType;
        this.name = name;
    }

    public Event() {
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdEvenType() {
        return idEvenType;
    }

    public void setIdEvenType(int idEvenType) {
        this.idEvenType = idEvenType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Event{" + "idEvent=" + idEvent + ", idEvenType=" + idEvenType + ", name=" + name + '}';
    }
}
