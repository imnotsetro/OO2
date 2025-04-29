package org.example;

public class DecoratorNombre extends Decorator{

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Nombre: " + this.getNombre();
    }
}
