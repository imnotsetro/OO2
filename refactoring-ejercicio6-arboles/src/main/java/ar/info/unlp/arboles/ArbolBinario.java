package ar.info.unlp.arboles;

public class ArbolBinario implements IArbolBinario {
    private int valor;
    private IArbolBinario hijoIzquierdo;
    private IArbolBinario hijoDerecho;

    public ArbolBinario(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = new ArbolBinarioNull();
        this.hijoDerecho = new ArbolBinarioNull();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public IArbolBinario getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(IArbolBinario hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public IArbolBinario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDerecha(IArbolBinario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String recorrerPreorden() {
        return valor + " - " + this.getHijoIzquierdo().recorrerPreorden() + this.getHijoDerecho().recorrerPreorden();
    }

   public String recorrerInorden() {
       return "" + this.getHijoIzquierdo().recorrerInorden() + valor + " - " + this.getHijoDerecho().recorrerInorden();
    }

   public String recorrerPostorden() {
       return "" + this.getHijoIzquierdo().recorrerPostorden() + this.getHijoDerecho().recorrerPostorden() + valor + " - ";
    }

}

