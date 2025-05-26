package org.example.model;

public abstract class EnergySource {

    public void consumeBattery(Robot robot) {
        System.out.println("Robot " + robot.getName() + " using " + this.getType());
    }

    public abstract String getType();

}
