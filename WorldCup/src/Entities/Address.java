/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Address {
    private int idAddress;
    private int idDistrict;
    private String nameAddress;

    public Address(int idAddress, int idDistrict, String nameAddress) {
        this.idAddress = idAddress;
        this.idDistrict = idDistrict;
        this.nameAddress = nameAddress;
    }

    public Address() {
   }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getNameAddress() {
        return nameAddress;
    }

    public void setNameAddress(String nameAddress) {
        this.nameAddress = nameAddress;
    }

    @Override
    public String toString() {
        return "Address{" + "idAddress=" + idAddress + ", idDistrict=" + idDistrict + ", nameAddress=" + nameAddress + '}';
    }
}
