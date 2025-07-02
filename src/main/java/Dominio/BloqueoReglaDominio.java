
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * clase que modela la tabla intermedia Bloqueo - Regla
 * @author erwbyel
 */
@Entity
@Table(name = "bloqueos_reglas")
public class BloqueoReglaDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBloqueo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesbloqueo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_bloqueo")
    private BloqueoDominio bloqueo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_regla")
    private ReglaDominio regla;

    /**
     * constructor completo
     * @param fechaBloqueo
     * @param fechaDesbloqueo
     * @param bloqueo
     * @param regla 
     */
    public BloqueoReglaDominio(Date fechaBloqueo, Date fechaDesbloqueo, BloqueoDominio bloqueo, ReglaDominio regla) {
        this.fechaBloqueo = fechaBloqueo;
        this.fechaDesbloqueo = fechaDesbloqueo;
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

    public Date getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Date fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public Date getFechaDesbloqueo() {
        return fechaDesbloqueo;
    }

    public void setFechaDesbloqueo(Date fechaDesbloqueo) {
        this.fechaDesbloqueo = fechaDesbloqueo;
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
