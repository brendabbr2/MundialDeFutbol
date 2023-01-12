/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class ParameterEvent {
    private int idParameter;
    private String nameParameter;
    private int valueParameter;

    public ParameterEvent(int idParameter, String nameParameter, int valueParameter) {
        this.idParameter = idParameter;
        this.nameParameter = nameParameter;
        this.valueParameter = valueParameter;
    }

    public ParameterEvent() {
    
    }

    public int getIdParameter() {
        return idParameter;
    }

    public void setIdParameter(int idParameter) {
        this.idParameter = idParameter;
    }

    public String getNameParameter() {
        return nameParameter;
    }

    public void setNameParameter(String nameParameter) {
        this.nameParameter = nameParameter;
    }

    public int getValueParameter() {
        return valueParameter;
    }

    public void setValueParameter(int valueParameter) {
        this.valueParameter = valueParameter;
    }

    @Override
    public String toString() {
        return "ParameterEvent{" + "idParameter=" + idParameter + ", nameParameter=" + nameParameter + ", valueParameter=" + valueParameter + '}';
    }
}
