package org.example;

public class EstadoProvisoria implements Estado{
    private int cantFaltantes;

    public EstadoProvisoria(Excursion excursion) {
        this.cantFaltantes = excursion.getCupoMinimo();
    }

    public void inscribir(Usuario usuario, Excursion excursion) {
        if ((this.cantFaltantes - 1) == 0) {
            excursion.setEstado(new EstadoMinimo(excursion));
        } else {
            cantFaltantes--;
        }
    }

    public String obtenerInformacion(Excursion excursion) {
        return excursion.toString() +
                "cantFaltantes=" + cantFaltantes +
                '}';
    }
}
