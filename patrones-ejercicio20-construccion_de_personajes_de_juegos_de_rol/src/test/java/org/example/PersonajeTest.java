package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {

    @Test
    public void testAtaquesEntrePersonajes() {
        Director director = new Director(new BuilderGuerrero());

        // Crear personajes
        Personaje guerrero = director.crearPersonaje("Guerrero");
        director.setBuilder(new BuilderArquero());
        Personaje arquero = director.crearPersonaje("Arquero");
        director.setBuilder(new BuilderMago());
        Personaje mago = director.crearPersonaje("Mago");
        director.setBuilder(new BuilderThoor());
        Personaje thoor = director.crearPersonaje("Thoor");

        // Vida inicial
        int vidaInicialGuerrero = guerrero.getVida();
        int vidaInicialArquero = arquero.getVida();
        int vidaInicialMago = mago.getVida();
        int vidaInicialThoor = thoor.getVida();

        // Ataques
        guerrero.atacar(arquero);
        arquero.atacar(mago);
        mago.atacar(thoor);
        thoor.atacar(guerrero);

        // Verificar que la vida disminuyó correctamente
        assertEquals(vidaInicialArquero - arquero.getArmadura().defenderContraEspada(), arquero.getVida());
        assertEquals(vidaInicialMago - mago.getArmadura().defenderContraArco(), mago.getVida());
        assertEquals(vidaInicialThoor - thoor.getArmadura().defenderContraBaston(), thoor.getVida());
        assertEquals(vidaInicialGuerrero - guerrero.getArmadura().defenderContraMartillo(), guerrero.getVida());
    }
}