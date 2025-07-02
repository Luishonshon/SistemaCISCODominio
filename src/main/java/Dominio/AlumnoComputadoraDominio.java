
package Dominio;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "Reservaciones")
public class AlumnoComputadoraDominio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaInicio", nullable =  false)
    private  LocalDateTime  fechaInicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaFin", nullable =  false)
    private  LocalDateTime  fechaFin;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_alumno")
    private AlumnoDominio alumno;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_computadora")
    private ComputadoraDominio computadora;
}
