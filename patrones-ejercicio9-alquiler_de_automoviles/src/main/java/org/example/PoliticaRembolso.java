package org.example;

import java.time.LocalDate;

public interface PoliticaRembolso {

    public double calcularRembolso(LocalDate fecha, double montoAPagar);

    public void cambiarPoliticaEstricta(Reserva reserva);

    public void cambiarPoliticaModerada(Reserva reserva);

    public void cambiarPoliticaFlexible(Reserva reserva);
}
