package org.example;

abstract class Cliente {

    public void comprarDolares(double monto);

    public void comprarPesos(double monto);

    public abstract void invertirPlazoFijo(double monto, int plazoDias, double interesDiario);

    public abstract void comprarBonoBajoRiesgo(double monto, int plazoMinimo);

    public abstract void comprarBonoAltoRiesgo(double monto, int plazoMinimo);
}
