package org.example;

public class EstadoLleno extends Estado{

    public void agregarInscripto(Excursion excursion, Usuario usuario) {
        excursion.addInscriptoEspera(usuario);
    }
}
