package org.example.parte2B;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/*
    Inciso a resolver:
    Mediante un handler posibilite la opción de  enviar por correo electrónico los mensajes
    registrados por el framework. Al final del documento encontrará un anexo con una solución
    general al envío de mails desde una aplicación Java. Si lo considera conveniente, puede seguir
    estos pasos para resolver el envío de mails, adaptando lo que considere necesario para que la
    funcionalidad se ejecute al momento de realizar el logging de un mensaje.
 */
public class EmailHandler extends Handler {
    private String recipientEmail;
    private Properties emailProperties;

    public EmailHandler(String recipientEmail, Properties emailProperties) {
        this.recipientEmail = recipientEmail;
        this.emailProperties = emailProperties;
    }

    @Override
    public void publish(LogRecord record) {
        // Aquí se implementaría la lógica para enviar el correo electrónico
        // utilizando los detalles del registro y las propiedades de correo.
        String messageText = record.getMessage();
        // Enviar el mensaje por correo electrónico a recipientEmail
        try {
            String from = "example@logger.com";
            String to = "destination@mail.com";

            // credenciales
            String username = "403aaa76e98e4d"; // Completar con su username de mailtrap
            String password = "0ee8ccbecf1a7d"; // Completar con su password de mailtrap

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.mailtrap.io");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from, "Java logging mail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Tema del mail");
            message.setText(messageText);
            Transport.send(message);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void flush() {
        // No hay nada que hacer aquí por ahora
    }

    @Override
    public void close() throws SecurityException {
        // No hay nada que hacer aquí por ahora
    }


}