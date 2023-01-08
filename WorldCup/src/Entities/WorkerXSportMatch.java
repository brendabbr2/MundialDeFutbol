/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class WorkerXSportMatch {
    private int idWorker;
    private int idSportMatch;

    public WorkerXSportMatch(int idWorker, int idSportMatch) {
        this.idWorker = idWorker;
        this.idSportMatch = idSportMatch;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public int getIdSportMatch() {
        return idSportMatch;
    }

    public void setIdSportMatch(int idSportMatch) {
        this.idSportMatch = idSportMatch;
    }

    @Override
    public String toString() {
        return "WorkerXSportMatch{" + "idWorker=" + idWorker + ", idSportMatch=" + idSportMatch + '}';
    }
}
