package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopografiaTest {
    private Agua agua;
    private Tierra tierra;
    private Pantano pantano;
    private Mixta mixta;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testProporcionAgua() {
        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();
        mixta = new Mixta(agua, tierra, tierra, agua);

        assertEquals(1.0, agua.getProporcionAgua());
        assertEquals(0.0, tierra.getProporcionAgua());
        assertEquals(0.5, mixta.getProporcionAgua());
        assertEquals(0.7, pantano.getProporcionAgua());

        mixta = new Mixta(agua, pantano, pantano, agua);

        assertEquals(0.85, mixta.getProporcionAgua());
    }

    @Test
    void testIgualdad() {
        agua = new Agua();
        tierra = new Tierra();
        Topografia mixta1 = new Mixta(agua, tierra, tierra, agua);
        Topografia mixta2 = new Mixta(agua, tierra, tierra, agua);
        Topografia mixtaDiferente = new Mixta(tierra, tierra, tierra, agua);

        assertEquals(mixta1, mixta2);
        assertNotEquals(mixta1, mixtaDiferente);
    }
}