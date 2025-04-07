package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements CriterioSugerencia{

    public List<Pelicula> sugerir(Decodificador decodificador) {
        return decodificador.getVistas().stream()
                .flatMap(p -> p.getSimilares().stream())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
    }
}
