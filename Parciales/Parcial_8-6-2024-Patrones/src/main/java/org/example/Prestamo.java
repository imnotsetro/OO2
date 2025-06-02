package org.example;

public abstract class Prestamo {
    private double monto;
    private int cantidadCuotas;
    private int cantidadCuotasPagadas;
    private double montoPagado;
    private double interes;
    private EstadoPrestamo estado;
    private Cliente cliente;

    public Prestamo(double monto, int cantidadCuotas, double sueldoMensual, Cliente cliente) {
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
        this.cantidadCuotasPagadas = 0;
        this.montoPagado = 0;
        this.interes = this.getInteresActual();
        if (this.excedeCuota(sueldoMensual)) {
            this.estado = new EstadoRechazado();
        } else {
            this.estado = new EstadoAceptado();
        }
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getCantidadCuotasPagadas() {
        return cantidadCuotasPagadas;
    }

    public void setCantidadCuotasPagadas(int cantidadCuotasPagadas) {
        this.cantidadCuotasPagadas = cantidadCuotasPagadas;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public abstract double getInteresActual();

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public boolean excedeCuota(double sueldo) {
        return this.getValorCuota() > sueldo * 0.3;
    }

    public void agregarCuota() {
        this.cantidadCuotasPagadas++;
        this.montoPagado += this.getValorCuota();
        if (this.cantidadCuotasPagadas == this.cantidadCuotas) {
            this.estado = new EstadoFinalizado();
        }
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public double getValorCuota() {
        double aux = (this.getMonto() / this.getCantidadCuotas());
        return aux + aux * this.getInteres();
    }

    public double getMontoFaltante(){
        return this.getValorCuota() * (this.getCantidadCuotas()-this.getCantidadCuotasPagadas());
    }

    public double getMontoADevolver() {
        return this.getMontoFaltante();
    }

    public void pagarCuota() {
        this.estado.pagarCuota(this);
    }

    public double cancelarPrestamo() {
        return this.estado.calcelarPrestamo(this);
    }
}
