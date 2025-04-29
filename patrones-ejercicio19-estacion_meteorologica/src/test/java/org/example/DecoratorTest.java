package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    private DecoratorMM decorator;

    @BeforeEach
    void setUp() {
        HomeWeatherStation weatherStation = new HomeWeatherStation(
                86.0, // Temperatura en grados Fahrenheit
                1013.25, // Presión atmosférica en hPa
                500.0, // Radiación solar
                Arrays.asList(86.0, 90.0, 80.0) // Lista de temperaturas sensadas en grados Fahrenheit
        );
        decorator = new DecoratorMM(new DecoratorP(new DecoratorC(weatherStation)));
    }

    @Test
    void displayData() {
        String expected = " Temperatura C: 30.0" +
                " Presión atmosf: 1013.25" +
                " Radiación solar: 500.0" +
                " Promedio: 85.33333333333333" +
                " Minimo: 80.0" +
                " Maximo: 90.0";
        assertEquals(expected, decorator.displayData());
    }
}