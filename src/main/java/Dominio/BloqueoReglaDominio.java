
package Dominio;

import java.io.Serializable;
import java.util.Date;
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
 * clase que modela la tabla intermedia Bloqueo - Regla
 * @author erwbyel
 */
@Entity
@Table(name = "bloqueos_reglas")
public class BloqueoReglaDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBloqueo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesbloqueo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_bloqueo")
    private BloqueoDominio bloqueo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_regla")
    private ReglaDominio regla;
}
