package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Mixta extends Topografia {
    private List<Topografia> partes;

    public Mixta(Topografia parte1, Topografia parte2, Topografia parte3, Topografia parte4) {
        this.partes = new ArrayList<>(Arrays.asList(parte1, parte2, parte3, parte4));
    }

    @Override
    public double getProporcionAgua() {
        return partes.stream().mapToDouble(Topografia::getProporcionAgua).sum() / 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mixta)) return false;
        Mixta other = (Mixta) obj;
        return this.partes.equals(other.partes);
    }
}