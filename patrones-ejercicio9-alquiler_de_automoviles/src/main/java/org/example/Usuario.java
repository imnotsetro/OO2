package org.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;

    public Usuario(String nombre) {
        this.autosEnAlquiler = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<AutoEnAlquiler> getAutosEnAlquiler() {
        return autosEnAlquiler;
    }

    public void setAutosEnAlquiler(List<AutoEnAlquiler> autosEnAlquiler) {
        this.autosEnAlquiler = autosEnAlquiler;
    }
}
