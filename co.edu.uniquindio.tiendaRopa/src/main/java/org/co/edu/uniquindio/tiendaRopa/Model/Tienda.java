package org.co.edu.uniquindio.tiendaRopa.Model;

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
}
