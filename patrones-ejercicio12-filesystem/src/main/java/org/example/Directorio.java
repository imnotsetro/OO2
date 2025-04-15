package org.example;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Directorio extends Elemento{
    private List<Elemento> contenido;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.contenido = new LinkedList<>();
    }

    public List<Elemento> getContenido() {
        return contenido;
    }

    public void setContenido(List<Elemento> contenido) {
        this.contenido = contenido;
    }

    @Override
    public int getTamano() {
        return 32 + contenido.stream().mapToInt(Elemento::getTamano).sum();
    }
}
