package org.example;

public class EstadoMinimo extends Estado{

    public void agregarInscripto(Excursion excursion, Usuario usuario) {
        excursion.addInscripto(usuario);
        if (excursion.getInscriptos().size() == excursion.getCupoMaximo()){
            excursion.setEstado(new EstadoLleno());
        }
    }

    public String getInformacion(Excursion excursion) {
        return super.getInformacion(excursion) +
                "Mails de incriptos: " + excursion.getInscriptos().toString() +
                "Cantidad de incriptos faltantes= " + (excursion.getCupoMaximo() - excursion.getInscriptos().size());
    }
}
