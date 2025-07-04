
package DTO.bloqueos_reglas;

import Dominio.BloqueoDominio;
import Dominio.ReglaDominio;

/**
 *
 * @author angel
 */
public class AgregarBloqueoReglaDTO {
    private String motivo;
    private BloqueoDominio bloqueo;
    private ReglaDominio regla;

    public AgregarBloqueoReglaDTO(String motivo, BloqueoDominio bloqueo, ReglaDominio regla) {
        this.motivo = motivo;
        this.bloqueo = bloqueo;
        this.regla = regla;
    }

    public String getMotivo() {
        return motivo;
    }

    public BloqueoDominio getBloqueo() {
        return bloqueo;
    }

    public ReglaDominio getRegla() {
        return regla;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setBloqueo(BloqueoDominio bloqueo) {
        this.bloqueo = bloqueo;
    }

    public void setRegla(ReglaDominio regla) {
        this.regla = regla;
    }
    
}
