package org.example;

public class Planta extends Padre{
    private int antiguedad;

    public Planta(boolean esCasado, int cantHijos, int antiguedad) {
        super(esCasado, cantHijos);
        this.antiguedad = antiguedad;
    }

    public Planta() {
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Planta(boolean esCasado, int cantHijos) {
        super(esCasado, cantHijos);
    }

    @Override
    public double getBasico() {
        return 50000;
    }

    @Override
    public double getAdicional() {
        return super.getAdicional() + this.antiguedad * 2000;
    }
}
