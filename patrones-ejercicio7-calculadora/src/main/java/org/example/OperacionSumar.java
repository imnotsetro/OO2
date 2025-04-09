package org.example;

public class OperacionSumar extends OperacionComun {

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado(String.valueOf(Double.parseDouble(calculadora.getValorAcumulado()) + unValor));
        calculadora.setOperacion(new OperacionInicial());
    }
}
