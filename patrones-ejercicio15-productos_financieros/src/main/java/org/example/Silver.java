package org.example;

import java.util.List;

public class Silver extends Cliente{

    public ProductoCombinado getProducto1(){
        ComprarDolares comprarDolares = new ComprarDolares();
        PlazoFijo plazoFijo = new PlazoFijo();
        ComprarPesos comprarPesos = new ComprarPesos();
        return new ProductoCombinado(List.of(comprarDolares, plazoFijo, comprarPesos));
    }

    @Override
    public void invertirPlazoFijo(double monto, int plazoDias, double interesDiario) {

    }

    @Override
    public void comprarBonoBajoRiesgo(double monto, int plazoMinimo) {

    }

    @Override
    public void comprarBonoAltoRiesgo(double monto, int plazoMinimo) {

    }
}
