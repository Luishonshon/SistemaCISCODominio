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
public class ReporteCarrerasDTO {
    private String nombre;
    private int minutos;
    private int alumnos;
    private LocalDate fecha;

    public ReporteCarrerasDTO(String nombre, int minutos, int alumnos, LocalDate fecha) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.alumnos = alumnos;
        this.fecha = fecha;
    }

    public ReporteCarrerasDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    
}
