/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Identification extends Table{
    private int idIdentification;
    private int idPerson;
    private int idType;
    private int valueIdentification;

    public Identification(int idIdentification, int idPerson, int idType, int valueIdentification) {
        this.idIdentification = idIdentification;
        this.idPerson = idPerson;
        this.idType = idType;
        this.valueIdentification = valueIdentification;
    }

    public int getIdIdentification() {
        return idIdentification;
    }

    public void setIdIdentification(int idIdentification) {
        this.idIdentification = idIdentification;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getValueIdentification() {
        return valueIdentification;
    }

    public void setValueIdentification(int valueIdentification) {
        this.valueIdentification = valueIdentification;
    }

    @Override
    public String toString() {
        return "Identification{" + "idIdentification=" + idIdentification + ", idPerson=" + idPerson + ", idType=" + idType + ", valueIdentification=" + valueIdentification + '}';
    }
}
