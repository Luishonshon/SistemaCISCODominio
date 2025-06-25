package DTO.reservas;

import java.time.LocalDateTime;

/**
 *
 * @author luishonshon
 */
public class GuardarReservaDTO {
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Long idAlumno;
    private Long idComputadora;

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Long getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(Long idComputadora) {
        this.idComputadora = idComputadora;
    }
}

