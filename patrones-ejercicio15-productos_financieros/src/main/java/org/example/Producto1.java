package org.example;

import java.util.List;

public class Producto1 extends ProductoCombinado{

    public Producto1(double plazo, double interes) {
            ComprarDolares comprarDolares = new ComprarDolares();
            PlazoFijo plazoFijo = new PlazoFijo();
            ComprarPesos comprarPesos = new ComprarPesos();
            this.setProductos(List.of(comprarDolares, plazoFijo, comprarPesos));
    }
}
