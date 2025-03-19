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
        assertEquals(3, this.tw.getUsuarios().size());
        assertTrue(this.tw.getUsuarios().contains(user2));
        this.tw.borrarUsuario("Martin");
        assertEquals(2, this.tw.getUsuarios().size());
        assertFalse(this.tw.getUsuarios().contains(user2));
    }

}