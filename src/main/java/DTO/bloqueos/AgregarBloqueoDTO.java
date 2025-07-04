
package DTO.bloqueos;

import Dominio.AlumnoDominio;

/**
 * clase dto para agregar bloqueo
 * @author erwbyel
 */
public class AgregarBloqueoDTO {
    private String motivo;
    private AlumnoDominio alumno;

    public AgregarBloqueoDTO(String motivo, AlumnoDominio alumno) {
        this.motivo = motivo;
        this.alumno = alumno;
    }

    public String getMotivo() {
        return motivo;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }
}
