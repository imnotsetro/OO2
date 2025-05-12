package org.example;

public class LightMix extends ProcessStep{

    @Override
    boolean basicExecute(MixingTank tank) throws InterruptedException {
        double temp = tank.temperature();
        tank.heatPower(100);
        Thread.sleep(2000);
        if(tank.temperature()-temp == 10 ){
            tank.mixerPower(5);
            return true;
        }
        else
            return false;
    }
}
