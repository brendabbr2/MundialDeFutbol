/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Datos
 */
public class Demonym {
    private int idDemonym;
    private String nameDemonym;

    public Demonym() {
    }

    public Demonym(int idDemonym, String nameDemonym) {
        this.idDemonym = idDemonym;
        this.nameDemonym = nameDemonym;
    }

    public int getIdDemonym() {
        return idDemonym;
    }

    public String getNameDemonym() {
        return nameDemonym;
    }

    public void setIdDemonym(int idDemonym) {
        this.idDemonym = idDemonym;
    }

    public void setNameDemonym(String nameDemonym) {
        this.nameDemonym = nameDemonym;
    }

    @Override
    public String toString() {
        return "Demonym{" + "idDemonym=" + idDemonym + ", nameDemonym=" + nameDemonym + '}';
    }
    
    
}
