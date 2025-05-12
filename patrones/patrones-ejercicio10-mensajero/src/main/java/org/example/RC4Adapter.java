package org.example;

public class RC4Adapter implements Algoritmo{
    private RC4 algoritmo;

    public RC4Adapter(RC4 algoritmo) {
        this.algoritmo = algoritmo;
    }

    public String enviar(String mensaje, String key){
        return algoritmo.encriptar(mensaje, key);
    }

    public String recibir(String mensaje, String key){
        return algoritmo.desencriptar(mensaje, key);
    }
}
