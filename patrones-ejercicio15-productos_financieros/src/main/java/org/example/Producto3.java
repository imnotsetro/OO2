package org.example;

import java.util.List;

public class Producto3 extends ProductoCombinado{

    public Producto3(int parkingAltoRiesgo, int parkingBajoRiesgo, int plazoDias, double interesDiario) {
        ComprarBonoAltoRiesgo comprarBonoAltoRiesgo = new ComprarBonoAltoRiesgo(parkingAltoRiesgo);
        ComprarBonoBajoRiesgo comprarBonoBajoRiesgo = new ComprarBonoBajoRiesgo(parkingBajoRiesgo);
        PlazoFijo plazoFijo = new PlazoFijo(plazoDias, interesDiario);
        this.setProductos(List.of(comprarBonoAltoRiesgo, comprarBonoBajoRiesgo, plazoFijo));
    }
}
