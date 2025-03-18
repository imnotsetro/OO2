package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario user;

    @BeforeEach
    void setUp() {
        this.user = new Usuario("NameTest");
        this.user.crearTweet("Test");
    }

    @Test
    void borrarTweets() {
        assertEquals(this.user.getTweets().size(), 1);
        this.user.borrarTweets();
        assertEquals(this.user.getTweets().size(), 0);
    }
}