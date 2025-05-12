package org.example;

public class Espada implements Arma{

    public int atacar(Armadura armadura) {
        return armadura.defenderContraEspada();
    }
}
