package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantaTest {
    private Planta p;

    @BeforeEach
    void setUp() {
        p = new Planta();
        p.setAntiguedad(5);
    }

    @Test
    void sueldoNoCasadoSinHijos0antiguedad(){
        p.setAntiguedad(0);
        assertEquals(50000.0 - 50000.0%13, p.sueldo());
    }

    @Test
    void sueldoNoCasadoSinHijos5antiguedad(){
        assertEquals(50000.0 + 2000.0*5 - 50000.0%13, p.sueldo());
    }

    @Test
    void sueldoCasadoSinHijos(){
        p.setEsCasado(true);
        assertEquals(50000.0 + 2000.0*5 + 5000.0 - 50000.0%13, p.sueldo());
    }

    @Test
    void sueldoCasadoConHijos(){
        p.setEsCasado(true);
        p.setCantHijos(2);
        assertEquals(50000.0 + 2000.0*5 + 2000.0*2 + 5000.0 - 50000.0%13, p.sueldo());
    }

}