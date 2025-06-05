package org.example;

import java.util.List;

public class BuilderMago extends Builder{

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraCuero());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Baston());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().setHabilidades(List.of(new Habilidad("Magia"), new Habilidad("Combate a distancia")));
    }
}
