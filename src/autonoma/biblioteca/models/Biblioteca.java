/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * @author PABLO VI
 */
import java.util.ArrayList;

/**
 * Clase que representa biblioteca
 * gestiona colección de libros y permite realizar
 * operaciones como agregar, buscar, eliminar o actualizar libros
 */
public class Biblioteca {

    /** lista de libros que pertenecen a la biblioteca */
    private ArrayList<Libro> libros;

    /**
     * Constructor de la clase Biblioteca
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * muestra todos los libros en la biblioteca 
     * 
     * @return Una cadena con la informacion de todos los libros
     */
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }

        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * agrega un nuevo libro a la biblioteca
     * 
     * @param libro libro que se desea agregar
     * @return true si se agrego correctamente, false si el libro ya existe
     */
    public boolean agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            return true;
        }
        return false;
    }

    /**
     *buscar libro por ID
     * 
     * @param id identificador del libro a buscar
     * @return libro si se encuentra, o null si no existe.
     */
    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    /**
     * actualiza libro existente en la biblioteca con nuevo
     * 
     * @param id  ID del libro a actualizar
     * @param nuevoLibro nuevo libro con la informacion actualizada
     * @return true si se actualizo correctamente, false si el libro no existe
     */
    public boolean actualizarLibro(long id, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, nuevoLibro);
                return true;
            }
        }
        return false;
    }

    /**
     * elimina un libro de la biblioteca por ID
     * 
     * @param id ID del libro que se desea eliminar
     * @return true si se elimino correctamente, false si no se encontro el libro
     */
    public boolean eliminarLibro(long id) {
        Libro libroAEliminar = buscarLibro(id);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            return true;
        }
        return false;
    }

    /**
     * obtiene lista de libros ordenada alfabeticamente por título
     * 
     * @return nueva lista de libros ordenada alfabeticamente
     */
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort((l1, l2) -> l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
        return librosOrdenados;
    }
}
