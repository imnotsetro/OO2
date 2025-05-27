package org.example.tcp.server.reply;

public interface SessionTerminationStrategy {
    boolean shouldTerminate(String message);
}