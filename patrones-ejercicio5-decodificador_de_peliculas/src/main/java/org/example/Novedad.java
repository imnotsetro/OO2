package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements CriterioSugerencia{

    public List<Pelicula> sugerir(Decodificador decodificador) {
        return decodificador.getGrilla().stream()
                .sorted(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
                .filter(p -> !decodificador.getVistas().contains(p))
                .limit(3)
                .collect(Collectors.toList());
    }
}
