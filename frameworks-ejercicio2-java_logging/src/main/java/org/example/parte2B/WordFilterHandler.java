package org.example.parte2B;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class WordFilterHandler extends Handler {
    private final Handler wrappedHandler;
    private final List<String> wordsToFilter;

    public WordFilterHandler(Handler wrappedHandler, List<String> wordsToFilter) {
        this.wrappedHandler = wrappedHandler;
        this.wordsToFilter = wordsToFilter;
    }

    @Override
    public void publish(LogRecord record) {
        if (record == null || !isLoggable(record)) {
            return;
        }

        String message = record.getMessage();
        for (String word : wordsToFilter) {
            message = message.replaceAll(word, "***");
        }
        record.setMessage(message);
        wrappedHandler.publish(record);
    }

    @Override
    public void flush() {
        wrappedHandler.flush();
    }

    @Override
    public void close() throws SecurityException {
        wrappedHandler.close();
    }
}