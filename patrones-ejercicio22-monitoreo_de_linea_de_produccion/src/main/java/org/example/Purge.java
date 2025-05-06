package org.example;

public class Purge extends ProcessStep{

    @Override
    boolean basicExecute(MixingTank tank) {
        return tank.heatPower(0) && tank.mixerPower(0) && tank.purge();
    }
}
