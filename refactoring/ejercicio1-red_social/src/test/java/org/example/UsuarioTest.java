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
        assertEquals(1, this.user.getTweets().size());
        this.user.borrarTweets();
        assertEquals(0, this.user.getTweets().size());
    }
}