package org.example;

import java.util.ArrayList;
import java.util.List;

public class EstadoLleno implements Estado{
    private List<Usuario> listaEspera;

    public EstadoLleno() {
        this.listaEspera = new ArrayList<>();
    }

    public void inscribir(Usuario usuario, Excursion excursion) {
        this.listaEspera.add(usuario);
    }

    public String obtenerInformacion(Excursion excursion) {
        return excursion.toString() +
                "Lista de espera=" + this.listaEspera.toString();
    }
}
