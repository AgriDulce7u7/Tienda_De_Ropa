package org.co.edu.uniquindio.tiendaRopa.Model;

public class Prenda {
    private String tipoPrenda;
    private String referencia;
    private String tipoCliente;
    private String talla;
    private String color;
    private double precio;
    private int cantidadDisponible;

    /* Constructor Vacío */
    public Prenda() {
    }

    /* Constructor */
    public Prenda(String tipoPrenda, String referencia, String tipoCliente, String talla, String color, double precio, int cantidadDisponible) {
        this.tipoPrenda = tipoPrenda;
        this.referencia = referencia;
        this.tipoCliente = tipoCliente;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

}
