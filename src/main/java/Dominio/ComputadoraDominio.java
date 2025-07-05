
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
 * clase que modela la tabla de computadoras
 * @author erwbyel
 */
@Entity
@Table(name = "computadoras")
public class ComputadoraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "ip", length = 15 , nullable =  false)
    private String ip;
    
    @Column(name = "numero", length = 3, nullable =  false)
    private String numero;
    
    @Column(name = "esta_disponible", nullable =  false)
    private boolean estaDisponible;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_laboratorio")
    private LaboratorioDominio laboratorio;
    
    @OneToMany(mappedBy = "computadora")
    private List<InstalacionDominio> softwares;
    
    @OneToMany(mappedBy = "computadora")
    private List<ReservacionDominio> reservaciones;

    /**
     * constructor completo
     * @param ip
     * @param numero
     * @param estaDisponible
     * @param laboratorio 
     */
    public ComputadoraDominio(String ip, String numero, boolean estaDisponible, LaboratorioDominio laboratorio) {
        this.ip = ip;
        this.numero = numero;
        this.estaDisponible = estaDisponible;
        this.laboratorio = laboratorio;
    }

    /**
     * constructor por ausencia
     */
    public ComputadoraDominio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public LaboratorioDominio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(LaboratorioDominio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public List<InstalacionDominio> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<InstalacionDominio> softwares) {
        this.softwares = softwares;
    }

    public List<ReservacionDominio> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<ReservacionDominio> reservaciones) {
        this.reservaciones = reservaciones;
    }
}
