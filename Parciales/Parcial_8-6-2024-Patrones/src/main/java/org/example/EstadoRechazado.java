package org.example;

public class EstadoRechazado implements EstadoPrestamo {

    public void pagarCuota(Prestamo prestamo) {
        throw new Error("El prestamo esta rechazado.");
    }

    public double calcelarPrestamo(Prestamo prestamo) {
        return 0;
    }
}
