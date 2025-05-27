package org.example.parte2B;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class WordFilterHandler extends Handler {
    private List<String> wordsToFilter;
    private String replacementMessage;

    public WordFilterHandler(List<String> wordsToFilter, String replacementMessage) {
        this.wordsToFilter = wordsToFilter;
        this.replacementMessage = replacementMessage;
    }

    /* * This handler filters log messages based on a list of words.
     * If the message contains any of the words, it is remplace with
     * replacementMessage.
     */
    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();
        for (String word : wordsToFilter) {
            if (message.contains(word)) {
                record.setMessage(replacementMessage);
                break;
            }
        }
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}