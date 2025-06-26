/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.alumnos;

import Dominio.Alumno;
import java.time.LocalDate;

/**
 *
 * @author santi
 */
public class BloquearAlumnoDTO {
    private String motivo;
    
    private  LocalDate  fechaBloqueo;
    
    private Alumno alumno;

    public BloquearAlumnoDTO(String motivo, LocalDate fechaBloqueo, Alumno alumno) {
        this.motivo = motivo;
        this.fechaBloqueo = fechaBloqueo;
        this.alumno = alumno;
    }

    public String getMotivo() {
        return motivo;
    }

    public LocalDate getFechaBloqueo() {
        return fechaBloqueo;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
    
    
}
