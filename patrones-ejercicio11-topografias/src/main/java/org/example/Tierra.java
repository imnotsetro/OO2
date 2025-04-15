package org.example;

class Tierra extends Topografia {
    @Override
    public double getProporcionAgua() {
        return 0.0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tierra;
    }
}