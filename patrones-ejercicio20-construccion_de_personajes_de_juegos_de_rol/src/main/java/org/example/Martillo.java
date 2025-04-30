package org.example;

// El martillo es un arma especial pedido en el inciso B
// Los daños fueron elegidos al azar
public class Martillo implements Arma{

    public int atacar(Armadura armadura) {
        return armadura.defenderContraMartillo();
    }
}
