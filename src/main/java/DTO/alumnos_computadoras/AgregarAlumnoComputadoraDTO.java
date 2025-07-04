
package DTO.alumnos_computadoras;

import Dominio.ComputadoraDominio;
import Dominio.AlumnoDominio;
import java.util.Date;

/**
 *
 * @author angel
 */
public class AgregarAlumnoComputadoraDTO {
    private Date fechaInicio;
    private Date fechaFin;
    private AlumnoDominio alumno;
    private ComputadoraDominio computadora;

    public AgregarAlumnoComputadoraDTO(Date fechaInicio, Date fechaFin, AlumnoDominio alumno, ComputadoraDominio computadora) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.alumno = alumno;
        this.computadora = computadora;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }
}
