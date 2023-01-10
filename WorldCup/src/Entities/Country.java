/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Country {
    private int idCountry;
    private int idContinent;
    private int idDemonym;
    private String nameCountry;

    public Country(int idCountry, int idContinent, int idDemonym, String nameCountry) {
        this.idCountry = idCountry;
        this.idContinent = idContinent;
        this.idDemonym = idDemonym;
        this.nameCountry = nameCountry;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public int getIdContinent() {
        return idContinent;
    }

    public void setIdContinent(int idContinent) {
        this.idContinent = idContinent;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getIdDemonym() {
        return idDemonym;
    }

    public void setIdDemonym(int idDemonym) {
        this.idDemonym = idDemonym;
    }

    @Override
    public String toString() {
        return "Country{" + "idCountry=" + idCountry + ", idContinent=" + idContinent + ", idDemonym=" + idDemonym + ", nameCountry=" + nameCountry + '}';
    }
}
