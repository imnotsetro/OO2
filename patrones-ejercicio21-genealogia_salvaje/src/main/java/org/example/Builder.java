package org.example;

import java.time.LocalDate;

public class Builder {

    public Mamifero crearMamifero(int identificador, String especie, LocalDate fechaNacimiento) {
        return new Mamifero(identificador, especie, fechaNacimiento);
    }

    public Mamifero crearMamiferoPadres(int identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
        return new Mamifero(identificador, especie, fechaNacimiento, padre, madre);
    }

    public Mamifero crearMamiferoAbuelos(int identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre, Mamifero abueloPaterno, Mamifero abueloMaterno, Mamifero abuelaPaterno, Mamifero abuelaMaterno) {
        return new Mamifero(identificador, especie, fechaNacimiento, padre, madre, abueloPaterno, abueloMaterno, abuelaPaterno, abuelaMaterno);
    }
}