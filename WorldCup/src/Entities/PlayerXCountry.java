/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class PlayerXCountry {
    private int idPlayer;
    private int idCountry;

    public PlayerXCountry(int idPlayer, int idCountry) {
        this.idPlayer = idPlayer;
        this.idCountry = idCountry;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public String toString() {
        return "PlayerXCountry{" + "idPlayer=" + idPlayer + ", idCountry=" + idCountry + '}';
    }
}
