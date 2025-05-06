package org.example;

import java.time.LocalDate;

public class Mamifero {
    private int identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;
    private Mamifero abueloPaterno;
    private Mamifero abueloMaterno;
    private Mamifero abuelaPaterno;
    private Mamifero abuelaMaterno;

    public Mamifero(int identificador, String especie, LocalDate fechaNacimiento) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero(int identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.padre = padre;
        this.madre = madre;
    }

    public Mamifero(int identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre, Mamifero abueloPaterno, Mamifero abueloMaterno, Mamifero abuelaPaterno, Mamifero abuelaMaterno) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.padre = padre;
        this.madre = madre;
        this.abueloPaterno = abueloPaterno;
        this.abueloMaterno = abueloMaterno;
        this.abuelaPaterno = abuelaPaterno;
        this.abuelaMaterno = abuelaMaterno;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloPaterno() {
        return abueloPaterno;
    }

    public void setAbueloPaterno(Mamifero abueloPaterno) {
        this.abueloPaterno = abueloPaterno;
    }

    public Mamifero getAbueloMaterno() {
        return abueloMaterno;
    }

    public void setAbueloMaterno(Mamifero abueloMaterno) {
        this.abueloMaterno = abueloMaterno;
    }

    public Mamifero getAbuelaPaterno() {
        return abuelaPaterno;
    }

    public void setAbuelaPaterno(Mamifero abuelaPaterno) {
        this.abuelaPaterno = abuelaPaterno;
    }

    public Mamifero getAbuelaMaterno() {
        return abuelaMaterno;
    }

    public void setAbuelaMaterno(Mamifero abuelaMaterno) {
        this.abuelaMaterno = abuelaMaterno;
    }
}
