package org.example;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaRembolso{

    @Override
    public double calcularRembolso(LocalDate fecha, double montoAPagar) {
        if (fecha.isBefore(LocalDate.now())) {
            return montoAPagar;
        }
        return 0;
    }

    @Override
    public void cambiarPoliticaEstricta(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaEstricta());
    }

    @Override
    public void cambiarPoliticaModerada(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaModerada());
    }

    @Override
    public void cambiarPoliticaFlexible(Reserva reserva) {
    }
}
