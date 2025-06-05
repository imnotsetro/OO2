package org.example;

public class EstadoIncompleto extends Estado{

    public void agregarInscripto(Excursion excursion, Usuario usuario) {
        excursion.addInscripto(usuario);
        if (excursion.getInscriptos().size() == excursion.getCupoMinimo()){
            excursion.setEstado(new EstadoMinimo());
        }
    }

    public String getInformacion(Excursion excursion) {
        return super.getInformacion(excursion) + "Cantidad de incriptos faltantes= " + (excursion.getCupoMinimo() - excursion.getInscriptos().size());
    }
}
