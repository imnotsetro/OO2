package org.example;

public abstract class Builder {
    private Presupuesto presupuesto;

    public Builder() {
        this.reset();
    }

    public void reset() {
        this.presupuesto = new Presupuesto();
    }

    public abstract void setProcesador();

    public abstract void setMemoriaRAM();

    public abstract void setDisco();

    public abstract void setTarjetaGrafica();

    public abstract void setGabinete();

    public Presupuesto getPresupuesto() {
        return this.presupuesto;
    }

    public void setUsuario(String nombre) {
        this.presupuesto.setUsuario(nombre);
    }

}
