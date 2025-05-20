package org.example;

import java.io.PrintWriter;
import java.security.SecureRandom;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        try {
            // Dividir el mensaje en los tres argumentos
            String[] args = message.split(" ");
            if (args.length < 2 && args.length > 3) {
                out.println("Error: Se requieren 2 argumentos como minimo (String a repetir, cantidad de veces, delimitador).");
                return;
            }

            if (!isIntegerValid(args[1])){
                out.println("No es un número entero válido: " + args[1]);
                return;
            }

            String stringRepeat = args[0];
            int repeat = Integer.parseInt(args[1]);
            String delimit = " ";

            if (repeat <= 0){
                out.println("Error: La cantidad de repeticiones no puede ser negativa o 0.");
                return;
            }

            if (args.length == 3) {
                delimit = args[2];
            }

            // Validar que los argumentos no estén vacíos
            if (stringRepeat.isEmpty()) {
                out.println("Error: El String no puede estar vacio.");
                return;
            }

            // Repetir String
            out.println(repeatString(stringRepeat, repeat, delimit, out));
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }

    private String repeatString(String stringRepeat, int repeat, String delimit, PrintWriter out) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            result.append(stringRepeat + delimit);
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    public static boolean isIntegerValid(String input) {
        try {
            int numero = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }
}