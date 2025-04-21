package org.example;

import java.util.List;

public class Producto4 extends ProductoCombinado{

    public Producto4(int parking1, int parking2, int parking3) {
        ComprarBonoAltoRiesgo bono1 = new ComprarBonoAltoRiesgo(parking1);
        ComprarBonoAltoRiesgo bono2 = new ComprarBonoAltoRiesgo(parking2);
        ComprarBonoAltoRiesgo bono3 = new ComprarBonoAltoRiesgo(parking3);
        this.setProductos(List.of(bono1, bono2, bono3));
    }
}
