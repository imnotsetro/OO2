package org.example;

public class DecoratorFechaModificacion extends Decorator{

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Fecha Modificacion: " + this.getFechaModificacion();
    }
}
