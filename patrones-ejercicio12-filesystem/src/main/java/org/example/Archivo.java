package org.example;

import java.time.LocalDate;

public class Archivo extends Elemento {
    private int tamano;

    public Archivo(String nombre, LocalDate fechaCreacion, int tamano) {
        super(nombre, fechaCreacion);
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
}
