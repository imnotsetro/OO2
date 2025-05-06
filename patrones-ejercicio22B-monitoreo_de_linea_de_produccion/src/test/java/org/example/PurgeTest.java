package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 2. En este caso, para los TestDouble se necesitaria los
 * test Mock para comprobar la validez de los mensajes, adicionalmente
 * necesitaria tambien a Spy para guardar el registro de los mensajes
 * y asi comprobar que las temperaturas son correctas.
 * y el Fake para simular el comportamiento del metodo
 * execute().
 */
class PurgeTest {

    @Test
    void basicExecute() throws InterruptedException {
        Purge purge = new Purge();

        // Set initial state of the tank
        MixingTank tank = new ExampleTank(new I2CDriver(), 50, 50, 90, 50);

        // Execute the process step
        purge.execute(tank);

        // Check the result
        assertTrue(purge.isResult());
        assertEquals(0, tank.getHeatPower());
        assertEquals(0, tank.getMixPower());

        // Error Test
        purge.execute(tank);
        assertFalse(purge.isResult());

        assertFalse(tank.heatPower(120));
        assertFalse(tank.mixerPower(120));
        assertFalse(tank.heatPower(-20));
        assertFalse(tank.mixerPower(-20));
    }
}