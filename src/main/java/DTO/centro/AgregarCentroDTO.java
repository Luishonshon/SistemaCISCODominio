/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.centro;

import Dominio.Plantel;
import java.time.LocalDate;

/**
 *
* @author santi
 */
public class AgregarCentroDTO {
    private String nombre;

    private String contraseña;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;
    
    private Plantel plantel;

    public AgregarCentroDTO(String nombre, String contraseña, LocalDate fechaInicio, LocalDate fechaFin, Plantel plantel) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.plantel =plantel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public Plantel getPlantel() {
        return plantel;
    }
    
    
}
