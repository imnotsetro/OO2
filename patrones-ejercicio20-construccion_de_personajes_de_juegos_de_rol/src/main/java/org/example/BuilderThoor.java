package org.example;

import java.util.List;

public class BuilderThoor extends Builder{

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraHierro());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Martillo());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().setHabilidades(List.of(new Habilidad("Rayos"), new Habilidad("Combate a distancia")));
    }
}
