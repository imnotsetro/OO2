package org.example;

import java.util.Date;

abstract class ProductoFinanciero {
    private Date fechaOperacion;

    abstract public double retornoInversion(double montoInicial);
}
