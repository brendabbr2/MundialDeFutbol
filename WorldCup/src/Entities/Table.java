/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Datos
 */
public abstract class Table {
    private String CreationUser;
    private String CreationDate;
    private String ModificationUser;
    private String ModificationDate;

    public Table() {
    }

    public Table(String CreationUser, String CreationDate, String ModificationUser, String ModificationDate) {
        this.CreationUser = CreationUser;
        this.CreationDate = CreationDate;
        this.ModificationUser = ModificationUser;
        this.ModificationDate = ModificationDate;
    }

    public String getCreationUser() {
        return CreationUser;
    }

    public abstract void getxxx();
    
    public String getCreationDate() {
        return CreationDate;
    }

    public String getModificationUser() {
        return ModificationUser;
    }

    public String getModificationDate() {
        return ModificationDate;
    }

    public void setCreationUser(String CreationUser) {
        this.CreationUser = CreationUser;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public void setModificationUser(String ModificationUser) {
        this.ModificationUser = ModificationUser;
    }

    public void setModificationDate(String ModificationDate) {
        this.ModificationDate = ModificationDate;
    }

    @Override
    public String toString() {
        return "Table{" + "CreationUser=" + CreationUser + ", CreationDate=" + CreationDate + ", ModificationUser=" + ModificationUser + ", ModificationDate=" + ModificationDate + '}';
    }
}
