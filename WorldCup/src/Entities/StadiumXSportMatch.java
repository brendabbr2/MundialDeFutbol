/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class StadiumXSportMatch {
    private int Stadium;
    private int idSportMatch;
    private String dateStadiumXSportMatch;

    public StadiumXSportMatch(int Stadium, int idSportMatch, String dateStadiumXSportMatch) {
        this.Stadium = Stadium;
        this.idSportMatch = idSportMatch;
        this.dateStadiumXSportMatch = dateStadiumXSportMatch;
    }

    public int getStadium() {
        return Stadium;
    }

    public void setStadium(int Stadium) {
        this.Stadium = Stadium;
    }

    public int getIdSportMatch() {
        return idSportMatch;
    }

    public void setIdSportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    public String getDateStadiumXSportMatch() {
        return dateStadiumXSportMatch;
    }

    public void setDateStadiumXSportMatch(String dateStadiumXSportMatch) {
        this.dateStadiumXSportMatch = dateStadiumXSportMatch;
    }

    @Override
    public String toString() {
        return "StadiumXSportMatch{" + "Stadium=" + Stadium + ", idSportMatch=" + idSportMatch + ", dateStadiumXSportMatch=" + dateStadiumXSportMatch + '}';
    }
}
