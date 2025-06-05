package org.example;

public abstract class Estado {

    public abstract void agregarInscripto(Excursion excursion, Usuario usuario);

    public String getInformacion(Excursion excursion) {
        return excursion.toString();
    }
}
