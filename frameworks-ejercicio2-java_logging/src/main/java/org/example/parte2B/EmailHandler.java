package org.example.parte2B;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Falta implementar la clase EmailHandler.
 */

public class EmailHandler extends Handler {
    private final String smtpHost;
    private final String smtpPort;
    private final String username;
    private final String password;
    private final String recipient;

    public EmailHandler(String smtpHost, String smtpPort, String username, String password, String recipient) {
        this.smtpHost = smtpHost;
        this.smtpPort = smtpPort;
        this.username = username;
        this.password = password;
        this.recipient = recipient;
    }

    @Override
    public void publish(LogRecord record) {
        if (record == null || !isLoggable(record)) {
            return;
        }

        String subject = "Log Message: " + record.getLevel();
        String body = record.getMessage();

        sendEmail(subject, body);
    }

    private void sendEmail(String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", smtpPort);

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() {
        // No-op
    }

    @Override
    public void close() throws SecurityException {
        // No-op
    }
}