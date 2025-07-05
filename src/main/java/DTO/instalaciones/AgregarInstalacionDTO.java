
package DTO.instalaciones;

import Dominio.ComputadoraDominio;
import Dominio.SoftwareDominio;

/**
 *
 * @author angel
 */
public class AgregarInstalacionDTO {
    private ComputadoraDominio computadora;
    private SoftwareDominio software;

    public AgregarInstalacionDTO(ComputadoraDominio computadora, SoftwareDominio software) {
        this.computadora = computadora;
        this.software = software;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public SoftwareDominio getSoftware() {
        return software;
    }

    public void setComputadora(ComputadoraDominio computadora) {
        this.computadora = computadora;
    }

    public void setSoftware(SoftwareDominio software) {
        this.software = software;
    }
}
