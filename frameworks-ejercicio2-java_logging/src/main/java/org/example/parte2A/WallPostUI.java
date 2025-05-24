package org.example.parte2A;

import java.awt.GridLayout;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class WallPostUI {
    private WallPost wallPost;
    private JTextArea textArea;
    private JLabel likesLabel;
    private JCheckBox featuredCheckbox;
    private JButton like;
    private JButton dislike;
    private JButton send; // Nuevo botón "Enviar"
    private Logger uiLogger;

    public WallPostUI(Logger uiLogger, Logger modelLogger) {
        this.uiLogger = uiLogger;
        this.wallPost = new WallPostImpl(modelLogger);
        this.textArea = new JTextArea();
        this.likesLabel = new JLabel("0");
        this.featuredCheckbox = new JCheckBox();
        this.like = new JButton("Like");
        this.dislike = new JButton("Dislike");
        this.send = new JButton("Enviar"); // Inicialización del botón
        setUpWindow();
        wireComponents();
    }

    private void setUpWindow() {
        JFrame window = new JFrame("WallPost");
        JPanel pane = new JPanel();
        window.getContentPane().add(pane);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(640, 480);
        pane.setLayout(new GridLayout(6, 1, 1, 10)); // Ajustar el layout para incluir el botón "Enviar"
        pane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JScrollPane scrollPane = new JScrollPane(this.textArea);
        pane.add(scrollPane);
        this.textArea.setEditable(true);
        this.textArea.setLineWrap(true);
        this.textArea.setWrapStyleWord(true);

        JPanel likesPane = new JPanel();
        likesPane.setLayout(new GridLayout(1, 2));
        likesPane.add(new JLabel("Likes"));
        likesPane.add(this.likesLabel);
        pane.add(likesPane);

        JPanel likeButtonsPane = new JPanel();
        likeButtonsPane.setLayout(new GridLayout(1, 2));
        likeButtonsPane.add(this.like);
        likeButtonsPane.add(this.dislike);
        pane.add(likeButtonsPane);

        JPanel featuredPane = new JPanel();
        featuredPane.setLayout(new GridLayout(1, 2));
        featuredPane.add(new JLabel("Featured"));
        featuredPane.add(this.featuredCheckbox);
        pane.add(featuredPane);

        pane.add(this.send); // Agregar el botón "Enviar" al panel

        window.pack();
        window.setVisible(true);
    }

    private void wireComponents() {
        this.like.addActionListener(e -> {
            this.wallPost.like();
            this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
            uiLogger.info("Se hizo clic en 'Like'.");
        });

        this.dislike.addActionListener(e -> {
            this.wallPost.dislike();
            this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
            uiLogger.info("Se hizo clic en 'Dislike'.");
        });

        this.featuredCheckbox.addActionListener(e -> {
            this.wallPost.toggleFeatured();
            uiLogger.info("Se cambió el estado de destacado del post.");
        });

        this.textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
                uiLogger.info("Se actualizó el texto del post.");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
                uiLogger.info("Se actualizó el texto del post.");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
                uiLogger.info("Se actualizó el texto del post.");
            }
        });

        this.send.addActionListener(e -> {
            String message = this.textArea.getText();
            uiLogger.info("Mensaje enviado: " + message);
            JOptionPane.showMessageDialog(null, "Mensaje enviado: " + message);
        });
    }
}