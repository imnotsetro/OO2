package org.example;

import java.util.ArrayList;
import java.util.List;

public class SandwichCreator {
    private List<Ingrediente> ingredientes;

    public SandwichCreator(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Ingrediente buscarIngrediente(String nombre) {
        return ingredientes.stream()
            .filter(ingrediente -> ingrediente.getNombre().equals(nombre))
            .findFirst()
            .orElse(null);
    }

    public List<Ingrediente> crearSandwich(String pan, String aderezo, String principal, String adicional){
        Ingrediente panIngrediente = buscarIngrediente(pan);
        Ingrediente aderezoIngrediente = buscarIngrediente(aderezo);
        Ingrediente principalIngrediente = buscarIngrediente(principal);
        Ingrediente adicionalIngrediente = buscarIngrediente(adicional);
        return List.of(panIngrediente, aderezoIngrediente, principalIngrediente, adicionalIngrediente);
    }

    public List<Ingrediente> crearSandwichClasico() {
        return crearSandwich("Pan Brioche", "Mayonesa", "Carne de Ternera", "Tomate");
    }

    public List<Ingrediente> crearSandwichVegetariano() {
        return crearSandwich("Pan con Semillas", "Sin Aderezo", "Provoleta Grillada", "Berenjenas al Escabeche");
    }

    public List<Ingrediente> crearSandwichVegano() {
        return crearSandwich("Pan Integral", "Salsa Criolla", "Milanesa de Girgolas", "Sin Adicional");
    }

    public List<Ingrediente> crearSandwichSinTACC() {
        return crearSandwich("Pan de Chipá", "Salsa Tártara", "Carne de Pollo", "Verduras Grilladas");
    }

    private static void printSandwichTotal(String sandwichName, List<Ingrediente> sandwich) {
        double total = sandwich.stream()
                .filter(ingrediente -> ingrediente != null)
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
        System.out.println("Total price of " + sandwichName + ": $" + total);
    }

    public static void main(String[] args) {
        // Create the list of ingredients with their respective prices
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Pan Brioche", 100));
        ingredientes.add(new Ingrediente("Mayonesa", 20));
        ingredientes.add(new Ingrediente("Carne de Ternera", 300));
        ingredientes.add(new Ingrediente("Tomate", 80));
        ingredientes.add(new Ingrediente("Pan con Semillas", 120));
        ingredientes.add(new Ingrediente("Provoleta Grillada", 200));
        ingredientes.add(new Ingrediente("Berenjenas al Escabeche", 100));
        ingredientes.add(new Ingrediente("Pan Integral", 100));
        ingredientes.add(new Ingrediente("Sin Adicional", 0));
        ingredientes.add(new Ingrediente("Salsa Criolla", 20));
        ingredientes.add(new Ingrediente("Milanesa de Girgolas", 500));
        ingredientes.add(new Ingrediente("Pan de Chipá", 150));
        ingredientes.add(new Ingrediente("Salsa Tártara", 18));
        ingredientes.add(new Ingrediente("Carne de Pollo", 250));
        ingredientes.add(new Ingrediente("Sin Aderezo", 0));
        ingredientes.add(new Ingrediente("Verduras Grilladas", 200));

        // Initialize the SandwichCreator with the list of ingredients
        SandwichCreator sandwichCreator = new SandwichCreator(ingredientes);

        // Execute each sandwich creation method and print the prices of the ingredients
        printSandwichTotal("Clásico", sandwichCreator.crearSandwichClasico());
        printSandwichTotal("Vegetariano", sandwichCreator.crearSandwichVegetariano());
        printSandwichTotal("Vegano", sandwichCreator.crearSandwichVegano());
        printSandwichTotal("Sin TACC", sandwichCreator.crearSandwichSinTACC());
    }


}
