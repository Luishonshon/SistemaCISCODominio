
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
 * clase que modela la tabla de computadoras
 * @author erwbyel
 */
@Entity
@Table(name = "computadoras")
public class ComputadoraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "ip", length = 15 , nullable =  false)
    private String ip;
    
    @Column(name = "numero", length = 3, nullable =  false)
    private String numero;
    
    @Column(name = "estaDisponible", nullable =  false)
    private boolean estaDisponible;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_laboratorio")
    private LaboratorioDominio laboratorio;
    
    @OneToMany(mappedBy = "computadora")
    private List<ComputadoraSoftwareDominio> softwares;
    
    @OneToMany(mappedBy = "computadora")
    private List<AlumnoComputadoraDominio> reservaciones;
}
