package org.example;

public class Pasante extends Empleado {
    private int cantExamenes;

    public Pasante(int cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    public Pasante() {
    }

    public int getCantExamenes() {
        return cantExamenes;
    }

    public void setCantExamenes(int cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    @Override
    public double getBasico() {
        return 20000;
    }

    @Override
    public double getAdicional() {
        return 2000 * this.cantExamenes;
    }
}
