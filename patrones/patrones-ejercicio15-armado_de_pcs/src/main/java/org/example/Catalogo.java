package org.example;

import java.util.List;

/*
    Algoritmo utilizado: BUILDER
 */

public class Catalogo {
    private List<Componente> componentes;

    public Catalogo(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public Componente getComponente(String descripcion) {
        return componentes.stream()
                .filter(componente -> componente.getDescripcion().equalsIgnoreCase(descripcion))
                .findFirst()
                .orElse(null);
    }

    public Computadora crearBasico(){
        Componente procesador = getComponente("Procesador Básico");
        Componente memoria = getComponente("8 GB");
        Componente discoDuro = getComponente("HDD 500 GB");
        Componente gabinete = getComponente("Gabinete Estándar (ya viene con fuente)");

        return new Computadora(List.of(procesador, memoria, discoDuro, gabinete));
    }

    public Computadora crearIntermedio(){
        Componente procesador = getComponente("Procesador Intermedio");
        Componente memoria = getComponente("16 GB");
        Componente discoDuro = getComponente("SSD 500 GB");
        Componente grafica = getComponente("GTX 1650");
        Componente gabinete = getComponente("Gabinete Intermedio");
        Componente fuente = getComponente("Fuente 800 w");

        return new Computadora(List.of(procesador, memoria, discoDuro, grafica, gabinete, fuente));
    }

    public Computadora crearGamer(){
        Componente procesador = getComponente("Procesador Gamer");
        Componente memoria1 = getComponente("32 gb");
        Componente memoria2 = getComponente("32 gb");
        Componente discoDuro1 = getComponente("SSD 500gb");
        Componente discoDuro2 = getComponente("SSD 1 TB");
        Componente grafica = getComponente("RTX 4090");
        Componente gabinete = getComponente("Gabinete Gamer");
        Computadora computadora = new Computadora(List.of(procesador, memoria1, memoria2, discoDuro1, discoDuro2, grafica, gabinete));
        Componente fuente = getComponente("Fuente " + String.valueOf(computadora.calcularConsumo()) + " w");
        computadora.agregarComponente(fuente);
        return computadora;
    }

    /*
    Lo necesario para agregar nuevas configuraciones seria implementar nuevos metodos
    que incorporen nuevos componentes a la computadora.
    Eso significa buscar los componentes necesarios y luego crear una computadora
    con la lista de componentes.
    Los pasos serian los siguientes:
    1. Crear un nuevo metodo en la clase Catalogo, por ejemplo crearGamerAvanzado()
    2. Dentro de ese metodo, buscar los componentes necesarios utilizando el metodo getComponente()
    3. Crear una nueva instancia de Computadora con la lista de componentes
    4. Retornar la nueva computadora creada
     */
}
