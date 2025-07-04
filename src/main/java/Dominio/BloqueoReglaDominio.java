
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * clase que modela la tabla intermedia Bloqueo - Regla
 * @author erwbyel
 */
@Entity
@Table(name = "bloqueos_reglas")
public class BloqueoReglaDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "motivo", length = 300, nullable = false)
    private String motivo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_bloqueo")
    private BloqueoDominio bloqueo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_regla")
    private ReglaDominio regla;

    /**
     * constructor completo
     * @param motivo
     * @param bloqueo
     * @param regla 
     */
    public BloqueoReglaDominio(String motivo, BloqueoDominio bloqueo, ReglaDominio regla) {
        this.motivo = motivo;
        this.bloqueo = bloqueo;
        this.regla = regla;
    }
    
    /**
     * constructor por ausencia
     */
    public BloqueoReglaDominio(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public BloqueoDominio getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(BloqueoDominio bloqueo) {
        this.bloqueo = bloqueo;
    }

    public ReglaDominio getRegla() {
        return regla;
    }

    public void setRegla(ReglaDominio regla) {
        this.regla = regla;
    }
}
