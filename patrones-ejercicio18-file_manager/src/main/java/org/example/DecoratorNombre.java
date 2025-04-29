package org.example;

public class DecoratorNombre extends Decorator{
    private Componente decorator;

    public String prettyPrint() {
        return this.decorator.prettyPrint() + " Nombre: " + this.getNombre();
    }
}
