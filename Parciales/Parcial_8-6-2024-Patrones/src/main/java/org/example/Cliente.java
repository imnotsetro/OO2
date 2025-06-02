package org.example;

public class Cliente {
    private String nombre;
    private double salarioMensual;

    public Cliente(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public PrestamoSimple solicitarPrestamoSimple(double monto, int cantidadCuotas) {
        return new PrestamoSimple(monto, cantidadCuotas, this.salarioMensual, this);
    }

    public PrestamoSimple solicitarPrestamoUVA(double monto, int cantidadCuotas) {
        return new PrestamoSimple(monto, cantidadCuotas, this.salarioMensual, this);
    }

    public void pagarCuota(Prestamo prestamo) {
        prestamo.pagarCuota();
    }

    public double cancelarPrestamo(Prestamo prestamo) {
        return prestamo.cancelarPrestamo();
    }
}
