package org.example;

public abstract class MixingTank {
    private I2CDriver driver;
    private int mixPower;
    private int heatPower;
    private int temperature;
    private int ocupation;

    public MixingTank(I2CDriver driver, int mixPower, int heatPower, int temperature, int ocupation) {
        this.driver = driver;
        this.mixPower = mixPower;
        this.heatPower = heatPower;
        this.temperature = temperature;
        this.ocupation = ocupation;
    }

    private int getHigh(int porcentage){
        int result = porcentage / 25;
        if (result > 2){
            result ++;
        }
        return result;
    }

    public boolean heatPower(int percentage) throws InterruptedException {
        if (percentage < 0 || percentage > 100) {
            return false;
        }
        driver.sendCommand("heatPower" + percentage);
        this.heatPower = percentage;
        int tempPlus = getHigh(percentage);
        if (tempPlus != 0){
            while (this.temperature < 100) {
                Thread.sleep(1000);
                this.temperature += tempPlus;
            }
        }
        return true;
    }

    public boolean mixerPower(int percentage){
        if (percentage < 0 || percentage > 100) {
            return false;
        }
        driver.sendCommand("mixerPower" + percentage);
        this.mixPower = percentage;
        return true;
    }

    public boolean purge() throws InterruptedException {
        driver.sendCommand("purge");
        Thread.sleep(4000); // Simulate time taken to purge
        this.ocupation = 0;
        return true;
    }

    public double upTo(){
        return this.ocupation;
    }

    public double temperature(){
        return this.temperature;
    }

    public int getMixPower() {
        return mixPower;
    }

    public int getHeatPower() {
        return heatPower;
    }
}
