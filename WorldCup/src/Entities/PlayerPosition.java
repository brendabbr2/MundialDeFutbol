/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class PlayerPosition {
    private int idPosition;
    private String positionName;

    public PlayerPosition(int idPosition, String positionName) {
        this.idPosition = idPosition;
        this.positionName = positionName;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "PlayerPosition{" + "idPosition=" + idPosition + ", positionName=" + positionName + '}';
    }
}
