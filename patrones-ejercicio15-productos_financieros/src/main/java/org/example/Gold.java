package org.example;

public class Gold extends Cliente {

    @Override
    public void invertirPlazoFijo(double monto, int plazoDias, double interesDiario) {
        if (plazoDias < 30) {
            throw new IllegalArgumentException("El plazo mínimo para clientes Gold es de 30 días.");
        }
        double tasaInteres = 0.06; // 6%
        // Lógica para invertir en plazo fijo con la tasa de interés del 6%
    }

    @Override
    public void comprarBonoBajoRiesgo(double monto, int plazoMinimo) {
        if (plazoMinimo < 24) {
            throw new IllegalArgumentException("El periodo mínimo de parking para clientes Gold es de 24 horas.");
        }
        // Lógica para comprar bonos de bajo riesgo
    }

    @Override
    public void comprarBonoAltoRiesgo(double monto, int plazoMinimo) {
        if (plazoMinimo < 24) {
            throw new IllegalArgumentException("El periodo mínimo de parking para clientes Gold es de 24 horas.");
        }
        // Lógica para comprar bonos de alto riesgo
    }
}
