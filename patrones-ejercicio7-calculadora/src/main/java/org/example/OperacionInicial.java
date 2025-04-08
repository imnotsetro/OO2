package org.example;

public class OperacionInicial implements Operacion{

    public void setValor(double unValor, Calculadora calculadora) {
        calculadora.setValorAcumulado();
    }

    /**
     * Indica que la calculadora debe esperar un nuevo valor.
     * Si a continuación se le envía el mensaje setValor(), la calculadora sumará el valor recibido como parámetro, al valor actual y guardará el resultado
     */
    public void mas() {
        this.operacion = new OperacionSumar();
    }

    public void menos() {
        this.operacion = new OperacionRestar();
    }

    public void por() {
        this.operacion = new OperacionMultiplicar();
    }

    public void dividir() {
        this.operacion = new OperacionDividir();
    }
}
