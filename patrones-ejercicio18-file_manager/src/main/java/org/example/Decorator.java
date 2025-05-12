package org.example;

import java.time.LocalDate;

/*
    Decorator en este caso es necesario
    debido a que los archivos deben
    ser mostrados siguiendo distintas
    estructuras.
    Decorator permite la ejecucion en
    orden.
 */

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

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
}
