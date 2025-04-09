package org.example;

public class EstadoMinimo implements Estado{
    private int cantFaltantes;

    public EstadoMinimo(Excursion excursion) {
        this.cantFaltantes = excursion.getCupoMaximo() - excursion.getCupoMinimo();
    }

    public void inscribir(Usuario usuario, Excursion excursion) {
        if ((this.cantFaltantes - 1) == 0) {
            excursion.setEstado(new EstadoLleno());
        } else {
            this.cantFaltantes--;
        }
    }

    public String obtenerInformacion(Excursion excursion) {
        return excursion.toString() +
                "cantFaltantes=" + cantFaltantes +
                '}';
    }
}
