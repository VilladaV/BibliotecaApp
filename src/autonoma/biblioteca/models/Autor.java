/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;
 /**
  * 
  * Modelo que permite representar una autor
/**
 *
 * @author Juan Simon Patiño
 * @since 20250312
 * @version 1.0.0
 */

public class Autor extends Persona {    
    /**
     * Nombre De la Editorial
     */
    private final String editorial;    
    /**
     * Nombre De la Profesion
     */
    private final String profesion;

    public Autor(String nombre, String documentoIdentidad, String correoElectronico,String editorial, String profesion) {        
        super(nombre, documentoIdentidad, correoElectronico); 
        this.editorial = editorial;        
        this.profesion = profesion;
    }      

    public String getEditorial() {        
        return editorial;    
    }    

    public String getProfesion() {        
        return profesion;    
    }
}
