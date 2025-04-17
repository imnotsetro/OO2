package org.example;

public abstract class Prenda {

    abstract public double calcularValor();

    abstract public double calcularLiquidez();

    public double calcularValorPrendario() {
        return calcularValor() * calcularLiquidez();
    }
}
