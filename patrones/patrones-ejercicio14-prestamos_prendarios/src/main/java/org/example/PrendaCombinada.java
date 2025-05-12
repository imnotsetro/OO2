package org.example;

import java.time.LocalDate;
import java.util.List;

public class PrendaCombinada {
    List<Prenda> bienes;

    public PrendaCombinada(List<Prenda> bienes) {
        this.bienes = bienes;
    }

    public double calcularValor(){
        return bienes.stream().mapToDouble(Prenda::calcularValorPrendario).sum();
    }

    public double calcularValorPrendario(){
        return bienes.stream().mapToDouble(prenda -> prenda.calcularValor() * 0.5).sum();
    }

    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler((LocalDate.now().minusMonths(4)), LocalDate.now(), 5000.0);
        Automovil automovil = new Automovil("HB20", 500.0, 20000.0, 2);

        System.out.println("Valor total del alquiler: " + alquiler.calcularValorPrendario());
        System.out.println("Valor total del automovil: " + automovil.calcularValorPrendario());

        PrendaCombinada combinada = new PrendaCombinada(List.of(alquiler, automovil));

        System.out.println("Valor total de la prenda combinada: " + combinada.calcularValor());
        System.out.println("Valor prendario total de la prenda combinada: " + combinada.calcularValorPrendario());
    }
}
