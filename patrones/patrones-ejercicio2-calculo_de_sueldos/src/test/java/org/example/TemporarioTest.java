package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemporarioTest {
    private Temporario t;

    @BeforeEach
    void setUp() {
        t = new Temporario();
        t.setCantHoras(5);
    }

    @Test
    void sueldoNoCasadoSinHijos0horas(){
        t.setCantHoras(0);
        assertEquals(20000.0 - 20000.0%13, t.sueldo());
    }

    @Test
    void sueldoNoCasadoSinHijos5horas(){
        assertEquals(20000.0 + 300.0*5 - (20000.0 + 300.0*5)%13, t.sueldo());
    }

    @Test
    void sueldoCasadoSinHijos(){
        t.setEsCasado(true);
        assertEquals(20000.0 + 300.0*5 + 5000.0 - ((20000.0 + 300.0*5)%13), t.sueldo());
    }

    @Test
    void sueldoCasadoConHijos(){
        t.setEsCasado(true);
        t.setCantHijos(2);
        assertEquals(20000.0 + 300.0*5 + 5000.0 + 2000.0*2- ((20000.0 + 300.0*5)%13), t.sueldo());
    }

}