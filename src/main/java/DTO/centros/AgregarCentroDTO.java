
package DTO.centros;

/**
 * dto que permite agregar un centro
 * @author erwbyel
 */
public class AgregarCentroDTO {
    private String nombre;
    public AgregarCentroDTO(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
