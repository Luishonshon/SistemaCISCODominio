/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.reportes;

import Dominio.CarreraDominio;
import Dominio.CentroDominio;
import java.time.LocalDate;

/**
 *
 * @author santi
 */
public class FiltroReporteCentro {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int offset = 0;
    private int limit = 10;
    private CentroDominio centro;
    private CarreraDominio carrera;

    public FiltroReporteCentro() {
    }

    public FiltroReporteCentro(LocalDate fechaInicio, LocalDate fechaFin, int offset, int limit, CentroDominio centro, CarreraDominio carrera) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.offset = offset;
        this.limit = limit;
        this.centro = centro;
        this.carrera = carrera;
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

    public CentroDominio getCentro() {
        return centro;
    }

    public void setCentro(CentroDominio centro) {
        this.centro = centro;
    }

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }
}

