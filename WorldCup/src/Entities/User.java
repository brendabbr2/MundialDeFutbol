package Entities;

/**
 *
 * @author Datos
 */
public class User {
    private int idUser;
    private int idUserType;
    private String username;
    private String password;
    
    public User() {
        idUser = -1;
    }

    public User(int idUser, int idUserType, String username, String password) {
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

    public int getIdUserType() {
        return idUserType;
    }

    public String getPassword() {
        return password;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdUserType(int idUserType) {
        this.idUserType = idUserType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
