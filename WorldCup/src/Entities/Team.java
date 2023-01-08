/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Team {
    private int idTeam;
    private int idGroup;
    private int idCountry;
    private int captainNumber;
    private String logoPhoto;
    private int lineup;

    public Team(int idTeam, int idGroup, int idCountry, int captainNumber, int lineup) {
        this.idTeam = idTeam;
        this.idGroup = idGroup;
        this.idCountry = idCountry;
        this.captainNumber = captainNumber;
        this.lineup = lineup;
    }

    public Team(int idTeam, int idGroup, int idCountry, int captainNumber, String logoPhoto, int lineup) {
        this.idTeam = idTeam;
        this.idGroup = idGroup;
        this.idCountry = idCountry;
        this.captainNumber = captainNumber;
        this.logoPhoto = logoPhoto;
        this.lineup = lineup;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public int getCaptainNumber() {
        return captainNumber;
    }

    public void setCaptainNumber(int captainNumber) {
        this.captainNumber = captainNumber;
    }

    public String getLogoPhoto() {
        return logoPhoto;
    }

    public void setLogoPhoto(String logoPhoto) {
        this.logoPhoto = logoPhoto;
    }

    public int getLineup() {
        return lineup;
    }

    public void setLineup(int lineup) {
        this.lineup = lineup;
    }

    @Override
    public String toString() {
        return "Team{" + "idTeam=" + idTeam + ", idGroup=" + idGroup 
                + ", idCountry=" + idCountry + ", captainNumber=" + captainNumber + ", logoPhoto=" + logoPhoto + ", lineup=" + lineup + '}';
    }
    
    
}
