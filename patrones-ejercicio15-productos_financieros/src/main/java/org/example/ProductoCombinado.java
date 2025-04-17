package org.example;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
    private List<ProductoFinanciero> productos;

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
