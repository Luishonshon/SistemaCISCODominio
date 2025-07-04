
package DTO.reglas;

/**
 * dto para guardar una regla
 * @author angel
 */
public class AgregarReglaDTO {
    private String descripcion;

    public AgregarReglaDTO(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
