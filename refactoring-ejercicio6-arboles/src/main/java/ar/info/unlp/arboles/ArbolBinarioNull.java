package ar.info.unlp.arboles;

public class ArbolBinarioNull implements IArbolBinario {

    public int getValor() {
        return Integer.MIN_VALUE;
    }

    public void setValor(int valor) {
    }

    public IArbolBinario getHijoIzquierdo() {
        return new ArbolBinarioNull();
    }

    public void setHijoIzquierdo(IArbolBinario hijoIzquierdo) {
    }

    public IArbolBinario getHijoDerecho() {
        return new ArbolBinarioNull();
    }

    public void setDerecha(IArbolBinario hijoDerecho) {
    }

    public String recorrerPreorden() {
        return "";
    }

    public String recorrerInorden() {
        return "";
    }

    public String recorrerPostorden() {
        return "";
    }
}
