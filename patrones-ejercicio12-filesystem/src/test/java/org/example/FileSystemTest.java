package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {
    private FileSystem fileSystem;
    private Archivo archivo1;
    private Archivo archivo2;
    private Archivo archivo3;
    private Directorio directorio1;
    private Directorio directorio2;

    @BeforeEach
    void setUp() {
        archivo1 = new Archivo("archivo1.txt", LocalDate.of(2023, 1, 1), 100);
        archivo2 = new Archivo("archivo2.txt", LocalDate.of(2023, 2, 1), 200);
        archivo3 = new Archivo("archivo3.txt", LocalDate.of(2023, 3, 1), 50);

        directorio1 = new Directorio("Directorio1", LocalDate.of(2023, 1, 1));
        directorio2 = new Directorio("Directorio2", LocalDate.of(2023, 1, 1));

        directorio1.getContenido().add(archivo1);
        directorio1.getContenido().add(archivo2);
        directorio2.getContenido().add(archivo3);

        fileSystem = new FileSystem(List.of(directorio1, directorio2));
    }

    @Test
    void testTamanoTotalOcupado() {
        // 32 bytes for each directory + file sizes
        int expectedSize = 32 + 100 + 200 + 32 + 50;
        assertEquals(expectedSize, fileSystem.tamanoTotalOcupado());
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(archivo2, fileSystem.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
        assertEquals(archivo3, fileSystem.archivoMasNuevo());
    }

    @Test
    void testBuscar() {
        assertEquals(archivo1, fileSystem.buscar("archivo1.txt"));
        assertNull(fileSystem.buscar("archivoInexistente.txt"));
    }

    @Test
    void testBuscarTodos() {
        List<Elemento> resultados = fileSystem.buscarTodos("archivo1.txt");
        assertEquals(1, resultados.size());
        assertTrue(resultados.contains(archivo1));
    }

    @Test
    void testListadoDeContenido() {
        String esperado = """
                /Directorio1
                /Directorio1/archivo1.txt
                /Directorio1/archivo2.txt
                /Directorio2
                /Directorio2/archivo3.txt
                """;
        assertEquals(esperado.trim(), fileSystem.listadoDeContenido().trim());
    }
}