package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeguroTest {
    Seguro seguro;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Juan", 30, List.of());
        Vehiculo vehiculo = new Vehiculo(cliente, "Renault", "Clio", 5, 100000, 4);
        Promocion promocion = new PromocionCampaniaExcepcional();
        seguro = new SeguroContraTercerosCompleto(vehiculo, cliente, promocion);
    }

    @Test
    void getCostoTotal() {
        assertEquals(93000.0, seguro.getCostoTotal());
    }
}