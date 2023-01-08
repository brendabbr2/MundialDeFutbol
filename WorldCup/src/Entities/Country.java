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
    private String nameCountry;
    private String demonym;

    public Country(int idCountry, int idContinent, String nameCountry, String demonym) {
        this.idCountry = idCountry;
        this.idContinent = idContinent;
        this.nameCountry = nameCountry;
        this.demonym = demonym;
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

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    @Override
    public String toString() {
        return "Country{" + "idCountry=" + idCountry + ", idContinent=" + idContinent + ", nameCountry=" + nameCountry + ", demonym=" + demonym + '}';
    }
}
