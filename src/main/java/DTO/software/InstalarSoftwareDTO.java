/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.software;

import Dominio.ComputadoraDominio;
import Dominio.SoftwareDominio;

/**
 *
 * @author santi
 */
public class InstalarSoftwareDTO {
    private String version;

    private ComputadoraDominio computadora;
 
    private SoftwareDominio software;

    public InstalarSoftwareDTO(String version, ComputadoraDominio computadora, SoftwareDominio software) {
        this.version = version;
        this.computadora = computadora;
        this.software = software;
    }

    public String getVersion() {
        return version;
    }

    public ComputadoraDominio getComputadora() {
        return computadora;
    }

    public SoftwareDominio getSoftware() {
        return software;
    }
    
    
}
