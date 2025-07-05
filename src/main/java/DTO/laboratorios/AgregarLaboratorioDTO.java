
package DTO.laboratorios;

import Dominio.CentroDominio;
import java.time.LocalTime;

/**
 *
 * @author angel
 */
public class AgregarLaboratorioDTO {
    private String nombre;
    private String contraseña;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private CentroDominio centro;

    public AgregarLaboratorioDTO(String nombre, String contraseña, LocalTime horaApertura, LocalTime horaCierre, CentroDominio centro) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public CentroDominio getCentro() {
        return centro;
    }

    public void setCentro(CentroDominio centro) {
        this.centro = centro;
    }
}
