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

    public SportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    public int getIdSportMatch() {
        return idSportMatch;
    }

    public void setIdSportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    @Override
    public String toString() {
        return "SportMatch{" + "idSportMatch=" + idSportMatch + '}';
    }
}
