package org.example;

public class Inmueble extends Prenda {
    private String direccion;
    private double superficie;
    private double costom2;

    public Inmueble(String direccion, double superficie, double costom2) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.costom2 = costom2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getCostom2() {
        return costom2;
    }

    public void setCostom2(double costom2) {
        this.costom2 = costom2;
    }

    public double calcularLiquidez() {
        return 0.2;
    }

    public double calcularValor() {
        return this.superficie * this.costom2;
    }
}
