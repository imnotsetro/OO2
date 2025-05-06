package org.example;

public class ExampleTank extends MixingTank{

    public ExampleTank(I2CDriver driver, int mixPower, int heatPower, int temperature, int ocupation) {
        super(driver, mixPower, heatPower, temperature, ocupation);
    }
}
