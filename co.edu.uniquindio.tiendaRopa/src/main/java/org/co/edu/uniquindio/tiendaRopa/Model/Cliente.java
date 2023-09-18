package org.co.edu.uniquindio.tiendaRopa.Model;

public class Cliente {
    private String nombreCompleto;
    private long numeroIdentificacion;
    private String sexo;
    private int prendasCompradas;
    private String fechaUltimaCompra;

    /* Constructor Vacío */
    public Cliente() {
    }

    /* Constructor */
    public Cliente(String nombreCompleto, long numeroIdentificacion, String sexo, int prendasCompradas, String fechaUltimaCompra) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sexo = sexo;
        this.prendasCompradas = prendasCompradas;
        this.fechaUltimaCompra = fechaUltimaCompra;
    }
}
