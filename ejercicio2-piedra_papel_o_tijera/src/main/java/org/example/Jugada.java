package org.example;

public interface Jugada {
    public String jugarContra(Jugada jugada);
    public String jugarContraPiedra();
    public String jugarContraPapel();
    public String jugarContraTijera();
    public String jugarContraLagarto();
    public String jugarContraSpock();
}