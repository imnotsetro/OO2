package org.example;

import java.util.ArrayList;
import java.util.List;

/*
    El patron builder es necesario para la creacion
    de personajes pre-fabricados, de esta manera
    se puede agregar nuevos agregando nuevos metodos.
*/

public class Builder {

    public Personaje crearGuerrero(){
        return new Personaje("Guerrero", new ArmaduraAcero(), new Espada(), List.of(new Habilidad("Combate Cuerpo A Cuerpo")));
    }

    public Personaje crearArquero(){
        return new Personaje("Arquero", new ArmaduraCuero(), new Arco(), List.of(new Habilidad("Disparo de Flecha")));
    }

    public Personaje crearMago(){
        return new Personaje("Mago", new ArmaduraCuero(), new Baston(), List.of(new Habilidad("Magia"), new Habilidad("Combate a Distancia")));
    }

    // El personaje Thoor es un personaje especial pedido en el inciso B
    public Personaje crearThoor(){
        return new Personaje("Thoor", new ArmaduraHierro(), new Martillo(), List.of(new Habilidad("Lanzar Rayor"), new Habilidad("Combate a Distancia")));
    }
}
