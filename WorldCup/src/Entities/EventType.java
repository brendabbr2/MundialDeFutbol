/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class EventType extends Table{
    private int idEvenType;
    private String name;

    public EventType() {
    }

    public EventType(int idEvenType, String name) {
        this.idEvenType = idEvenType;
        this.name = name;
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
        return "EventType{" + "idEvenType=" + idEvenType + ", name=" + name + '}';
    }
}
