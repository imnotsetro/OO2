package org.example;

public class SeguroTodoRiesgo extends Seguro{

    public SeguroTodoRiesgo(Vehiculo vehiculoAsociado, Cliente asegurado, Promocion promocion) {
        super(vehiculoAsociado, asegurado, promocion);
    }

    public double getCostoSeguroVida() {
        return super.getCostoSeguroVida() + 9000 * getVehiculoAsociado().getAntiguedadEnAnios();
    }

    public double getCostoDanioAOtros() {
        return 100000.0 / getVehiculoAsociado().getPropietario().getEdad();
    }

    public double getCostoDanioPropio() {
        return super.getCostoDanioPropio() + 1000 * getAsegurado().getEdad();
    }
}
