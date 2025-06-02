package org.example;

public class EstadoAceptado implements EstadoPrestamo {

    public void pagarCuota(Prestamo prestamo) {
        prestamo.agregarCuota();
    }

    public double calcelarPrestamo(Prestamo prestamo) {
        return prestamo.getMontoFaltante();
    }
}
