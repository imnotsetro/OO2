package org.example;

import java.time.LocalDate;

public class FileOO2 implements Componente {
    private String nombre;
    private String extension;
    private String tamanio;
    private LocalDate fechaCreacion;
    private LocalDate fechaModificacion;
    private String permisos;

    public FileOO2(String nombre, String extension, String tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExtension() {
        return extension;
    }

    public String getTamanio() {
        return tamanio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public String getPermisos() {
        return permisos;
    }

    public String prettyPrint() {
        //TODO: Implementar el método prettyPrint
        return null;
    }
}
