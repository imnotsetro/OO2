package org.example;

import java.time.Duration;
import java.time.LocalDate;

public class Finished implements State{

    public void start(ToDoItem item) {}

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem item) {}

    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getStarted(), item.getFinished());
    }

    public void addComment(ToDoItem item, String comment) {}
}
