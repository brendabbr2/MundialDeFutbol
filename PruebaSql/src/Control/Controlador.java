/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class Controlador {
    private final AdmLibros admL = new AdmLibros();
    private final AdmAutores admA = new AdmAutores();
    private final Cargador cargador = new Cargador();
    
    public DefaultTableModel mostrarAutores() throws SQLException{
        return cargador.mostrarAutores(admA.obtenerAutores());
    }
    
    public void borrarAutor(int id) throws SQLException{
        admA.borrarAutor(id);
    }

    public void agregarAutor(String nombre, String apellido1, String apellido2, String fechNac) throws SQLException{
        admA.agregarAutor(nombre, apellido1, apellido2, fechNac);
    }

    public DefaultTableModel mostrarLibros() throws SQLException {
        return cargador.mostrarLibros(admL.obtenerLibros());
    }
    
    public void borrarLibro(int cod) throws SQLException{
        admL.borrarLibro(cod);
    }
    
    public void agregarLibro(String nombre, int autorID, int año) throws SQLException{
        admL.agregarLibro(nombre, autorID, año);
    }
}
