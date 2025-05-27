package org.example.parte1B;

import org.junit.jupiter.api.Test;

import java.util.logging.LogRecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpperCaseFormatterTest {

    @Test
    void testFormat() {
        // Create an instance of UpperCaseFormatter
        UpperCaseFormatter formatter = new UpperCaseFormatter();

        // Create a LogRecord with a sample message
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "This is a test message");

        // Format the record and verify the output
        String formattedMessage = formatter.format(record);
        assertEquals("THIS IS A TEST MESSAGE" + System.lineSeparator(), formattedMessage);
    }
}