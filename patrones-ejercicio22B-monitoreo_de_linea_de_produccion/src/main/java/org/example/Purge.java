package org.example;

public class Purge extends ProcessStep{

    @Override
    boolean basicExecute(MixingTank tank) throws InterruptedException {
        if (tank.upTo() == 0) {
            return false;
        }
        else {
            tank.heatPower(0);
            tank.mixerPower(0);
            tank.purge();
            Thread.sleep(4000);
            if (tank.upTo() != 0){
                return false;
            }
            return true;
        }

    }
}
