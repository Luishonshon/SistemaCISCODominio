/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.reportes;

import java.time.LocalDate;

/**
 *
 * @author LABCISCO-PC036
 */
public class ReporteCentroDTO {
   private String nombre;
   
   private int Computadoras;
   
   private int alumnos;
   
   private int minutos;
   
   private LocalDate fecha;

    public ReporteCentroDTO(String nombre, int Computadoras, int alumnos, int minutos, LocalDate fecha) {
        this.nombre = nombre;
        this.Computadoras = Computadoras;
        this.alumnos = alumnos;
        this.minutos = minutos;
        this.fecha = fecha;
    }

    public ReporteCentroDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getComputadoras() {
        return Computadoras;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public int getMinutos() {
        return minutos;
    }

    public LocalDate getFecha() {
        return fecha;
    }
   
   
    
}
