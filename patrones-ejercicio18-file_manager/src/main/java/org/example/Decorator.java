package org.example;

import java.time.LocalDate;

abstract public class Decorator implements Componente {
    private Componente componente;

    public String prettyPrint(){
        return componente.prettyPrint();
    }

    @Override
    public String getNombre() {
        return componente.getNombre();
    }

    @Override
    public String getExtension() {
        return componente.getExtension();
    }

    @Override
    public String getTamanio() {
        return componente.getTamanio();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return componente.getFechaCreacion();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return componente.getFechaModificacion();
    }

    @Override
    public String getPermisos() {
        return componente.getPermisos();
    }
}
