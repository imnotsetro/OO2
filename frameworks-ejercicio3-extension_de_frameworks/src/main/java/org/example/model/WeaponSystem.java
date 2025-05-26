package org.example.model;

public abstract class WeaponSystem {

    public void fireArms() {
        System.out.println("Robot firing " + this.getType());
    }

    public abstract String getType();

}
