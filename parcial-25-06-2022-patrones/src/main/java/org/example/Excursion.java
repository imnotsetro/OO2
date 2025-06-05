package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private double costo;
    private List<LocalDate> fechas;
    private String puntoDeEncuentro;

    private Estado estado;

    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> inscriptos;
    private List<Usuario> inscriptosEnEspera;

    public Excursion(String nombre, double costo, List<LocalDate> fechas, String puntoDeEncuentro, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.costo = costo;
        this.fechas = fechas;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.estado = new EstadoIncompleto();
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.inscriptos = new ArrayList<>();
        this.inscriptosEnEspera = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public String getPuntoDeEncuentro() {
        return puntoDeEncuentro;
    }

    public void setPuntoDeEncuentro(String puntoDeEncuentro) {
        this.puntoDeEncuentro = puntoDeEncuentro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(int cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public List<Usuario> getInscriptos() {
        return inscriptos;
    }

    public void setInscriptos(List<Usuario> inscriptos) {
        this.inscriptos = inscriptos;
    }

    public List<Usuario> getInscriptosEnEspera() {
        return inscriptosEnEspera;
    }

    public void setInscriptosEnEspera(List<Usuario> inscriptosEnEspera) {
        this.inscriptosEnEspera = inscriptosEnEspera;
    }

    public void inscribir(Usuario usuario) {
        this.estado.agregarInscripto(this, usuario);
    }

    public String obtenerInformacion() {
        return this.estado.getInformacion(this);
    }

    public void addInscripto(Usuario usuario) {
        this.inscriptos.add(usuario);
    }

    public void addInscriptoEspera(Usuario usuario) {
        this.inscriptosEnEspera.add(usuario);
    }

    public String toString() {
        return "Excursion = " +
                "nombre='" + nombre + '\'' +
                ", costo=" + costo +
                ", fechas=" + fechas +
                ", puntoDeEncuentro='" + puntoDeEncuentro + '\'';
    }
}
