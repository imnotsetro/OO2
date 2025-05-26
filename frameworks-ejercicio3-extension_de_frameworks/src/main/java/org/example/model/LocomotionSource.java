package org.example.model;

public abstract class LocomotionSource {

    public void move() {
        System.out.println("Robot moving on " + this.getType());
    }

    public abstract String getType();
}
