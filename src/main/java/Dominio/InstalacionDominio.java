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
public class InstalacionDominio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_computadora")
    private ComputadoraDominio computadora;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_software")
    private SoftwareDominio software;

    public InstalacionDominio(ComputadoraDominio computadora, SoftwareDominio software) {
        this.computadora = computadora;
        this.software = software;
    }

    public InstalacionDominio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }

    public SoftwareDominio getSoftware() {
        return software;
    }

    public void setSoftware(SoftwareDominio software) {
        this.software = software;
    }
}
