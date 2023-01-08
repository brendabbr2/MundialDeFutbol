/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class GroupEvent {
    private int idGroup;
    private int idEvent;
    private String nameGroup;

    public GroupEvent(int idGroup, int idEvent, String nameGroup) {
        this.idGroup = idGroup;
        this.idEvent = idEvent;
        this.nameGroup = nameGroup;
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

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        return "GroupEvent{" + "idGroup=" + idGroup + ", idEvent=" + idEvent + ", nameGroup=" + nameGroup + '}';
    }
}
