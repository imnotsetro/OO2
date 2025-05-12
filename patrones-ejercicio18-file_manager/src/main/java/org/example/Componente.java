package org.example;

import java.time.LocalDate;

public interface Componente {

    public String prettyPrint();

    public String getNombre();

    public String getExtension();

    public String getTamanio();

    public LocalDate getFechaCreacion();

    public LocalDate getFechaModificacion();

    public String getPermisos();
}
