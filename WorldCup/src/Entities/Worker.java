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

    public Worker(int idWorker, int idWorkerType, String hireDate) {
        this.idWorker = idWorker;
        this.idWorkerType = idWorkerType;
        this.hireDate = hireDate;
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

    @Override
    public String toString() {
        return "Worker{" + "idWorker=" + idWorker + ", idWorkerType=" + idWorkerType + ", hireDate=" + hireDate + '}';
    }
}
