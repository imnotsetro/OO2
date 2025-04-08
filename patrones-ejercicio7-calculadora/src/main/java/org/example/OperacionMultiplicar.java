package org.example;

public class OperacionMultiplicar implements Operacion{

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValor(Double.parseDouble(calculadora.getValorAcumulado()) * unValor);
    }
}
