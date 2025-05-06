package org.example;

public class I2CDriver {
    private int SCL;
    private int SDL;

    public I2CDriver() {
        this.SCL = 0;
        this.SDL = 0;
    }

    public boolean sendsStartSeq() {
        // Simulate sending a start sequence
        System.out.println("Start sequence sent.");
        return true;
    }

    public boolean sendAddress(String adress){
        // Simulate sending an address
        System.out.println("Address sent: " + adress);
        return true;
    }

    public boolean sendCommand(String commando){
        // Simulate sending a command
        System.out.println("Command sent: " + commando);
        return true;
    }

    public boolean sendStopSeq() {
        // Simulate sending a stop sequence
        System.out.println("Stop sequence sent.");
        return true;
    }

    public int getSCL() {
        return SCL;
    }

    public void setSCL(int SCL) {
        this.SCL = SCL;
    }

    public int getSDL() {
        return SDL;
    }

    public void setSDL(int SDL) {
        this.SDL = SDL;
    }
}
