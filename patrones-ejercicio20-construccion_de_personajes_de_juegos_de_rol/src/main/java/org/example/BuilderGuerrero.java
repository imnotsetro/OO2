package org.example;

import java.util.List;

public class BuilderGuerrero extends Builder{

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraAcero());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Espada());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().setHabilidades(List.of(new Habilidad("Combate cuerpo a cuerpo")));
    }
}
