
package DTO.software;

/**
 *
 * @author angel
 */
public class AgregarSoftwareDTO {
    private String nombre;
    private String version;

    public AgregarSoftwareDTO(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
