package org.example.parte1B;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JsonFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return String.format(
            "{ \"message\": \"%s\", \"level\": \"%s\" }%n",
            record.getMessage(),
            record.getLevel().getName().toLowerCase()
        );
    }
}