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
 * clase que modela la tabla de centros de computo
 * @author erwbyel
 */
@Entity
@Table(name = "centros")
public class CentroDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 80, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "centro")
    private List<LaboratorioDominio> laboratorios;

    public CentroDominio(String nombre) {
        this.nombre = nombre;
    }
    
    public CentroDominio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<LaboratorioDominio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(List<LaboratorioDominio> laboratorios) {
        this.laboratorios = laboratorios;
    }
}
