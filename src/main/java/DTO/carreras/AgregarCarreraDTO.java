
package DTO.carreras;

/**
 *
 * @author santi
 */
public class AgregarCarreraDTO {
    private String nombre;
    private String telefono;    
    private Integer tiempoLimite;

    public AgregarCarreraDTO(String nombre,String telefono, Integer tiempoLimite) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public Integer getTiempoLimite() {
        return tiempoLimite;
    }    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTiempoLimite(Integer tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }
}
