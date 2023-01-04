/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Control;

import Modelo.Autor;
import Modelo.Libro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class Cargador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    DefaultTableModel mostrarLibros(ArrayList<Libro> libros) {
        Object [] header = {"Codigo", "Nombre", "Autor", "año"};
            DefaultTableModel dtm = new DefaultTableModel(header, libros.size());
            for (int i = 0; i < dtm.getRowCount(); i++) {
                Libro libro = libros.get(i);
                dtm.setValueAt(libro.getCodigo(), i, 0);
                dtm.setValueAt(libro.getNombre(), i, 1);
                dtm.setValueAt(libro.getIdAutor(), i, 2);
                dtm.setValueAt(libro.getAño(), i, 3);
        }
        return dtm;
    }
    
    DefaultTableModel mostrarAutores(ArrayList<Autor> autores) {
        Object [] header = {"ID", "Nombre", "Primer Apellido", "Segundo Apellido"};
            DefaultTableModel dtm = new DefaultTableModel(header, autores.size());
            for (int i = 0; i < dtm.getRowCount(); i++) {
                Autor autor = autores.get(i);
                dtm.setValueAt(autor.getId(), i, 0);
                dtm.setValueAt(autor.getNombre(), i, 1);
                dtm.setValueAt(autor.getPrimerApellido(), i, 2);
                dtm.setValueAt(autor.getSegundoApellido(), i, 3);
        }
        return dtm;
    }
    
}
