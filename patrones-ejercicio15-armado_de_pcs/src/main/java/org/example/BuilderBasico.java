package org.example;

import java.util.List;

public class BuilderBasico extends Builder {

    @Override
    public void setProcesador() {
        this.getPresupuesto().setProcesador(Catalogo.getComponente("Procesador Básico"));
    }

    @Override
    public void setMemoriaRAM() {
        this.getPresupuesto().setMemoriaRAM(Catalogo.getComponente("8 GB"));
    }

    @Override
    public void setDisco() {
        this.getPresupuesto().setDisco(Catalogo.getComponente("HDD 500 GB"));
    }

    @Override
    public void setTarjetaGrafica() {}

    @Override
    public void setGabinete() {
        this.getPresupuesto().setGabinete(Catalogo.getComponente("Gabinete Estándar"));
    }
}
