/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class SportMatch {
    private int idSportMatch;
    private int idEvent;

    public SportMatch(int idSportMatch, int idEvent) {
        this.idSportMatch = idSportMatch;
        this.idEvent = idEvent;
    }

    public int getIdSportMatch() {
        return idSportMatch;
    }

    public void setIdSportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "SportMatch{" + "idSportMatch=" + idSportMatch + ", idEvent=" + idEvent + '}';
    }
}
