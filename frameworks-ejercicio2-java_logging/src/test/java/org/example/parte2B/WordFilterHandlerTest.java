package org.example.parte2B;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.logging.LogRecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordFilterHandlerTest {

    @Test
    void testWordFilterHandlerReplacesFilteredWords() {
        // Palabras a filtrar y mensaje de reemplazo
        List<String> wordsToFilter = Arrays.asList("error", "fail");
        String replacementMessage = "Filtered";

        // Crear el WordFilterHandler
        WordFilterHandler handler = new WordFilterHandler(wordsToFilter, replacementMessage);

        // Crear un LogRecord con un mensaje que contiene una palabra a filtrar
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is an error message");

        // Publicar el registro
        handler.publish(record);

        // Verificar que el mensaje fue reemplazado
        assertEquals("Filtered", record.getMessage());
    }

    @Test
    void testWordFilterHandlerDoesNotReplaceUnfilteredWords() {
        // Palabras a filtrar y mensaje de reemplazo
        List<String> wordsToFilter = Arrays.asList("error", "fail");
        String replacementMessage = "Filtered";

        // Crear el WordFilterHandler
        WordFilterHandler handler = new WordFilterHandler(wordsToFilter, replacementMessage);

        // Crear un LogRecord con un mensaje que no contiene palabras a filtrar
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a normal message");

        // Publicar el registro
        handler.publish(record);

        // Verificar que el mensaje no fue reemplazado
        assertEquals("This is a normal message", record.getMessage());
    }
}