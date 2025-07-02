package Dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * clase que modela la tabla intermedia Computadora - Software
 * @author erwbyel
 */
@Entity
@Table(name = "instalaciones")
public class ComputadoraSoftwareDominio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_computadora")
    private ComputadoraDominio computadora;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_software")
    private SoftwareDominio software;

}
