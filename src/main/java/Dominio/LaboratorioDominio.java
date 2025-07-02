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
import javax.persistence.Table;

/**
 * clase que modela la tabla laboratorio
 * @author erwbyel
 */
@Entity
@Table(name = "laboratorio")
public class LaboratorioDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hora_apertura", nullable = false)
    private LocalTime horaApertura;
    
    @Column(name = "hora_cierre", nullable = false)
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

    public LaboratorioDominio(LocalTime horaApertura, LocalTime horaCierre, String nombre, String contraseña, CentroDominio centro) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.centro = centro;
    }

    public LaboratorioDominio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public CentroDominio getCentro() {
        return centro;
    }

    public void setCentro(CentroDominio centro) {
        this.centro = centro;
    }

    public List<ComputadoraDominio> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(List<ComputadoraDominio> computadoras) {
        this.computadoras = computadoras;
    }
}
