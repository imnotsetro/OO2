package org.example;

public class SeguroContraTerceros extends Seguro{

    public SeguroContraTerceros(Vehiculo vehiculoAsociado, Cliente asegurado, Promocion promocion) {
        super(vehiculoAsociado, asegurado, promocion);
    }

    public double getCostoDanioAOtros() {
        return 1000 * (getVehiculoAsociado().getValor() * 0.01);
    }
}
