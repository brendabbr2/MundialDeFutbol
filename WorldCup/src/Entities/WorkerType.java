/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author david
 */
public class WorkerType {
    private int idWorkerType;
    private String nameWorkerType;

    public WorkerType() {
    }
    
    public WorkerType(int idWorkerType, String nameWorkerType) {
        this.idWorkerType = idWorkerType;
        this.nameWorkerType = nameWorkerType;
    }

    public int getIdWorkerType() {
        return idWorkerType;
    }

    public void setIdWorkerType(int idWorkerType) {
        this.idWorkerType = idWorkerType;
    }

    public String getNameWorkerType() {
        return nameWorkerType;
    }

    public void setNameWorkerType(String nameWorkerType) {
        this.nameWorkerType = nameWorkerType;
    }

    @Override
    public String toString() {
        return "WorkerType{" + "idWorkerType=" + idWorkerType + ", nameWorkerType=" + nameWorkerType + '}';
    }    
}
