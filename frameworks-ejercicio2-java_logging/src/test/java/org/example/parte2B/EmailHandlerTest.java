package org.example.parte2B;

import org.junit.jupiter.api.Test;

import java.util.Properties;
import java.util.logging.LogRecord;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class EmailHandlerTest {

    @Test
    void testEmailHandlerSendsEmail() {
        // Configuración de las propiedades del correo
        Properties emailProperties = new Properties();
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        emailProperties.put("mail.smtp.host", "smtp.mailtrap.io");
        emailProperties.put("mail.smtp.port", "587");

        // Crear el EmailHandler
        String recipientEmail = "destination@mail.com";
        EmailHandler emailHandler = new EmailHandler(recipientEmail, emailProperties);

        // Crear un LogRecord con un mensaje
        LogRecord record = new LogRecord(java.util.logging.Level.INFO, "Test email message");

        // Verificar que no lanza excepciones al enviar el correo
        assertDoesNotThrow(() -> emailHandler.publish(record));
    }
}