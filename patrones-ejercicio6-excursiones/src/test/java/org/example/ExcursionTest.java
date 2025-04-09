package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class ExcursionTest {
    private Excursion excursion;

    @BeforeEach
    void setUp() {
        excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5), "TestPuntoEncuentro", 1000.0, 1, 2);
    }

    @Test
    void inscribir() {
        excursion.inscribir(new Usuario("TestNombre1", "TestApellido1", "TestEmail1"));
        assertEquals(EstadoMinimo.class, excursion.getEstado().getClass());
        excursion.inscribir(new Usuario("TestNombre2", "TestApellido2", "TestEmail2"));
        assertEquals(EstadoLleno.class, excursion.getEstado().getClass());
    }
}