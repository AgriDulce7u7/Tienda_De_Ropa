package org.co.edu.uniquindio.tiendaRopa.Model;

import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Sexo;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Talla;

public class Tienda {
    private Prenda prenda1;
    private Prenda prenda2;
    private Prenda prenda3;
    private Prenda prenda4;
    private Prenda prenda5;
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    private Cliente cliente4;
    private Cliente cliente5;

    /* Getters and Setters */

    public Prenda getPrenda1() {
        return prenda1;
    }

    public void setPrenda1(Prenda prenda1) {
        this.prenda1 = prenda1;
    }

    public Prenda getPrenda2() {
        return prenda2;
    }

    public void setPrenda2(Prenda prenda2) {
        this.prenda2 = prenda2;
    }

    public Prenda getPrenda3() {
        return prenda3;
    }

    public void setPrenda3(Prenda prenda3) {
        this.prenda3 = prenda3;
    }

    public Prenda getPrenda4() {
        return prenda4;
    }

    public void setPrenda4(Prenda prenda4) {
        this.prenda4 = prenda4;
    }

    public Prenda getPrenda5() {
        return prenda5;
    }

    public void setPrenda5(Prenda prenda5) {
        this.prenda5 = prenda5;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
    }

    public Cliente getCliente4() {
        return cliente4;
    }

    public void setCliente4(Cliente cliente4) {
        this.cliente4 = cliente4;
    }

    public Cliente getCliente5() {
        return cliente5;
    }

    public void setCliente5(Cliente cliente5) {
        this.cliente5 = cliente5;
    }

    /* Mostrar la información de las prendas */
    public void mostrarInformacionPrendas(){
        String informacionPrenda1 = getPrenda1().obtenerInformacion();
        System.out.println("La información de la prenda 1 es: "+"\n"+informacionPrenda1);
        String informacionPrenda2 = getPrenda2().obtenerInformacion();
        System.out.println("La información de la prenda 2 es: "+"\n"+informacionPrenda2);
        String informacionPrenda3 = getPrenda3().obtenerInformacion();
        System.out.println("La información de la prenda 3 es: "+"\n"+informacionPrenda3);
        String informacionPrenda4 = getPrenda4().obtenerInformacion();
        System.out.println("La información de la prenda 4 es: "+"\n"+informacionPrenda4);
        String informacionPrenda5 = getPrenda5().obtenerInformacion();
        System.out.println("La información de la prenda 5 es: "+"\n"+informacionPrenda5);
    }

    /* Obtener el cliente con el mayor número de prendas compradas */
    public void obtenerClienteMayorPrendasCompradas(){
        int clienteMayorCompra = 0;
        String nombreCliente= "";
        if (cliente1.getPrendasCompradas() > clienteMayorCompra){
            clienteMayorCompra = cliente1.getPrendasCompradas();
            nombreCliente = cliente1.getNombreCompleto();
        }
        if (cliente2.getPrendasCompradas() > clienteMayorCompra){
            clienteMayorCompra = cliente2.getPrendasCompradas();
            nombreCliente = cliente2.getNombreCompleto();
        }
        if (cliente3.getPrendasCompradas() > clienteMayorCompra){
            clienteMayorCompra = cliente3.getPrendasCompradas();
            nombreCliente = cliente3.getNombreCompleto();
        }
        if (cliente4.getPrendasCompradas() > clienteMayorCompra){
            clienteMayorCompra = cliente4.getPrendasCompradas();
            nombreCliente = cliente4.getNombreCompleto();
        }
        if (cliente5.getPrendasCompradas() > clienteMayorCompra){
            clienteMayorCompra = cliente5.getPrendasCompradas();
            nombreCliente = cliente5.getNombreCompleto();
        }
        System.out.println("El cliente "+nombreCliente+" es el que más prendas ha comprado, con un total de "+clienteMayorCompra);
    }

