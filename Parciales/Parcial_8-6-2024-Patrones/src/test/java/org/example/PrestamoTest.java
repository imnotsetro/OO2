package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrestamoTest {
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Juan", 5000);
    }

    @Test
    void getMonto() {
        Prestamo prestamo = cliente.solicitarPrestamoSimple(100, 10);
        assertEquals(100, prestamo.getMonto());
        cliente.pagarCuota(prestamo);
        assertEquals(12, prestamo.getMontoPagado());
    }
}