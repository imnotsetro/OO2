package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private int anioEstreno;
    private List<Pelicula> similares;
    private double puntaje;

    public Pelicula(String titulo, int anioEstreno, double puntaje) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.similares = new ArrayList<>();
        this.puntaje = puntaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public List<Pelicula> getSimilares() {
        return similares;
    }

    public void setSimilares(List<Pelicula> similares) {
        this.similares = similares;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void agregarSimilar(Pelicula pelicula) {
        this.similares.add(pelicula);
    }
}
