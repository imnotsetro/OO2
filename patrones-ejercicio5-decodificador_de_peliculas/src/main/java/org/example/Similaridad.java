package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements CriterioSugerencia{

    /**
     * Este método sugiere películas basadas en la similitud de las películas vistas.
     * @param decodificador El decodificador que contiene la lista de películas vistas.
     * @return Una lista de películas similares a las vistas.
     */
    public List<Pelicula> sugerir(Decodificador decodificador) {
        return decodificador.getVistas().stream()
                .flatMap(p1 -> p1.getSimilares().stream()
                        .flatMap(p2 -> p2.getSimilares().stream()))
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
    }
}
