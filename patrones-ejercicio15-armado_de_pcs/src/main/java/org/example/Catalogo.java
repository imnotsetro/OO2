package org.example;

import java.util.ArrayList;
import java.util.List;

/*
    Algoritmo utilizado: BUILDER
 */

public class Catalogo {
    private static List<Componente> componentes;

    public Catalogo() {
        componentes = new ArrayList<Componente>();
    }

    public static void setComponentes(List<Componente> componentes) {
        Catalogo.componentes= componentes;
    }

    public static Componente getComponente(String prompt) {
        return componentes.stream()
                .filter(elem -> elem.getNombre().equals(prompt))
                .findFirst()
                .orElse(null);
    }
}
