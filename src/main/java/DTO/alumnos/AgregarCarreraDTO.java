/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.alumnos;

/**
 *
 * @author santi
 */
public class AgregarCarreraDTO {
    private String nombre;
     
    private int tiempoLimite;
     
    private String telefono;    

    public String getNombre() {
        return nombre;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public String getTelefono() {
        return telefono;
    }

    public AgregarCarreraDTO(String nombre, int tiempoLimite, String telefono) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.telefono = telefono;
    }
    
    
}
