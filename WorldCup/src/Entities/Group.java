/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Group extends Table{
    private int idGroup;
    private int idEvent;
    private String name;

    public Group(int idGroup, int idEvent, String name) {
        this.idGroup = idGroup;
        this.idEvent = idEvent;
        this.name = name;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" + "idGroup=" + idGroup + ", idEvent=" + idEvent + ", name=" + name + '}';
    }
}
