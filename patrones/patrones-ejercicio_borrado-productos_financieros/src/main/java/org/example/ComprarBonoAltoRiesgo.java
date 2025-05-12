package org.example;

public class ComprarBonoAltoRiesgo extends ProductoFinanciero{
    private int parking;

    public ComprarBonoAltoRiesgo(int parking) {
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial) {
        return 0;
    }
}
