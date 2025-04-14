package org.example;

import java.time.LocalDate;

public class Reserva {
    private int cantidadDias;
    private LocalDate fecha;
    private AutoEnAlquiler auto;
    private Usuario conductor;
    private PoliticaRembolso politicaRembolso;

    public Reserva(int cantidadDias, LocalDate fecha, AutoEnAlquiler auto, Usuario conductor, PoliticaRembolso politicaRembolso) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.auto = auto;
        this.conductor = conductor;
        this.politicaRembolso = politicaRembolso;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public AutoEnAlquiler getAuto() {
        return auto;
    }

    public void setAuto(AutoEnAlquiler auto) {
        this.auto = auto;
    }

    public Usuario getConductor() {
        return conductor;
    }

    public void setConductor(Usuario conductor) {
        this.conductor = conductor;
    }

    public PoliticaRembolso getPoliticaRembolso() {
        return politicaRembolso;
    }

    public void setPoliticaRembolso(PoliticaRembolso politicaRembolso) {
        this.politicaRembolso = politicaRembolso;
    }

    public double montoAPagar(){
        return this.auto.getPrecioPorDia() * this.cantidadDias;
    }

    public double montoAReembolsar() {
        return this.politicaRembolso.calcularRembolso(this.fecha, this.montoAPagar());
    }

    public void cambiarPoliticaEstricta() {
        this.politicaRembolso.cambiarPoliticaEstricta(this);
    }

    public void cambiarPoliticaModerada() {
        this.politicaRembolso.cambiarPoliticaModerada(this);
    }

    public void cambiarPoliticaFlexible() {
        this.politicaRembolso.cambiarPoliticaFlexible(this);
    }

    public static void main(String[] args) {
        Reserva testReserva = new Reserva(4, LocalDate.now().minusDays(5), new AutoEnAlquiler(500.0, 6, "Peugot"), new Usuario("Martin"), new PoliticaFlexible());
        System.out.println("Reembolso con politica flexible: " + testReserva.montoAReembolsar());
        testReserva.cambiarPoliticaModerada();
        System.out.println("Reembolso con politica moderada: " + testReserva.montoAReembolsar());
    }
}
