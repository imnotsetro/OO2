package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Prenda {
    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;

    public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    public LocalDate getComienzoContrato() {
        return comienzoContrato;
    }

    public void setComienzoContrato(LocalDate comienzoContrato) {
        this.comienzoContrato = comienzoContrato;
    }

    public LocalDate getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(LocalDate finContrato) {
        this.finContrato = finContrato;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public double mesesFaltantes() {
        return Period.between(this.comienzoContrato, this.finContrato).getMonths();
    }

    public double calcularLiquidez() {
        return 0.9;
    }

    public double calcularValor() {
        return this.costoMensual * this.mesesFaltantes();
    }
}
