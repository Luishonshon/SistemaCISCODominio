package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * clase que modela la tabla de carreras
 * @author erwbyel
 */
@Entity
@Table(name = "carreras")
public class CarreraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @Column(name = "tiempoLimite", nullable = false)
    private Integer tiempoLimite;

    @OneToMany(mappedBy = "carrera")
    private List<AlumnoDominio> alumnos;
}
