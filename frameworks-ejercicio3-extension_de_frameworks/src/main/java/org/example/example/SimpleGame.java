package org.example.example;

import org.example.model.*;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new Robot("Twonky", new SolarPanelEnergy(), new LasersWeapon(), new CaterpillarLocomotion()));
        board.add(new Robot("Hammer Bot", new NuclearEnergy(), new BombsWeapon(), new FourXFourLocomotion()));
        board.runForCicles(5);
    }
}
