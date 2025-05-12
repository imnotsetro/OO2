package ar.edu.unlp.info.oo2.biblioteca;

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
        String jsonString = """
                [
                    {
                        "nombre": "Arya Stark",
                        "email": "needle@stark.com",
                        "legajo": "5234-5"
                    },
                    {
                        "nombre": "Tyron Lannister",
                        "email": "tyron@thelannisters.com",
                        "legajo": "2345-2"
                    }
                ]""";
        assertEquals(jsonString, biblioteca.exportarSocios());
    }
}