/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author david
 */
public class Libro {
    int codigo;
    String nombre;
    int idAutor;
    int año;

    public Libro(int codigo, String nombre, int idAutor, int año) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.idAutor = idAutor;
        this.año = año;
    }

    public Libro() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", nombre=" + nombre + ", idAutor=" + idAutor + ", a\u00f1o=" + año + '}';
    }
}
