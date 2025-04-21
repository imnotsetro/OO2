package org.example;

abstract class Cliente {

    public void comprarDolares(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }
        System.out.println("Compra de dólares realizada por un monto de: " + monto);
    }

    public void comprarPesos(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }
        System.out.println("Compra de pesos realizada por un monto de: " + monto);
    }

    public abstract void invertirPlazoFijo(double monto, int plazoDias, double interesDiario);

    public abstract void comprarBonoBajoRiesgo(double monto, int plazoMinimo);

    public abstract void comprarBonoAltoRiesgo(double monto, int plazoMinimo);
}
