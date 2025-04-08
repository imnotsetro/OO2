package org.example;

import java.util.LinkedList;
import java.util.List;

public abstract class Excursion {
    private Aplicacion aplicacion;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private String puntoDeEncuentro;
    private double costo;
    private List<Usuario> inscriptos;

    public Excursion(Aplicacion aplicacion, String nombre, String fechaInicio, String fechaFin, String puntoDeEncuentro, double costo, List<Usuario> inscriptos) {
        this.aplicacion = aplicacion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoDeEncuentro = puntoDeEncuentro;
        this.costo = costo;
        this.inscriptos = inscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuntoDeEncuentro() {
        return puntoDeEncuentro;
    }

    public void setPuntoDeEncuentro(String puntoDeEncuentro) {
        this.puntoDeEncuentro = puntoDeEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public List<Usuario> getInscriptos() {
        return inscriptos;
    }

    public void setInscriptos(List<Usuario> inscriptos) {
        this.inscriptos = inscriptos;
    }

    abstract void inscribir (Usuario unUsuario);
}
