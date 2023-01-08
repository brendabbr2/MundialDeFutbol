/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Player {
    private int idPlayer;
    private int idTeam;
    private int idPosition;
    private int numberPlayer;

    public Player(int idPlayer, int idTeam, int idPosition, int numberPlayer) {
        this.idPlayer = idPlayer;
        this.idTeam = idTeam;
        this.idPosition = idPosition;
        this.numberPlayer = numberPlayer;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    @Override
    public String toString() {
        return "Player{" + "idPlayer=" + idPlayer + ", idTeam=" + idTeam + ", idPosition=" + idPosition + ", numberPlayer=" + numberPlayer + '}';
    }
}
