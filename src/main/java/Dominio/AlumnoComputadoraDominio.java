
package Dominio;

import java.io.Serializable;
import java.time.LocalDateTime;
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
 * clase que modela la tabla intermediaria Alumno - Computadora
 * @author erwbyel
 */
@Entity
@Table(name = "alumnos_computadoras")
public class AlumnoComputadoraDominio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicio", nullable =  false)
    private  LocalDateTime  fechaInicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_fin", nullable =  false)
    private  LocalDateTime  fechaFin;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_alumno")
    private AlumnoDominio alumno;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_computadora")
    private ComputadoraDominio computadora;

    public AlumnoComputadoraDominio(LocalDateTime fechaInicio, LocalDateTime fechaFin, AlumnoDominio alumno, ComputadoraDominio computadora) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.alumno = alumno;
        this.computadora = computadora;
    }

    public AlumnoComputadoraDominio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }
}
