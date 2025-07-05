package Dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
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
 * clase que modela la tabla de bloqueos
 *
 * @author erwbyel
 */
@Entity
@Table(name = "bloqueos")
public class BloqueoDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBloqueo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesbloqueo;

    @Column(name = "motivo", length = 300, nullable = false)
    private String motivo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_alumno")
    private AlumnoDominio alumno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_regla")
    private ReglaDominio regla;

    /**
     * constructor completo
     *
     * @param fechaBloqueo
     * @param fechaDesbloqueo
     * @param motivo
     * @param alumno
     */
    public BloqueoDominio(Date fechaBloqueo, Date fechaDesbloqueo, String motivo ,AlumnoDominio alumno) {
        this.fechaBloqueo = fechaBloqueo;
        this.fechaDesbloqueo = fechaBloqueo;
        this.motivo = motivo;
        this.alumno = alumno;
    }

    /**
     * constructor por ausencia
     */
    public BloqueoDominio() {

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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }

    public ReglaDominio getRegla() {
        return regla;
    }

    public void setRegla(ReglaDominio regla) {
        this.regla = regla;
    }
}
