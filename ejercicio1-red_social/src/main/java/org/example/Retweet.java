package org.example;

public class Retweet implements Post {
    private Tweet origen;

    public Retweet(Tweet origen) {
        this.origen = origen;
    }

    @Override
    public boolean esDe(String name) {
        return this.origen.esDe(name);
    }
}
