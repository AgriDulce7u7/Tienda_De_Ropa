package org.co.edu.uniquindio.tiendaRopa.Model;

import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Sexo;

public class Cliente {
    private String nombreCompleto;
    private long numeroIdentificacion;
    private Sexo sexo;
    private int prendasCompradas;
    private String fechaUltimaCompra;

    /* Constructor Vacío */
    public Cliente() {
    }

    /* Constructor */
    public Cliente(String nombreCompleto, long numeroIdentificacion, Sexo sexo, int prendasCompradas, String fechaUltimaCompra) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sexo = sexo;
        this.prendasCompradas = prendasCompradas;
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    /* Getters and Setters */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getPrendasCompradas() {
        return prendasCompradas;
    }

    public void setPrendasCompradas(int prendasCompradas) {
        this.prendasCompradas = prendasCompradas;
    }

    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(String fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }
}
