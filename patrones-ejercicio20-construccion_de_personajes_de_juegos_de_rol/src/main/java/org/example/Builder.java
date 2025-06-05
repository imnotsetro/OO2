package org.example;

import java.util.ArrayList;
import java.util.List;

/*
    El patron builder es necesario para la creacion
    de personajes pre-fabricados, de esta manera
    se puede agregar nuevos agregando nuevos metodos.
*/

public abstract class Builder {
    private Personaje personaje;

    public Builder() {
        this.personaje = new Personaje();
    }

    public void reset() {
        this.personaje = new Personaje();
    }

    public void setNombre(String nombre) {
        this.personaje.setNombre(nombre);
    }

    public void setVida() {
        this.personaje.setVida(100);
    }

    public abstract void setArmadura();

    public abstract void setArma();

    public abstract void setHabilidades();

    public Personaje getPersonaje() {
        return this.personaje;
    }
}
