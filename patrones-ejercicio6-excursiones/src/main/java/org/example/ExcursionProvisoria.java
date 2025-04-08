package org.example;

public class ExcursionProvisoria extends Excursion{
    private int cantFaltante;
    private int cupoMinimo;

    public ExcursionProvisoria(String nombre, String fechaInicio, String fechaFin, String puntoDeEncuentro, double costo, int cantFaltante, int cupoMinimo) {
        super(nombre, fechaInicio, fechaFin, puntoDeEncuentro, costo);
        this.cantFaltante = cantFaltante;
        this.cupoMinimo = cupoMinimo;
    }

    public int getCantFaltante() {
        return cantFaltante;
    }

    public void setCantFaltante(int cantFaltante) {
        this.cantFaltante = cantFaltante;
    }

    void inscribir(Usuario unUsuario) {
        this.cantFaltante--;
        if (this.cantFaltante == 0) {
            System.out.println("No hay cupo disponible");
            return;
        }
        this.getInscriptos().add(unUsuario);
    }
}
