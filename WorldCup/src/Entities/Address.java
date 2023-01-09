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
    private int idCanton;
    private String nameAddress;

    public Address(int idAddress, int idDistrict, String nameAddress) {
        this.idAddress = idAddress;
        this.idCanton = idDistrict;
        this.nameAddress = nameAddress;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getIdDistrict() {
        return idCanton;
    }

    public void setIdDistrict(int idDistrict) {
        this.idCanton = idDistrict;
    }

    public String getNameAddress() {
        return nameAddress;
    }

    public void setNameAddress(String nameAddress) {
        this.nameAddress = nameAddress;
    }

    @Override
    public String toString() {
        return "Address{" + "idAddress=" + idAddress + ", idDistrict=" + idCanton + ", nameAddress=" + nameAddress + '}';
    }
}
