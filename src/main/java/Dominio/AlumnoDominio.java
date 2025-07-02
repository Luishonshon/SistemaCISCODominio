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
 * clase que modela la tabla de alumnos
 * @author erwbyel
 */
@Entity
@Table(name = "alumnos")
public class AlumnoDominio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 30 , nullable = false)
    private String nombre;
    
    @Column(name = "apellido_paterno", length = 70 , nullable = false)
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno", length = 70)
    private String apellidoMaterno; 
    
    @Column(name = "contraseña", length = 100 , nullable = false)
    private String contraseña;
    
    @Column(name = "estado",  nullable = false)
    private  boolean estaInscrito;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_carrera")
    private CarreraDominio carrera;
    
    @OneToMany(mappedBy = "alumno")
    private List<BloqueoDominio> bloqueos;
    
    @OneToMany(mappedBy = "alumno")
    private List<AlumnoComputadoraDominio> reservaciones;

    /**
     * constructor total
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param contraseña
     * @param estaInscrito
     * @param carrera 
     */
    public AlumnoDominio(String nombre, String apellidoPaterno, String apellidoMaterno, String contraseña, boolean estaInscrito, CarreraDominio carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contraseña = contraseña;
        this.estaInscrito = estaInscrito;
        this.carrera = carrera;
    }
    
    /**
     * construtor por ausencia
     */
    public AlumnoDominio(){
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

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstaInscrito() {
        return estaInscrito;
    }

    public void setEstaInscrito(boolean estaInscrito) {
        this.estaInscrito = estaInscrito;
    }

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }

    public List<BloqueoDominio> getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(List<BloqueoDominio> bloqueos) {
        this.bloqueos = bloqueos;
    }

    public List<AlumnoComputadoraDominio> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<AlumnoComputadoraDominio> reservaciones) {
        this.reservaciones = reservaciones;
    }   
}
