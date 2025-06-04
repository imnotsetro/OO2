package org.example;

public class PromocionCampaniaExcepcional implements Promocion {

    public double getPromocion(Seguro seguro) {
        return seguro.getCostoMinimo() * 0.5;
    }
}
