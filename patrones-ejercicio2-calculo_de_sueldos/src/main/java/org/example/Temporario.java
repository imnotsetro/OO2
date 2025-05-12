package org.example;

public class Temporario extends Padre{
    private int cantHoras;

    public Temporario(boolean esCasado, int cantHijos, int cantHoras) {
        super(esCasado, cantHijos);
        this.cantHoras = cantHoras;
    }

    public Temporario() {
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    @Override
    public double getBasico() {
        return 20000 + this.cantHoras * 300;
    }
}
