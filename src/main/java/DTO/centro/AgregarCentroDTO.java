/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.centro;

import Dominio.Plantel;
import java.time.LocalTime;

/**
 *
* @author santi
 */
public class AgregarCentroDTO {
    private String nombre;

    private String contraseña;
    
    private Plantel plantel;

    private LocalTime tiempoInicio;

    private LocalTime fechaFin;

    public AgregarCentroDTO(String nombre, String contraseña, Plantel plantel, LocalTime tiempoInicio, LocalTime fechaFin) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.plantel = plantel;
        this.tiempoInicio = tiempoInicio;
        this.fechaFin = fechaFin;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Plantel getPlantel() {
        return plantel;
    }

    public LocalTime getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(LocalTime tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public LocalTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalTime fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
