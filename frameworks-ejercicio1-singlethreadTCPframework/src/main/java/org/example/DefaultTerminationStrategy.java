package org.example;

public class DefaultTerminationStrategy implements SessionTerminationStrategy {
    @Override
    public boolean shouldTerminate(String message) {
        return message.equalsIgnoreCase(""); // Cierra con mensaje vacío
    }
}
