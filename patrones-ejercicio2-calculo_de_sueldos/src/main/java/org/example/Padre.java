package org.example;

public abstract class Padre extends Empleado{
    private boolean esCasado;
    private int cantHijos;

    public Padre(boolean esCasado, int cantHijos) {
        this.esCasado = esCasado;
        this.cantHijos = cantHijos;
    }

    public Padre() {
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public boolean isEsCasado() {
        return esCasado;
    }

    public void setEsCasado(boolean esCasado) {
        this.esCasado = esCasado;
    }

    @Override
    public double getAdicional() {
        double res = 0;
        if (esCasado) {
            res = 5000.0;
        }
        return res + (this.cantHijos * 2000.0);
    }
}
