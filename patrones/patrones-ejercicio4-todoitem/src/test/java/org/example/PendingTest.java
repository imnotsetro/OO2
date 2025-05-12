package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendingTest {
    private Pending state;
    private ToDoItem item;

    @BeforeEach
    void setUp() {
        state = new Pending();
        item = new ToDoItem("Test");
        item.setState(state);
    }

    @Test
    void start() {
        item.start();
        assertEquals(Inprogress.class, item.getState().getClass());
    }

    @Test
    void togglePause() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            item.togglePause();
        });
        assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress", exception.getMessage());
    }

    @Test
    void workedTime() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            item.workedTime();
        });
        assertEquals("El objeto ToDoItem no fue iniciado", exception.getMessage());
    }
}