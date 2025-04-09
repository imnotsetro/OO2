package org.example;

public abstract class Empleado {

    public abstract double getBasico();
    public abstract double getAdicional();
    public double getDescuento() {
        return this.getBasico()%13 + this.getAdicional()%5;
    }

    public double sueldo() {
        return this.getBasico() + this.getAdicional() - this.getDescuento();
    }
}
