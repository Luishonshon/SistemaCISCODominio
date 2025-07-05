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
 * clase que modela la tabla de reglas
 * @author erwbyel
 */
@Entity
@Table(name = "reglas")
public class ReglaDominio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "descripcion", length = 300 , nullable = false)
    private String descripcion;
 
    @OneToMany(mappedBy = "regla")
    private List<BloqueoDominio> bloqueos;
    
    /**
     * constructor completo
     * @param descripcion 
     */
    public ReglaDominio(String descripcion){
        this.descripcion = descripcion;
    }
    
    /**
     * constructor por ausencia
     */
    public ReglaDominio(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<BloqueoDominio> getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(List<BloqueoDominio> bloqueos) {
        this.bloqueos = bloqueos;
    }
}
