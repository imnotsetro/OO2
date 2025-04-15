package org.example;

public class Mensajero {
    private Algoritmo algoritmo;


    // PROBLEMA: Como puedo hacer que los dos destinatarios
    // tengan el mismo algoritmo?
    public Mensajero(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    // PROBLEMA: Como puedo hacer que los dos destinatarios


    public String enviar(String mensaje, String key){
        String mensajeEncriptado = algoritmo.enviar(mensaje, key);
        return algoritmo.recibir(mensaje, key);
    }

    public void recibir(String mensaje, String key){
        System.out.println("Mensaje recibido: " + algoritmo.recibir(mensaje, key));
    }

    public Algoritmo getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    public static void main(String[] args) {
        Mensajero testMensajero = new Mensajero(new RC4Adapter(new RC4()));
        String mensaje = testMensajero.enviar("Hola", "dljasndjkbdjkwqbjkdsqjkbdqbwjkdbjqwkbdjkqwbdjkbqwjkdbqwjkdbqjwkbd");
        testMensajero.recibir(mensaje, "dljasndjkbdjkwqbjkdsqjkbdqbwjkdbjqwkbdjkqwbdjkbqwjkdbqwjkdbqjwkbd");
        testMensajero.setAlgoritmo(new FCAdapter());
        mensaje = testMensajero.enviar("Hola", "kSjdajSkeiMdjSahd");
        testMensajero.recibir(mensaje, "kSjdajSkeiMdjSahd");
    }


}