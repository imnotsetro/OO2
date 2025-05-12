package org.example;

import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double temperaturaF;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturasSensadas;

    public HomeWeatherStation(double temperaturaF, double presion, double radiacionSolar, List<Double> temperaturasSensadas) {
        this.temperaturaF = temperaturaF;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
        this.temperaturasSensadas = temperaturasSensadas;
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura() {
        return this.temperaturaF;
    }

    //retorna la presión atmosférica en hPa
    public double getPresion(){
        return this.presion;
    }

    //retorna la radiación solar
    public double getRadiacionSolar(){
        return this.radiacionSolar;
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas(){
        return this.temperaturasSensadas;
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "";
    }
}
