/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.software;

import Dominio.Computadora;
import Dominio.Software;

/**
 *
 * @author santi
 */
public class InstalarSoftwareDTO {
    private String version;

    private Computadora computadora;
 
    private Software software;

    public InstalarSoftwareDTO(String version, Computadora computadora, Software software) {
        this.version = version;
        this.computadora = computadora;
        this.software = software;
    }

    public String getVersion() {
        return version;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public Software getSoftware() {
        return software;
    }
    
    
}
