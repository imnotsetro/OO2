package org.example;

public class SeguroContraTercerosCompleto extends Seguro{

    public SeguroContraTercerosCompleto(Vehiculo vehiculoAsociado, Cliente asegurado, Promocion promocion) {
        super(vehiculoAsociado, asegurado, promocion);
    }

    public double getCostoSeguroVida() {
        return super.getCostoSeguroVida() + 5000 * getVehiculoAsociado().getCantOcupantes();
    }

    public double getCostoDanioAOtros() {
        double aux;
        if (getVehiculoAsociado().getAntiguedadEnAnios() > 4) {
            aux = 4000;
        } else {
            aux = 10000;
        }
        return aux * getVehiculoAsociado().getAntiguedadEnAnios();
    }

    public double getCostoDanioPropio() {
        return super.getCostoDanioPropio() + 10000;
    }
}
