package org.example.parte1B;

import org.junit.jupiter.api.Test;

import java.util.logging.LogRecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonFormatterTest {

    @Test
    void testFormat() {
        // Create an instance of JsonFormatter
        JsonFormatter formatter = new JsonFormatter();

        // Create a LogRecord with a sample message and level
        LogRecord record = new LogRecord(java.util.logging.Level.WARNING, "This is a test message");

        // Format the record and verify the output
        String formattedMessage = formatter.format(record);
        assertEquals("{ \"message\": \"This is a test message\", \"level\": \"warning\" }" + System.lineSeparator(), formattedMessage);
    }
}