/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Datos
 */
public class Type extends Table{
    public int idType;
    public String nameType;
    public int mask;

    public Type(int idType, String nameType) {
        this.idType = idType;
        this.nameType = nameType;
    }

    public Type(int idType, String nameType, int mask) {
        this.idType = idType;
        this.nameType = nameType;
        this.mask = mask;
    }

    public Type(int idType, String nameType, int mask, String CreationUser, String CreationDate, String ModificationUser, String ModificationDate) {
        super(CreationUser, CreationDate, ModificationUser, ModificationDate);
        this.idType = idType;
        this.nameType = nameType;
        this.mask = mask;
    }

    public int getIdType() {
        return idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "Type{" + "idType=" + idType + ", nameType=" + nameType + '}';
    }
}
