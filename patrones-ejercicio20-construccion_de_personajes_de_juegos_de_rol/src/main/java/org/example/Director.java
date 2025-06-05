package org.example;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Personaje crearPersonaje(String nombre) {
        builder.setNombre(nombre);
        builder.setVida();
        builder.setArma();
        builder.setArmadura();
        builder.setHabilidades();
        return builder.getPersonaje();
    }
}
