package org.example;

public class DecoratorPermisos extends Decorator {

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Permisos: " + this.getPermisos();
    }
}
