package org.example;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaRembolso{

    @Override
    public double calcularRembolso(LocalDate fecha, double montoAPagar) {
        return 0;
    }

    @Override
    public void cambiarPoliticaEstricta(Reserva reserva) {}

    @Override
    public void cambiarPoliticaModerada(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaModerada());
    }

    @Override
    public void cambiarPoliticaFlexible(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaFlexible());
    }
}
