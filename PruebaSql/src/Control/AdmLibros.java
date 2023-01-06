package Control;

import Modelo.Libro;
//import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class AdmLibros {
    
    public ArrayList<Libro> obtenerLibros() throws SQLException {
        Connection conn = (Connection) sysConexion.obtConexion();
        //Statement statement = (Statement) conn.createStatement();
        CallableStatement sql = conn.prepareCall("{call MOSTRAR_LIBROS(?)}");
        sql.registerOutParameter(1, Types.REF_CURSOR);
        sql.execute();
        
        ResultSet rs = (ResultSet) sql.getObject(1);
        ArrayList<Libro> libros = new ArrayList<>();
        while(rs.next())
        {
            Libro libro = new Libro();
            libro.setCodigo(rs.getInt(1));
            libro.setNombre(rs.getString(2));
            libro.setIdAutor(rs.getInt(3));
            libro.setAño(rs.getInt(4));
            
            libros.add(libro);
        }
        return libros;
    }
    
    public void agregarLibro(String nombre, int autor, int año) throws SQLException{
        Connection conn = (Connection) sysConexion.obtConexion();
        CallableStatement sql = conn.prepareCall("{call AGREGAR_LIBRO(?,?,?)}");
        sql.setString(1, nombre);
        sql.setInt(2, autor);
        sql.setInt(3, año);
        sql.execute(); 
    }
    
    public void borrarLibro(int cod) throws SQLException{
        Connection conn = (Connection) sysConexion.obtConexion();
        CallableStatement sql = conn.prepareCall("{call BORRAR_LIBRO(?)}");
        sql.setInt(1, cod);
        sql.execute();
    }
}
