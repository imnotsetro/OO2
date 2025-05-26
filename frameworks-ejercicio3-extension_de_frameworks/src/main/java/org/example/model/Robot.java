package org.example.model;

public class Robot
{
    String name;

    EnergySource energySource;
    WeaponSystem weaponSystem;
    LocomotionSource locomotionSource;

    public Robot(String name, EnergySource energySource, WeaponSystem weaponSystem, LocomotionSource locomotionSource) {
        this.name = name;
        this.energySource = energySource;
        this.weaponSystem = weaponSystem;
        this.locomotionSource = locomotionSource;
    }

    public String getName() {
        return name;
    }
    
    public void step() {
        locomotionSource.move();
        energySource.consumeBattery(this);
        this.weaponSystem.fireArms();
        this.collectArtifacts();
    }

    public void collectArtifacts() {
        System.out.println("Robot " + this.getName() + " collecting");
    }
    
}
