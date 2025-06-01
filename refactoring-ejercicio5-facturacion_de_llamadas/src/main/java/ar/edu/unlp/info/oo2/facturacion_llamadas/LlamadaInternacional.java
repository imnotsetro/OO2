package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional implements TipoLlamada{

    public double getPrecio(int duracion) {
        return duracion * 150 + (duracion * 150 * 0.21) + 50;
    }
}
