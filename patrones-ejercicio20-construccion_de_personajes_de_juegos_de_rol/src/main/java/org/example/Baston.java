package org.example;

public class Baston implements Arma{

    public int atacar(Armadura armadura) {
        return armadura.defenderContraBaston();
    }
}
