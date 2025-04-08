package org.example;

public class OperacionDividir implements Operacion{

    public void setValor(double unValor, Calculadora calculadora) {
        if (unValor == 0) {
            calculadora.setValorAcumulado("Error");
        } else {
            calculadora.setValor(Double.parseDouble(calculadora.getValorAcumulado()) / unValor);
        }
    }
}
