package org.co.edu.uniquindio.tiendaRopa.Model;

import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Color;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Talla;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.TipoCliente;

public class Prenda {
    private String tipoPrenda;
    private String referencia;
    private TipoCliente tipoCliente;
    private Talla talla;
    private Color color;
    private double precio;
    private int cantidadDisponible;

    /* Constructor Vacío */
    public Prenda() {
    }

    /* Constructor */
    public Prenda(String tipoPrenda, String referencia, TipoCliente tipoCliente, Talla talla, Color color, double precio, int cantidadDisponible) {
        this.tipoPrenda = tipoPrenda;
        this.referencia = referencia;
        this.tipoCliente = tipoCliente;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    /* Getters and Setters */
    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}