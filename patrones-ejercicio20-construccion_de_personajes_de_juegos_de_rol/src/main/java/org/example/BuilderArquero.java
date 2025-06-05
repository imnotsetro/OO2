package org.example;

import java.util.List;

public class BuilderArquero extends Builder{

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraCuero());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Arco());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().setHabilidades(List.of(new Habilidad("Combate a distancia")));
    }
}
