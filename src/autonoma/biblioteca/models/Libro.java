/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author Juan Esteban Giraldo Betancur
 * @since 2025311
 * @version 1.0.0
 */
public class Libro {
    //////////////////////////////////////////
    //////////////////atributos
    
/**
 * Clase que representa un libro en la biblioteca
 * Cada libro tiene un identificador y un titulo
 */
    /** Identificador del libro */
    private long id;

    /** titulo del libro */
    private String titulo;

    /**
     * Constructor para crear un nuevo libro con el id y título especificados.
     * 
     * @param id     identificador del libro
     * @param titulo titulo del libro
     */
    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    /**
     * obtiene el identificador del libro.
     * 
     * @return El id del libro.
     */
    public long getId() {
        return id;
    }

    /**
     * establece un nuevo identificador para el libro
     * 
     * @param id  nuevo identificador del libro
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obtiene el titulo del libro
     * 
     * @return El titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro
     * 
     * @param titulo El nuevo titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * devuelve una representación en texto del libro
     * 
     * @return cadena que representa al libro
     */
    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo='" + titulo + '\'' + '}';
    }
}