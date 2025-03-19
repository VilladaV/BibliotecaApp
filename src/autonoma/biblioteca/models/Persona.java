/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * Modelo que permite representar una persona
 * 
 * @author Johan Andrés Villada Valencia
 * @since 20250311
 * @version 1.0.0
 * 
 */
public class Persona {
  
    
    /**
     * Nombre de la persona
     */
    private String nombre;
    
    /**
     * Documento de la persona
     */
    private String documentoIdentidad;
    
    
    /*
    Correo de la persona
    */
    private String correoElectronico;
    
    /*
    Constructor
    */
    
    public Persona(String nombre, String documentoIdentidad, String correoElectronico){
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    };
    

    /// Getters & Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
    
    
}


