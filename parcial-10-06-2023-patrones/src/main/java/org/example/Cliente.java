package org.example;

import java.util.List;

public class Cliente {
    private String nombre;
    private int edad;
    private List<Vehiculo> vehiculos;

    public Cliente(String nombre, int edad, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.edad = edad;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
