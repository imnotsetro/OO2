package org.example;

public class DecoratorExtencion extends Decorator{

    public String prettyPrint() {
        return this.getComponente().prettyPrint() + " Extencion: " + this.getExtension();
    }
}
