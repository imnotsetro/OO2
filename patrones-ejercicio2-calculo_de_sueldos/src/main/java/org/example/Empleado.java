package org.example;

public abstract class Empleado {

    public abstract double getBasico();
    public abstract double getAdicional();
    public double getDescuento(double basico, double adicional) {
        return basico%13 + adicional%5;
    }

    public double sueldo() {
        double basico = this.getBasico();
        double adicional = this.getAdicional();
        return basico + adicional - this.getDescuento(basico, adicional);
    }
}
