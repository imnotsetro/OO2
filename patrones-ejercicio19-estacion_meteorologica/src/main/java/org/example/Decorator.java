package org.example;

import java.util.List;

abstract class Decorator implements WeatherData{
    private WeatherData data;

    public Decorator(WeatherData data) {
        this.data = data;
    }

    public double getTemperaturaF() {
        return this.data.getTemperatura();
    }

    public List<Double> getTemperaturasSensadas() {
        return this.data.getTemperaturas();
    }

    public WeatherData getData() {
        return data;
    }

    public void setData(WeatherData data) {
        this.data = data;
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura() {
        return this.data.getTemperatura();
    }

    //retorna la presión atmosférica en hPa
    public double getPresion(){
        return this.data.getPresion();
    }

    //retorna la radiación solar
    public double getRadiacionSolar(){
        return this.data.getRadiacionSolar();
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas(){
        return this.data.getTemperaturas();
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return this.data.displayData();
    }
}
