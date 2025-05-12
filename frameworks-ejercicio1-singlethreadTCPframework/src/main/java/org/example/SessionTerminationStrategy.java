package org.example;

public interface SessionTerminationStrategy {
    boolean shouldTerminate(String message);
}