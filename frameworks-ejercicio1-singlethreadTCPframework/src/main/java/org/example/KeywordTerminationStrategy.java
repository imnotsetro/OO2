package org.example;

public class KeywordTerminationStrategy implements SessionTerminationStrategy {
    private final String keyword;

    public KeywordTerminationStrategy(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean shouldTerminate(String message) {
        return message.equalsIgnoreCase(keyword);
    }
}
