/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Autor;
//import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class AdmAutores {

    public ArrayList<Autor> obtenerAutores() throws SQLException {
        System.out.println("entra a obtener libros bien");
        Connection conn = (Connection) sysConexion.obtConexion();
        //Statement statement = (Statement) conn.createStatement();
        CallableStatement sql = conn.prepareCall("{call MOSTRAR_AUTORES(?)}");
        sql.registerOutParameter(1, Types.REF_CURSOR);
        sql.execute();
        
        ResultSet rs = (ResultSet) sql.getObject(1);
        ArrayList<Autor> autores = new ArrayList<>();
        while(rs.next())
        {
            Autor autor = new Autor();
            autor.setId(rs.getInt(1));
            autor.setNombre(rs.getString(2));
            autor.setPrimerApellido(rs.getString(3));
            autor.setSegundoApellido(rs.getString(4));
            
            autores.add(autor);
        }
        return autores;
    }
    
    public void agregarAutor(String nombre, String primerApellido,
        String segundoApellido) throws SQLException{
        Connection conn = (Connection) sysConexion.obtConexion();
        CallableStatement sql = conn.prepareCall("{call AGREGAR_AUTOR(?,?,?)}");
        sql.setString(1, nombre);
        sql.setString(2, primerApellido);
        sql.setString(3, segundoApellido);
        sql.execute(); 
    }
    
    public void borrarAutor(int id) throws SQLException{
        Connection conn = (Connection) sysConexion.obtConexion();
        CallableStatement sql = conn.prepareCall("{call BORRAR_AUTOR(?)}");
        sql.setInt(1, id);
        sql.execute();
    }
    
}
