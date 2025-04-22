package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    private Usuario usuario;
    private Director director;

    @BeforeEach
    void setUp() {
        DatabaseAccess database = new DatabaseRealAccess();
        this.director = new Director(database);
        this.usuario = new Usuario(false);
    }

    @Test
    void testUsuarioNoAutenticadoGetSearchResults() {
        // Usuario no autenticado
        assertNull(this.usuario.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testUsuarioNoAutenticadoInsertNewRow() {
        // Usuario no autenticado
        assertEquals(-1, this.usuario.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }

    @Test
    void testUsuarioAutenticadoGetSearchResults() {
        // Usuario autenticado
        this.usuario.setAutenticado(true);
        ArrayList<String> res = new ArrayList<>();
        res.add("Spiderman");
        res.add("Marvel");
        assertEquals(res,this.usuario.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testUsuarioAutenticadoInsertNewRow() {
        // Usuario autenticado
        this.usuario.setAutenticado(true);
        assertEquals(3, this.usuario.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}