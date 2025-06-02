package org.example;

public class PrestamoSimple extends Prestamo {

    public PrestamoSimple(double monto, int cantidadCuotas, double sueldoMensual, Cliente cliente) {
        super(monto, cantidadCuotas, sueldoMensual, cliente);
    }

    public double getInteresActual() {
        return 0.2;
    }

    public double getMontoADevolver() {
        double aux = super.getMontoADevolver();
        return aux - (aux * 0.1 + 5000.0);
    }
}
