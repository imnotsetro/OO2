package org.example;

import java.util.LinkedList;
import java.util.List;

public class ExcursionMinima extends Excursion {
    private int cantFaltante;
    private int cupoMaximo;
    private List<String> emailsInscriptos;

    public ExcursionMinima(Aplicacion aplicacion, String nombre, String fechaInicio, String fechaFin, String puntoDeEncuentro, double costo, List<Usuario> inscriptos, int cantFaltante, int cupoMaximo) {
        super(aplicacion, nombre, fechaInicio, fechaFin, puntoDeEncuentro, costo, inscriptos);
        this.cantFaltante = cantFaltante;
        this.cupoMaximo = cupoMaximo;
        this.emailsInscriptos = new LinkedList<>();
    }

    public int getCantFaltante() {
        return cantFaltante;
    }

    public void setCantFaltante(int cantFaltante) {
        this.cantFaltante = cantFaltante;
    }

    void inscribir(Usuario unUsuario) {

    }
}
