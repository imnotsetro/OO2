package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwitterTest {
    private Twitter tw;

    @BeforeEach
    void setUp() {
        this.tw = new Twitter();
    }


    @Test
    void borrarUsuario() {
        Usuario user1 = new Usuario("Marcelo");
        this.tw.agregarUsuario(user1);
        Usuario user2 = new Usuario("Martin");
        this.tw.agregarUsuario(user2);
        Usuario user3 = new Usuario("Veronica");
        this.tw.agregarUsuario(user3);
        assertEquals(this.tw.getUsuarios().size(), 3);
        assertTrue(this.tw.getUsuarios().contains(user2));
        this.tw.borrarUsuario("Martin");
        assertEquals(this.tw.getUsuarios().size(), 2);
        assertFalse(this.tw.getUsuarios().contains(user2));
    }

}