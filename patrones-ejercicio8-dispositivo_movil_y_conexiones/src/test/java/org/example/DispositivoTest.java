package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispositivoTest {
    private Dispositivo dispositivo;

    @BeforeEach
    void setUp() {
        dispositivo = new Dispositivo(new WifiConn("testPict"), new CRC16_Calculator(), new Display(), new Ringer());
    }

    @Test
    void send() {
        assertEquals("testPict60210", dispositivo.send("testData"));
    }

    @Test
    void conectarCon() {
        dispositivo.conectarCon(new Connection4GAdapter("testSymb"));
        assertEquals(Connection4GAdapter.class, dispositivo.getConnection().getClass());
    }

    @Test
    void configurarCRC() {
        dispositivo.configurarCRC(new CRC32_Calculator());
        assertEquals(CRC32_Calculator.class, dispositivo.getCrc_calculator().getClass());
    }
}