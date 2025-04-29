package org.example;

public class DecoratorFechaCreacion extends Decorator {

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Fecha Creacion: " + this.getFechaCreacion();
    }
}
