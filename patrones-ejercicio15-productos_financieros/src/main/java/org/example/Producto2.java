package org.example;

import java.util.List;

public class Producto2 extends ProductoCombinado{

    public Producto2(int parkingBonos, int plazoDias, double interesDiario) {
        ComprarBonoBajoRiesgo comprarBonosBajoRiesgo = new ComprarBonoBajoRiesgo(parkingBonos);
        ComprarDolares comprarDolares = new ComprarDolares();
        PlazoFijo plazoFijoEnDolares = new PlazoFijo(plazoDias, interesDiario);
        ComprarPesos comprarPesos = new ComprarPesos();
        this.setProductos(List.of(comprarBonosBajoRiesgo, comprarDolares, plazoFijoEnDolares, comprarPesos));
    }
}
