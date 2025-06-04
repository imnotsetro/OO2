package org.example;

public class Director {
    private Builder builder;

    public Director (Builder builder) {
        this.builder = builder;
    }

    public void setBuilder (Builder builder) {
        this.builder = builder;
    }

    public Presupuesto build (String nombre) {
        this.builder.reset();
        this.builder.setProcesador();
        this.builder.setMemoriaRAM();
        this.builder.setDisco();
        this.builder.setTarjetaGrafica();
        this.builder.setGabinete();
        this.builder.setUsuario(nombre);
        return this.builder.getPresupuesto();
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
