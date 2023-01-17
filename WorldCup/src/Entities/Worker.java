/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class Worker {
    private int idWorker;
    private int idWorkerType;
    private String hireDate;
    private int idEvent;

    public Worker(int idWorker, int idWorkerType, String hireDate, int idEvent) {
        this.idWorker = idWorker;
        this.idWorkerType = idWorkerType;
        this.hireDate = hireDate;
        this.idEvent = idEvent;
    }

    public Worker() {
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public int getIdWorkerType() {
        return idWorkerType;
    }

    public void setIdWorkerType(int idWorkerType) {
        this.idWorkerType = idWorkerType;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public String toString() {
        return "Worker{" + "idWorker=" + idWorker + ", idWorkerType=" + idWorkerType + ", hireDate=" + hireDate + ", idEvent=" + idEvent + '}';
    }
}
