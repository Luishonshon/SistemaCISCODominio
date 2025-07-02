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

    @Column(name = "motivo", length = 300, nullable = false)
    private String motivo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_alumno")
    private AlumnoDominio alumno;
    
    @OneToMany(mappedBy = "bloqueo" )
    private List<BloqueoReglaDominio> reglas;
}
