package org.example;

public class AutoEnAlquiler {
    private double precioPorDia;
    private int cantidadPlazas;
    private String marca;

    public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getCantidadPlazas() {
        return cantidadPlazas;
    }

    public void setCantidadPlazas(int cantidadPlazas) {
        this.cantidadPlazas = cantidadPlazas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
