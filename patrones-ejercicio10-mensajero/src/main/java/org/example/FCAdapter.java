package org.example;

public class FCAdapter implements Algoritmo {
    private FeistelCipher algoritmo;

    public FCAdapter() {
    }

    public String enviar(String mensaje, String key) {
        algoritmo = new FeistelCipher(key);
        return algoritmo.encode(mensaje);
    }

    public String recibir(String mensaje, String key) {
        algoritmo = new FeistelCipher(key);
        return algoritmo.encode(mensaje);
    }
}
