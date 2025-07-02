package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * clase que modela la tabla de alumnos
 * @author erwbyel
 */
@Entity
@Table(name = "alumnos")
public class AlumnoDominio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 30 , nullable = false)
    private String nombre;
    
    @Column(name = "apellidoPaterno", length = 70 , nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellidoMaterno", length = 70)
    private String apellidoMaterno; 
    
    @Column(name = "contraseña", length = 100 , nullable = false)
    private String contraseña;
    
    @Column(name = "estado",  nullable = false)
    private  boolean estaInscrito;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_carrera")
    private CarreraDominio carrera;
    
    @OneToMany(mappedBy = "alumno")
    private List<BloqueoDominio> bloqueos;
    
    @OneToMany(mappedBy = "alumno")
    private List<AlumnoComputadoraDominio> reservaciones;
}
