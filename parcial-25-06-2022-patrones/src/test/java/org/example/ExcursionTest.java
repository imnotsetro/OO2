package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionTest {
    private Excursion excursion;

    @BeforeEach
    void setUp() {
        excursion = new Excursion("Dos dias en kayak bajando el Parana", 50000.0, List.of(LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(5)), "San Martin", 1, 2);
    }

    @Test
    void inscribir() {
        Usuario usuario = new Usuario("Juan", "Gomez", "test@gmail.com");
        excursion.inscribir(usuario);
        assertTrue(excursion.getInscriptos().contains(usuario));
        assertEquals(EstadoMinimo.class, excursion.getEstado().getClass());
        excursion.inscribir(usuario);
        assertEquals(EstadoLleno.class, excursion.getEstado().getClass());
    }

    @Test
    void obtenerInformacion() {
        Usuario usuario = new Usuario("Juan", "Gomez", "test@gmail.com");
        excursion.inscribir(usuario);
        assertEquals("Excursion = nombre='Dos dias en kayak bajando el Parana', costo=50000.0, fechas=[2025-03-05, 2025-01-05], puntoDeEncuentro='San Martin'Mails de incriptos: [Usuario{nombre='Juan', apellido='Gomez', email='test@gmail.com'}]Cantidad de incriptos faltantes= 1", excursion.obtenerInformacion());
    }
}