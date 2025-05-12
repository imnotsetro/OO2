package org.example;

import java.time.LocalDate;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    private LocalDate fechaCreacion;

    public Elemento(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public abstract int getTamano();

    public abstract List<Elemento> getContenido();
}
