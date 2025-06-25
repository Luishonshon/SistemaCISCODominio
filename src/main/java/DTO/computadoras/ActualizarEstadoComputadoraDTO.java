package DTO.computadoras;

/**
 *
 * @author luishonshon
 */
public class ActualizarEstadoComputadoraDTO {
    private long idComputadora;
    private String estadoNuevo;

    public long getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(long idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getEstadoNuevo() {
        return estadoNuevo;
    }

    public void setEstadoNuevo(String estadoNuevo) {
        this.estadoNuevo = estadoNuevo;
    }
}