    /* Obtener la prenda con menos cantidad disponible */
    public void obtenerPrendaMenorCantidad(){
        int cantidadDisponible = 0;
        String nombrePrenda = "";
        if (prenda1.getCantidadDisponible() > cantidadDisponible){
            cantidadDisponible = prenda1.getCantidadDisponible();
            nombrePrenda = prenda1.getTipoPrenda();
        }
        if (prenda2.getCantidadDisponible() < cantidadDisponible){
            cantidadDisponible = prenda2.getCantidadDisponible();
            nombrePrenda = prenda2.getTipoPrenda();
        }
        if (prenda3.getCantidadDisponible() < cantidadDisponible){
            cantidadDisponible = prenda3.getCantidadDisponible();
            nombrePrenda = prenda3.getTipoPrenda();
        }
        if (prenda4.getCantidadDisponible() < cantidadDisponible){
            cantidadDisponible = prenda4.getCantidadDisponible();
            nombrePrenda = prenda4.getTipoPrenda();
        }
        if (prenda5.getCantidadDisponible() < cantidadDisponible){
            cantidadDisponible = prenda5.getCantidadDisponible();
            nombrePrenda = prenda5.getTipoPrenda();
        }
        System.out.println("La prenda "+nombrePrenda+" es la que  menor cantidad  disponible tiene con un total de "+cantidadDisponible);
    }

    /* Obtener el total de hombres y mujeres */
    public void obtenerCantidadSexo(){
        int cantidadHombres = 0;
        int cantidadMujeres = 0;
        if (cliente1.getSexo() == Sexo.MASCULINO){
            cantidadHombres += 1;
        }else{
            cantidadMujeres += 1;
        }
        if (cliente2.getSexo() == Sexo.MASCULINO){
            cantidadHombres += 1;
        }else{
            cantidadMujeres += 1;
        }
        if (cliente3.getSexo() == Sexo.MASCULINO){
            cantidadHombres += 1;
        }else{
            cantidadMujeres += 1;
        }
        if (cliente4.getSexo() == Sexo.MASCULINO){
            cantidadHombres += 1;
        }else{
            cantidadMujeres += 1;
        }
        if (cliente5.getSexo() == Sexo.MASCULINO){
            cantidadHombres += 1;
        }else{
            cantidadMujeres += 1;
        }
        System.out.println("La cantidad de hombres es de "+cantidadHombres);
        System.out.println("La cantidad de mujees es de "+cantidadMujeres);
    }

    /* Mostrar los tipos de prenda que son talla S */
    public void mostrarPrendasTallaS(){
        if (prenda1.getTalla() == Talla.S){
            System.out.println("La prenda "+getPrenda1().getTipoPrenda()+" es talla S.");
        }
        if (prenda2.getTalla() == Talla.S){
            System.out.println("La prenda "+getPrenda2().getTipoPrenda()+" es talla S.");
        }
        if (prenda3.getTalla() == Talla.S){
            System.out.println("La prenda "+getPrenda3().getTipoPrenda()+" es talla S.");
        }
        if (prenda4.getTalla() == Talla.S){
            System.out.println("La prenda "+getPrenda4().getTipoPrenda()+" es talla S.");
        }
        if (prenda5.getTalla() == Talla.S){
            System.out.println("La prenda "+getPrenda5().getTipoPrenda()+" es talla S.");
        }
    }

    /* Obtener la prenda más económica */
    public void obtenerPrendaMenorPrecio(){
        String nombrePrenda = "";
        double menorPrecio = 0.0;
        if (prenda1.getPrecio() > menorPrecio){
            menorPrecio = prenda1.getPrecio();
            nombrePrenda = prenda1.getTipoPrenda();
        }
        if (prenda2.getPrecio() < menorPrecio){
            menorPrecio = prenda2.getPrecio();
            nombrePrenda = prenda2.getTipoPrenda();
        }
        if (prenda3.getPrecio() < menorPrecio){
            menorPrecio = prenda3.getPrecio();
            nombrePrenda = prenda3.getTipoPrenda();
        }
        if (prenda4.getPrecio() < menorPrecio){
            menorPrecio = prenda4.getPrecio();
            nombrePrenda = prenda4.getTipoPrenda();
        }
        if (prenda5.getPrecio() < menorPrecio){
            menorPrecio = prenda5.getPrecio();
            nombrePrenda = prenda5.getTipoPrenda();
        }
        System.out.println("La prenda "+nombrePrenda+" es la más económica. Su valor es de "+menorPrecio);
    }
}
