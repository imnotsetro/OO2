package org.example;

import java.util.List;

public class Producto1 extends ProductoCombinado{

    public Producto1(int plazoDias, double interesDiario) {
        ComprarDolares comprarDolares = new ComprarDolares();
        PlazoFijo plazoFijoEnDolares = new PlazoFijo(plazoDias, interesDiario);
        ComprarPesos comprarPesos = new ComprarPesos();
        this.setProductos(List.of(comprarDolares, plazoFijoEnDolares, comprarPesos));
    }
}
