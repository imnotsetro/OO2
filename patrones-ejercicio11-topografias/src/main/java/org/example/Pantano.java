package org.example;

class Pantano extends Topografia {
    @Override
    public double getProporcionAgua() {
        return 0.7;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Pantano;
    }
}