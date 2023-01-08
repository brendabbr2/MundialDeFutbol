/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class PlayerXSportMatch {
    private int idPlayer;
    private int idSportMatch;
    private int yellow_card;
    private int red_card;
    private int savers;
    private int offside;
    private int expulsion;
    private int goals;
    private int corners;

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getIdSportMatch() {
        return idSportMatch;
    }

    public void setIdSportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    public int getYellow_card() {
        return yellow_card;
    }

    public void setYellow_card(int yellow_card) {
        this.yellow_card = yellow_card;
    }

    public int getRed_card() {
        return red_card;
    }

    public void setRed_card(int red_card) {
        this.red_card = red_card;
    }

    public int getSavers() {
        return savers;
    }

    public void setSavers(int savers) {
        this.savers = savers;
    }

    public int getOffside() {
        return offside;
    }

    public void setOffside(int offside) {
        this.offside = offside;
    }

    public int getExpulsion() {
        return expulsion;
    }

    public void setExpulsion(int expulsion) {
        this.expulsion = expulsion;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    @Override
    public String toString() {
        return "PlayerXSportMatch{" + "idPlayer=" + idPlayer + ", idSportMatch=" 
                + idSportMatch + ", yellow_card=" + yellow_card + ", red_card=" 
                + red_card + ", savers=" + savers + ", offside=" + offside + ", expulsion=" 
                + expulsion + ", goals=" + goals + ", corners=" + corners + '}';
    }
}
