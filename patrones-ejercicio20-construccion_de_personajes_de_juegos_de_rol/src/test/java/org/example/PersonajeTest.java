package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {

    @Test
    public void testAtaquesEntrePersonajes() {
        Builder builder = new Builder();

        // Crear personajes
        Personaje guerrero = builder.crearGuerrero();
        Personaje arquero = builder.crearArquero();
        Personaje mago = builder.crearMago();
        Personaje thoor = builder.crearThoor();

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