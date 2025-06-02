package org.example;

public class EstadoFinalizado implements EstadoPrestamo {

    public void pagarCuota(Prestamo prestamo) {
        throw new Error("El préstamo ya está finalizado, no se puede pagar más cuotas.");
    }

    public double calcelarPrestamo(Prestamo prestamo) {
        throw new Error("El préstamo ya está finalizado, no se puede cancelar.");
    }
}
