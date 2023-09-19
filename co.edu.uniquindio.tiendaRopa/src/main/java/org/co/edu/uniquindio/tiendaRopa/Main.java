package org.co.edu.uniquindio.tiendaRopa;


import org.co.edu.uniquindio.tiendaRopa.Model.Cliente;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Color;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Sexo;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.Talla;
import org.co.edu.uniquindio.tiendaRopa.Model.Enumeracion.TipoCliente;
import org.co.edu.uniquindio.tiendaRopa.Model.Prenda;
import org.co.edu.uniquindio.tiendaRopa.Model.Tienda;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = inicializarDatosPrueba();

        /* Inicializar los datos prueba de las prendas*/
        tienda.mostrarInformacionPrendas();

        /* Obtener el cliente con el mayor número de prendas compradas */
        tienda.obtenerClienteMayorPrendasCompradas();

        /* Obtener la prenda con menos cantidad disponible */
        tienda.obtenerPrendaMenorCantidad();
    }

    private static Tienda inicializarDatosPrueba(){
        Prenda prenda1 = crearPrenda("Blusa", "Crop213", TipoCliente.MUJER, Talla.S, Color.ROSADA, 30000, 50);
        Prenda prenda2 = crearPrenda("Pantalón", "Jogger883", TipoCliente.HOMBRE, Talla.M, Color.AZUL, 99000, 12);
        Prenda prenda3 = crearPrenda("Vestido", "Large643", TipoCliente.MUJER, Talla.M, Color.LILA, 65000, 22);
        Prenda prenda4 = crearPrenda("Camisa", "MCorta073", TipoCliente.HOMBRE, Talla.XL, Color.NEGRA, 49900, 14);
        Prenda prenda5 = crearPrenda("Chaqueta", "Biker113", TipoCliente.MUJER, Talla.L, Color.NEGRA, 89000, 5);
        Cliente cliente1 = crearCliente("Ana Cruz Marín", 1004830265, Sexo.FEMENINO, 11, "11/09/2023");
        Cliente cliente2 = crearCliente("Juan Mora Pérez", 91850265, Sexo.MASCULINO, 9, "18/07/2023");
        Cliente cliente3 = crearCliente("José Luna Campos", 91850265, Sexo.MASCULINO, 21, "22/08/2023");
        Cliente cliente4 = crearCliente("Luisa Ortiz Ruiz", 1094838275, Sexo.FEMENINO, 31, "13/09/2023");
        Cliente cliente5 = crearCliente("Isabel Chica Mora", 1010660485, Sexo.FEMENINO, 19, "30/03/2023");
        Tienda tienda = new Tienda();
        tienda.setPrenda1(prenda1);
        tienda.setPrenda2(prenda2);
        tienda.setPrenda3(prenda3);
        tienda.setPrenda4(prenda4);
        tienda.setPrenda5(prenda5);
        tienda.setCliente1(cliente1);
        tienda.setCliente2(cliente2);
        tienda.setCliente3(cliente3);
        tienda.setCliente4(cliente4);
        tienda.setCliente5(cliente5);

        /* Obtener el cliente con el mayor número de prendas compradas */
        obtenerClienteMayorPrendasCompradas(cliente1, cliente2, cliente3, cliente4, cliente5);

        return tienda;
    }

    private static Prenda crearPrenda(String tipoPrenda, String referencia, TipoCliente tipoCliente, Talla talla, Color color, double precio, int cantidadDisponible){
        Prenda prenda = new Prenda();
        prenda.setTipoPrenda(tipoPrenda);
        prenda.setReferencia(referencia);
        prenda.setTipoCliente(tipoCliente);
        prenda.setTalla(talla);
        prenda.setColor(color);
        prenda.setPrecio(precio);
        prenda.setCantidadDisponible(cantidadDisponible);

        return prenda;
    }

    private static Cliente crearCliente(String nombreCompleto, long numeroIdentificacion, Sexo sexo, int prendasCompradas, String fechaUltimaCompra){
        Cliente cliente = new Cliente();
        cliente.setNombreCompleto(nombreCompleto);
        cliente.setNumeroIdentificacion(numeroIdentificacion);
        cliente.setSexo(sexo);
        cliente.setPrendasCompradas(prendasCompradas);
        cliente.setFechaUltimaCompra(fechaUltimaCompra);

        return cliente;
    }

    /* Obtener el cliente con el mayor número de prendas compradas */
    private static void obtenerClienteMayorPrendasCompradas(Cliente cliente1, Cliente cliente2, Cliente cliente3, Cliente cliente4, Cliente cliente5){

    }
}