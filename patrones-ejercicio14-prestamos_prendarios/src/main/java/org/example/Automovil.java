package org.example;

public class Automovil extends Prenda {
    private String modelo;
    private double kilometraje;
    private double costo0km;
//     En el ejercicio no pide que la clase tenga
//     un atributo para la antigüedad, pero lo agrego
//     para poder calcular la liquidez
    private int anioDeAntiguedad;

    public Automovil(String modelo, double kilometraje, double costo0km, int anioDeAntiguedad) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
        this.anioDeAntiguedad = anioDeAntiguedad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCosto0km() {
        return costo0km;
    }

    public void setCosto0km(double costo0km) {
        this.costo0km = costo0km;
    }

    public double calcularLiquidez() {
        return 0.7;
    }

    public double calcularValor() {
        return this.costo0km - (this.costo0km * (0.1 * this.anioDeAntiguedad));
    }
}
