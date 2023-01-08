/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Gender extends Table{
    private int idGender;
    private String genderDescription;

    public Gender(int idGender, String genderDescription) {
        this.idGender = idGender;
        this.genderDescription = genderDescription;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    @Override
    public String toString() {
        return "Gender{" + "idGender=" + idGender + ", genderDescription=" + genderDescription + '}';
    }
    
    
}
