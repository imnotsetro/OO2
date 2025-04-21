package org.example;

import java.util.List;

public class Computadora {
    private List<Componente> componentes;

    public Computadora(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void agregarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public double calcularConsumo(){
        return componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
    }

    public double calcularPrecioUnitario(){
        return componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
    }

    public double calcularPrecio(){
        return calcularPrecioUnitario() * 1.21;
    }
}
