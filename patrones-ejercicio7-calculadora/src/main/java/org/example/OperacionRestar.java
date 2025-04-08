package org.example;

public class OperacionRestar implements Operacion{

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValor(Double.parseDouble(calculadora.getValorAcumulado()) - unValor);
    }
}
