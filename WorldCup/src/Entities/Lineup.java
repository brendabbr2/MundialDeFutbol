/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Lineup {
    private int idLineup;
    private String nameLineup;

    public Lineup(int idLineup, String nameLineup) {
        this.idLineup = idLineup;
        this.nameLineup = nameLineup;
    }

    public int getIdLineup() {
        return idLineup;
    }

    public void setIdLineup(int idLineup) {
        this.idLineup = idLineup;
    }

    public String getNameLineup() {
        return nameLineup;
    }

    public void setNameLineup(String nameLineup) {
        this.nameLineup = nameLineup;
    }

    @Override
    public String toString() {
        return "Lineup{" + "idLineup=" + idLineup + ", nameLineup=" + nameLineup + '}';
    }
}
