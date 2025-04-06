package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FinishedTest {
    private Finished state;
    private ToDoItem item;

    @BeforeEach
    void setUp() {
        state = new Finished();
        item = new ToDoItem("Test");
        item.setState(state);
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
        item.setStarted(LocalDateTime.now());
        item.setFinished(LocalDateTime.now().plusWeeks(1));
        int expected = 7;
        assertEquals(expected, (int) item.workedTime().toDays());
    }
}