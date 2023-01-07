/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Datos
 */
public class User extends Table{
    private int idUser;
    private Type idUserType;
    private String username;
    private String password;

    public User(int idUser, Type idUserType, String username, String password) {
        this.idUser = idUser;
        this.idUserType = idUserType;
        this.username = username;
        this.password = password;
    }

    public User(int idUser, Type idUserType, String username, String password, String CreationUser, String CreationDate, String ModificationUser, String ModificationDate) {
        super(CreationUser, CreationDate, ModificationUser, ModificationDate);
        this.idUser = idUser;
        this.idUserType = idUserType;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getIdUser() {
        return idUser;
    }

    public Type getIdUserType() {
        return idUserType;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdUserType(Type idUserType) {
        this.idUserType = idUserType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
