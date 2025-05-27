package org.example.tcp.server.reply;

public class DefaultTerminationStrategy implements SessionTerminationStrategy {
    @Override
    public boolean shouldTerminate(String message) {
        return message.equalsIgnoreCase(""); // Cierra con mensaje vacío
    }
}
