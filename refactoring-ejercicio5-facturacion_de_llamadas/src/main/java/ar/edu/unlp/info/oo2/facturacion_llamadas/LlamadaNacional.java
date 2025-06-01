package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional implements TipoLlamada{

    public double getPrecio(int duracion) {
        return duracion * 3 + (duracion * 3 * 0.21);
    }
}
