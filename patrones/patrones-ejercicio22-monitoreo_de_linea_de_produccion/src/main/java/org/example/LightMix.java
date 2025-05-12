package org.example;

public class LightMix extends ProcessStep{

    @Override
    boolean basicExecute(MixingTank tank) {
        return tank.heatPower(20) && tank.mixerPower(5);
    }
}
