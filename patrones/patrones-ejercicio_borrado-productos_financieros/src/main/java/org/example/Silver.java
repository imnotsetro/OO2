package org.example;

import java.util.List;

public class Silver extends Cliente{

    @Override
    public void invertirPlazoFijo(double monto, int plazoDias, double interesDiario) {
        if (plazoDias < 35) {
            throw new IllegalArgumentException("El plazo mínimo para clientes Silver es de 35 días.");
        }
        double tasaInteres = 0.05; // 5%
        // Lógica para invertir en plazo fijo con la tasa de interés del 5%
    }

    @Override
    public void comprarBonoBajoRiesgo(double monto, int plazoMinimo) {
        if (plazoMinimo < 72) {
            throw new IllegalArgumentException("El periodo mínimo de parking para clientes Silver es de 72 horas.");
        }
        // Lógica para comprar bonos de bajo riesgo
    }

    @Override
    public void comprarBonoAltoRiesgo(double monto, int plazoMinimo) {
        if (plazoMinimo < 72) {
            throw new IllegalArgumentException("El periodo mínimo de parking para clientes Silver es de 72 horas.");
        }
        // Lógica para comprar bonos de alto riesgo
    }
}
