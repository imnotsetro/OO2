package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Seguro {
    private Vehiculo vehiculoAsociado;
    private Cliente asegurado;
    private Promocion promocion;

    public Seguro(Vehiculo vehiculoAsociado, Cliente asegurado, Promocion promocion) {
        this.vehiculoAsociado = vehiculoAsociado;
        this.asegurado = asegurado;
        this.promocion = promocion;
    }

    public double getCostoTotal() {
        return (getCostoSeguroVida() + getCostoDanioAOtros() + getCostoDanioPropio()) - this.promocion.getPromocion(this);
    }

    public double getCostoSeguroVida(){
        return 100 * asegurado.getEdad();
    }

    public abstract double getCostoDanioAOtros();

    public double getCostoMinimo() {
        List<Double> costos = new ArrayList<>();
        costos.add(getCostoSeguroVida());
        costos.add(getCostoDanioAOtros());
        costos.add(getCostoDanioPropio());
        return costos.stream().min(Double::compareTo).orElse(0.0);
    }

    public double getCostoDanioPropio(){
        return getVehiculoAsociado().getValor() * 0.5;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(Vehiculo vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public Cliente getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Cliente asegurado) {
        this.asegurado = asegurado;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
}
