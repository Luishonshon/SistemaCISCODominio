package DTO.alumnos;

import Dominio.CarreraDominio;

/**
 * clase dto que permite agregar un nuevo alumno
 * @author santi
 */
public class AgregarAlumnoDTO {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contraseña;
    private boolean estaInscrito;
    private CarreraDominio carrera;

    public AgregarAlumnoDTO(String nombre, String apellidoPaterno, String apellidoMaterno, String contraseña, boolean estaInscrito, CarreraDominio carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contraseña = contraseña;
        this.estaInscrito = estaInscrito;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean getEstaInscrito() {
        return estaInscrito;
    }

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstaInscrito(boolean estaInscrito) {
        this.estaInscrito = estaInscrito;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }
}
