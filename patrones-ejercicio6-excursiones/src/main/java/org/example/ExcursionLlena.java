package org.example;

import java.util.LinkedList;
import java.util.List;

public class ExcursionLlena extends Excursion{
    private List<Usuario> espera;

    public ExcursionLlena(String nombre, String fechaInicio, String fechaFin, String puntoDeEncuentro, double costo) {
        super(nombre, fechaInicio, fechaFin, puntoDeEncuentro, costo);
        this.espera = new LinkedList<>();
    }

    void inscribir(Usuario unUsuario) {
        this.espera.add(unUsuario);
    }
}
