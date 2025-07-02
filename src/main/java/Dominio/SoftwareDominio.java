
package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * clase que modela la tabla de software
 * @author erwbyel
 */
@Entity
@Table(name = "software")
public class SoftwareDominio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50 , nullable = false)
    private String nombre;
    
    @Column(name = "version", length = 10 , nullable = false)
    private String version;
    
    @OneToMany(mappedBy = "software")
    private List<ComputadoraSoftwareDominio> instalaciones;
}
