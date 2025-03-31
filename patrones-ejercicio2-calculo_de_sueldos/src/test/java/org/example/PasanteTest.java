package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasanteTest {
    private Pasante p;

    @BeforeEach
    void setUp() {
        p = new Pasante();
    }

    @Test
    void sueldoSinExamenes(){
        p.setCantExamenes(0);
        assertEquals(20000 - ((20000%13 + (2000 * 3)%15)), p.sueldo());
    }

    @Test
    void sueldoConExamenes(){
        p.setCantExamenes(3);
        assertEquals(20000 + 2000 * 3 - ((20000%13 + (2000 * 3)%15)), p.sueldo());
    }
}