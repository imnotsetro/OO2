package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PausedTest {
    private Paused state;
    private ToDoItem item;

    @BeforeEach
    void setUp() {
        state = new Paused();
        item = new ToDoItem("Test");
        item.setState(state);
    }

    @Test
    void togglePause() {
        item.togglePause();
        assertEquals(Inprogress.class, item.getState().getClass());
    }

    @Test
    void finish() {
        item.finish();
        assertEquals(Finished.class, item.getState().getClass());
    }

    @Test
    void workedTime() {
        item.setStarted(LocalDateTime.now().minusDays(2));
        int expected = 2;
        assertEquals(expected,(int) item.workedTime().toDays());
    }
}