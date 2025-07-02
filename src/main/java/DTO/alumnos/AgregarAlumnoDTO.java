/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.alumnos;

import Dominio.CarreraDominio;

/**
 *
 * @author santi
 */
public class AgregarAlumnoDTO {
    
    private String nombre;
   
    private String apellidoPaterno;
    
    private String apellidoMaterno;
    
    private String contraseña;
    
    private  boolean estado;

    private CarreraDominio carrera;

    public AgregarAlumnoDTO(String nombre, String apellidoPaterno, String apellidoMaterno, String contraseña, boolean estado, CarreraDominio carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contraseña = contraseña;
        this.estado = estado;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public CarreraDominio getCarrera() {
    return carrera;
    }

    
    
}
