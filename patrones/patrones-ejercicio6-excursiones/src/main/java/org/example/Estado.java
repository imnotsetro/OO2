package org.example;

public interface Estado {

    public void inscribir (Usuario usuario, Excursion excursion);

    public String obtenerInformacion(Excursion excursion);
}
