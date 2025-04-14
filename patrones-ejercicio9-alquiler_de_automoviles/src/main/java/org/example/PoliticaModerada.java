package org.example;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaRembolso{

    @Override
    public double calcularRembolso(LocalDate fecha, double montoAPagar) {
        if (fecha.isBefore(LocalDate.now().minusWeeks(2))){
            return montoAPagar;
        } else if (fecha.isBefore(LocalDate.now().minusDays(2))) {
            return montoAPagar * 0.5;
        } else {
            return 0;
        }
    }

    @Override
    public void cambiarPoliticaEstricta(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaEstricta());
    }

    @Override
    public void cambiarPoliticaModerada(Reserva reserva) {}

    @Override
    public void cambiarPoliticaFlexible(Reserva reserva) {
        reserva.setPoliticaRembolso(new PoliticaFlexible());
    }
}
