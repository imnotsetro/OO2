package org.example;

public class PromocionMultiplesPolizas implements Promocion {

    public double getPromocion(Seguro seguro) {
        if (seguro.getAsegurado().getVehiculos().size() >= 2) {
            return seguro.getCostoTotal() * 0.1;
        }
        return 0;
    }
}
