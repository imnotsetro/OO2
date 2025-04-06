package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pending implements State {

    public void start(ToDoItem item) {
        item.setState(new Inprogress());
        item.setStarted(LocalDateTime.now());
    }

    public void togglePause(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    public void finish(ToDoItem item) {}

    public Duration workedTime(ToDoItem item) {
        throw new RuntimeException("El objeto ToDoItem no fue iniciado");
    }

    public void addComment(ToDoItem item, String comment) {
        item.addCommentToList(comment);
    }
}
