package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Paused implements State{

    public void start(ToDoItem item) {}

    public void togglePause(ToDoItem item) {
        item.setState(new Inprogress());
    }

    public void finish(ToDoItem item) {
        item.setState(new Finished());
        item.setFinished(LocalDateTime.now());
    }

    public Duration workedTime(ToDoItem item) {
        return Duration.between(item.getStarted(), LocalDateTime.now());
    }

    public void addComment(ToDoItem item, String comment) {
        item.addCommentToList(comment);
    }
}
