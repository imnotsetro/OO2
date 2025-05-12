package org.example;

public class ArmaduraAcero implements Armadura{

    public int defenderContraEspada() {
        return 3;
    }

    public int defenderContraArco() {
        return 2;
    }

    public int defenderContraBaston() {
        return 1;
    }

    public int defenderContraMartillo() {
        return 8;
    }
}
