/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.reportes;

import Dominio.CarreraDominio;
import java.time.LocalDate;

/**
 *
 * @author santi
 */
public class FiltroReporteCarrera {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int offset;
    private int limit;
    private CarreraDominio carrera;

    public FiltroReporteCarrera(LocalDate fechaInicio, LocalDate fechaFin, int offset, int limit, CarreraDominio carrera) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.offset = offset;
        this.limit = limit;
        this.carrera = carrera;
    }

    public FiltroReporteCarrera() {
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }
    
    
}
