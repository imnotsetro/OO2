package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DecodificadorTest {
    private Decodificador decodificador;

    @Test
    void sugerir() {
        Pelicula matrix = new Pelicula("Matrix", 1999, 8.7);
        Pelicula inception = new Pelicula("Inception", 2010, 8.8);
        Pelicula tenet = new Pelicula("Tenet", 2020, 7.5);
        Pelicula interstellar = new Pelicula("Interstellar", 2014, 8.6);
        Pelicula dune = new Pelicula("Dune", 2021, 8.1);
        List<Pelicula> peliculasDisponibles = List.of(
                matrix, inception, tenet, interstellar, dune
        );
        // Primer usuario: vio películas más nuevas
        List<Pelicula> peliculasVistas = List.of(dune, tenet);
        // Establecer similitudes
        matrix.agregarSimilar(inception);       // Matrix <-> Inception
        inception.agregarSimilar(matrix);
        interstellar.agregarSimilar(tenet);
        tenet.agregarSimilar(interstellar);     // Interstellar <-> Tenet
        dune.agregarSimilar(interstellar);
        interstellar.agregarSimilar(dune);  // Dune <-> Interstellar

        CriterioSugerencia criterio = new Similaridad();

        decodificador = new Decodificador(peliculasDisponibles, peliculasVistas, criterio);


        List<Pelicula> expected = List.of(dune, tenet, interstellar);
        assertEquals(expected, decodificador.sugerir());

        decodificador.setCriterio(new Puntaje());
        expected = List.of(inception, matrix, interstellar);
        assertEquals(expected, decodificador.sugerir());
    }
}