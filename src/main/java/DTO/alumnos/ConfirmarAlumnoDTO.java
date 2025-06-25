package DTO.alumnos;

/**
 *
 * @author luishonshon
 */
public class ConfirmarAlumnoDTO {
    private Long id;
    private String contraseña;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
