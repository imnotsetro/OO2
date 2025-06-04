package org.example;

public class Vehiculo {
    private Cliente propietario;
    private String marca;
    private String modelo;
    private int antiguedadEnAnios;
    private double valor;
    private int cantOcupantes;

    public Vehiculo(Cliente propietario, String marca, String modelo, int antiguedadEnAnios, double valor, int cantOcupantes) {
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.antiguedadEnAnios = antiguedadEnAnios;
        this.valor = valor;
        this.cantOcupantes = cantOcupantes;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAntiguedadEnAnios() {
        return antiguedadEnAnios;
    }

    public void setAntiguedadEnAnios(int antiguedadEnAnios) {
        this.antiguedadEnAnios = antiguedadEnAnios;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCantOcupantes() {
        return cantOcupantes;
    }

    public void setCantOcupantes(int cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }
}
