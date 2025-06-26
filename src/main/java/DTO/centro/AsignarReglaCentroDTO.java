/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.centro;

import Dominio.Centro;
import Dominio.Regla;

/**
 *
 * @author santi
 */
public class AsignarReglaCentroDTO {
    private Centro centro;
    
    private Regla regla;

    public AsignarReglaCentroDTO(Centro centro, Regla regla) {
        this.centro = centro;
        this.regla = regla;
    }

    public Centro getCentro() {
        return centro;
    }

    public Regla getRegla() {
        return regla;
    }
    
    
}
