package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoorheesExporterTest {
    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
    }

    @Test
    void exportar() {
        String jsonString = "[{\"legajo\":\"5234-5\",\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\"},{\"legajo\":\"2345-2\",\"nombre\":\"Tyron Lannister\",\"email\":\"tyron@thelannisters.com\"}]";
        assertEquals(jsonString, biblioteca.exportarSocios());
    }

    @Test
    void exportarJackson() throws JsonProcessingException {
        String jsonString = "[{\"nombre\":\"Arya Stark\",\"legajo\":\"5234-5\",\"email\":\"needle@stark.com\"},{\"nombre\":\"Tyron Lannister\",\"legajo\":\"2345-2\",\"email\":\"tyron@thelannisters.com\"}]";
        assertEquals(jsonString, biblioteca.exportarSociosJackson());
    }
}