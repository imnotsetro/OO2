package org.example;

import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> vistas;
    private CriterioSugerencia criterio;

    public Decodificador(List<Pelicula> grilla, List<Pelicula> reproduce, CriterioSugerencia criterio) {
        this.grilla = grilla;
        this.vistas = reproduce;
        this.criterio = criterio;
    }

    public List<Pelicula> getGrilla() {
        return grilla;
    }

    public void setGrilla(List<Pelicula> grilla) {
        this.grilla = grilla;
    }

    public List<Pelicula> getVistas() {
        return vistas;
    }

    public void setVistas(List<Pelicula> vistas) {
        this.vistas = vistas;
    }

    public CriterioSugerencia getCriterio() {
        return criterio;
    }

    public void setCriterio(CriterioSugerencia criterio) {
        this.criterio = criterio;
    }

    public List<Pelicula> sugerir(){
        return this.criterio.sugerir(this);
    }
}
