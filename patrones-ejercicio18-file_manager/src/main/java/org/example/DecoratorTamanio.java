package org.example;

public class DecoratorTamanio extends Decorator{

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Tamaño: " + this.getTamanio();
    }
}
