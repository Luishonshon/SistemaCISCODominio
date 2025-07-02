package Dominio;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * clase que modela la tabla laboratorio
 * @author angel
 */
@Entity
public class LaboratorioDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "horaApertura", nullable = false)
    private LocalTime horaApertura;
    
    @Column(name = "horaCierre", nullable = false)
    private LocalTime horaCierre;
    
    @Column(name = "nombre", length = 15, nullable = false)
    private String nombre;

    @Column(name = "contraseña", length = 30, nullable = false)
    private String contraseña;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_centro")
    private CentroDominio centro;

    @OneToMany(mappedBy = "laboratorio")
    private List<ComputadoraDominio> computadoras;
}
