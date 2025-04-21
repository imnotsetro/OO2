package org.example;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
    private List<ProductoFinanciero> productos;

    public void agregarProducto(ProductoFinanciero producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(ProductoFinanciero producto) {
        this.productos.remove(producto);
    }

    public List<ProductoFinanciero> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoFinanciero> productos) {
        this.productos = productos;
    }

    public double retornoInversion(double montoInicial) {
        return 0;
    }
}
