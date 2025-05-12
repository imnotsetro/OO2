package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {
    private SessionTerminationStrategy terminationStrategy = new DefaultTerminationStrategy();

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }



    private final void handleClient(Socket clientSocket) {
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {

            onClientConnected(clientSocket); // Hook: opcional, ejecutado al conectar un cliente

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                onMessageReceived(inputLine, clientSocket); // Hook: opcional, ejecutado al recibir un mensaje

                if (terminationStrategy.shouldTerminate(inputLine)) {
                    break; // Cliente solicitó cerrar la conexión
                }
                handleMessage(inputLine, out);
            }

            onClientDisconnected(clientSocket); // Hook: opcional, ejecutado al desconectar un cliente
        } catch (IOException e) {
            onError(clientSocket, e); // Hook: opcional, ejecutado en caso de error
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }

    // Métodos hook opcionales
    protected void onClientConnected(Socket clientSocket) {
        // Implementación opcional en subclases
    }

    protected void onMessageReceived(String message, Socket clientSocket) {
        // Implementación opcional en subclases
    }

    protected void onClientDisconnected(Socket clientSocket) {
        // Implementación opcional en subclases
    }

    protected void onError(Socket clientSocket, IOException e) {
        // Implementación opcional en subclases
    }
}
