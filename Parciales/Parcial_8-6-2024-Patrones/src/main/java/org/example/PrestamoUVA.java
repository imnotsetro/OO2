package org.example;

public class PrestamoUVA extends Prestamo {

    public PrestamoUVA(double monto, int cantidadCuotas, double sueldoMensual, Cliente cliente) {
        super(monto, cantidadCuotas, sueldoMensual, cliente);
    }

    public double getInteresActual() {
        Indec indec = new Indec();
        return indec.getIndiceInflacion();
    }

    public double getMontoADevolver() {
        double aux = super.getMontoADevolver();
        return aux - aux * 0.1;
    }

    public static class Indec {

        public double getIndiceInflacion() {
            // Simulación de obtención del índice de inflación
            return 0.05; // 5% de inflación
        }
    }
}
