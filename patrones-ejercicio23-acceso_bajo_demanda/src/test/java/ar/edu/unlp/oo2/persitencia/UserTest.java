package ar.edu.unlp.oo2.persitencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


/*
    Para el test se utiliza la simulacion que otorga
    el Fake para simular el comportamiento del metodo
 */
class UserTest {
    private PersistableUser user;

    @BeforeEach
    void setUp() {
        UserRepository userRepository = new UserRepository();
        user = userRepository.findUserByUsername("jane_smith");
    }

    @Test
    void getPosts() {
        assertEquals(2 , user.getPosts().size());
        assertTrue(user.getPosts().stream()
                .anyMatch(post -> post.getText().equals("Hoy es un gran día.")));
        assertTrue(user.getPosts().stream()
                .anyMatch(post -> post.getText().equals("Compartiendo algunas fotos del viaje reciente.")));
    }
}