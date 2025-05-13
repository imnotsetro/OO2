package org.example;

import java.io.PrintWriter;
import java.security.SecureRandom;

public class PasswordServer extends SingleThreadTCPServer {

    @Override
    public void handleMessage(String message, PrintWriter out) {
        try {
            // Dividir el mensaje en los tres argumentos
            String[] args = message.split(" ");
            if (args.length != 3) {
                out.println("Error: Se requieren exactamente 3 argumentos (letras, numeros, caracteres especiales).");
                return;
            }

            String letters = args[0];
            String numbers = args[1];
            String specialChars = args[2];

            // Validar que los argumentos no estén vacíos
            if (letters.isEmpty() || numbers.isEmpty() || specialChars.isEmpty()) {
                out.println("Error: Ningun argumento puede estar vacío.");
                return;
            }

            // Generar la contraseña
            String password = generatePassword(letters, numbers, specialChars);
            out.println(password);
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }

    private String generatePassword(String letters, String numbers, String specialChars) {
        SecureRandom random = new SecureRandom();

        // Seleccionar al menos un carácter de cada categoría
        char letter = letters.charAt(random.nextInt(letters.length()));
        char number = numbers.charAt(random.nextInt(numbers.length()));
        char specialChar = specialChars.charAt(random.nextInt(specialChars.length()));

        // Rellenar el resto de la contraseña con caracteres aleatorios de letras y números
        String allChars = letters + numbers;
        StringBuilder password = new StringBuilder();
        password.append(letter).append(number).append(specialChar);

        for (int i = 3; i <= 8; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Mezclar los caracteres para evitar patrones predecibles
        return shuffleString(password.toString(), random);
    }

    private String shuffleString(String input, SecureRandom random) {
        char[] array = input.toCharArray();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }
}