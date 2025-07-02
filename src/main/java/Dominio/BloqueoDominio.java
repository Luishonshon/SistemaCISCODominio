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

    /**
     * constructor completo
     * @param motivo
     * @param alumno 
     */
    public BloqueoDominio(String motivo, AlumnoDominio alumno) {
        this.motivo = motivo;
        this.alumno = alumno;
    }
    
    /**
     * constructor por ausencia
     */
    public BloqueoDominio(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public AlumnoDominio getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoDominio alumno) {
        this.alumno = alumno;
    }

    public List<BloqueoReglaDominio> getReglas() {
        return reglas;
    }

    public void setReglas(List<BloqueoReglaDominio> reglas) {
        this.reglas = reglas;
    }
}
