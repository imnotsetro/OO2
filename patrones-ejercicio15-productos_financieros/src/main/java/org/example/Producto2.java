package org.example;

import java.util.List;

public class Producto2 extends ProductoCombinado{

    public Producto2() {
            ComprarBonoBajoRiesgo comprarBonosBajoRiesgo = new ComprarBonoBajoRiesgo();
            PlazoFijo plazoFijo = new PlazoFijo();
            ComprarPesos comprarPesos = new ComprarPesos();
            this.setProductos(List.of(comprarDolares, plazoFijo, comprarPesos));
    }
}
