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

    public Continent(int idContinent, String nameContinent) {
        this.idContinent = idContinent;
        this.nameContinent = nameContinent;
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

    @Override
    public String toString() {
        return "Continent{" + "idContinent=" + idContinent + ", nameContinent=" + nameContinent + '}';
    }
}
