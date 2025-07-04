
package DTO.computadoras;

import Dominio.CentroDominio;

/**
 *
 * @author santi
 */
public class AgregarComputadoraDTO {
    
    private int numero;
    private String ip;
    private boolean estado;
    private CentroDominio centro;    

    public AgregarComputadoraDTO(int numero, String ip, boolean estado, CentroDominio centro) {
        this.numero = numero;
        this.ip = ip;
        this.estado = estado;
        this.centro = centro;
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

    public CentroDominio getCentro() {
        return centro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCentro(CentroDominio centro) {
        this.centro = centro;
    }
}
