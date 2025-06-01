package ar.info.unlp.arboles;

public interface IArbolBinario {
    public int getValor();
    public void setValor(int valor);
    public IArbolBinario getHijoIzquierdo();
    public void setHijoIzquierdo(IArbolBinario hijoIzquierdo);
    public IArbolBinario getHijoDerecho();
    public void setDerecha(IArbolBinario hijoDerecho);
    public String recorrerPreorden();
    public String recorrerInorden();
    public String recorrerPostorden();
}
