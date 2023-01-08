/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Phone {
    private int number;
    private int idPerson;

    public Phone(int number, int idPerson) {
        this.number = number;
        this.idPerson = idPerson;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    @Override
    public String toString() {
        return "Phone{" + "number=" + number + ", idPerson=" + idPerson + '}';
    }
}
