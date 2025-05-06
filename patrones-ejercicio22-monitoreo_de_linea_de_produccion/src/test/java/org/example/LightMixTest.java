package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 2. En este caso, para los TestDouble se necesitaria los
 * test Mock para comprobar la validez de los mensajes
 * y el Fake para simular el comportamiento del metodo
 * execute().
 */
class LightMixTest {

    @Test
    void basicExecute() {
        LightMix lightMix = new LightMix();

        // Set initial state of the tank
        MixingTank tank = new ExampleTank(new I2CDriver(), 50, 50, 90, 50);

        // Execute the process step
        lightMix.execute(tank);

        // Check the result
        assertTrue(lightMix.isResult());
        assertEquals(20, tank.getHeatPower());
        assertEquals(5, tank.getMixPower());

        // Error Test
        assertFalse(tank.heatPower(120));
        assertFalse(tank.mixerPower(120));
        assertFalse(tank.heatPower(-20));
        assertFalse(tank.mixerPower(-20));
    }
}