package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * clase que modela la tabla de carreras
 * @author erwbyel
 */
@Entity
@Table(name = "carreras")
public class CarreraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @Column(name = "tiempo_limite", nullable = false)
    private Integer tiempoLimite;

    @OneToMany(mappedBy = "carrera")
    private List<AlumnoDominio> alumnos;

    /**
     * constructor completo
     * @param nombre
     * @param telefono
     * @param tiempoLimite 
     */
    public CarreraDominio(String nombre, String telefono, Integer tiempoLimite) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tiempoLimite = tiempoLimite;
    }
    
    /**
     * constructor por ausencia
     */
    public CarreraDominio(){
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(Integer tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public List<AlumnoDominio> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<AlumnoDominio> alumnos) {
        this.alumnos = alumnos;
    }
}
