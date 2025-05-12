package org.example;

import java.time.Duration;

public interface State {

    public void start(ToDoItem item);

    public void togglePause(ToDoItem item);

    public void finish(ToDoItem item);

    public Duration workedTime(ToDoItem item);

    public void addComment(ToDoItem item, String comment);
}
