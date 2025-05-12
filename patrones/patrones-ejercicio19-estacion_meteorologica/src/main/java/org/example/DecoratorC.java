package org.example;

import java.util.List;

public class DecoratorC extends Decorator{

    public DecoratorC(WeatherData data) {
        super(data);
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura() {
        return (this.getData().getTemperatura()-32)/1.8;
    }

    //retorna la presión atmosférica en hPa
    public double getPresion(){
        return this.getData().getPresion();
    }

    //retorna la radiación solar
    public double getRadiacionSolar(){
        return this.getData().getRadiacionSolar();
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas(){
        return this.getData().getTemperaturas();
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return this.getData().displayData() +
                " Temperatura C: " + this.getTemperatura() +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
}
