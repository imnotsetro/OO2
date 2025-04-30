package org.example;

public class Arco implements Arma{

    public int atacar(Armadura armadura) {
        return armadura.defenderContraArco();
    }
}
