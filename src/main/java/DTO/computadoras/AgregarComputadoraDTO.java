/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.computadoras;

import Dominio.Centro;

/**
 *
 * @author santi
 */
public class AgregarComputadoraDTO {
    private Long id;
    
    private int numero;
        
    private String ip;
    
    private boolean estado;
    
    private Centro centro;    

    public AgregarComputadoraDTO(Long id, int numero, String ip, boolean estado, Centro centro) {
        this.id = id;
        this.numero = numero;
        this.ip = ip;
        this.estado = estado;
        this.centro = centro;
    }

    public Long getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getIp() {
        return ip;
    }

    public boolean isEstado() {
        return estado;
    }

    public Centro getCentro() {
        return centro;
    }
    
    
}
