import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.example.parte2A.WallPostUI;

public class Ejercicio1Application {
    private static final Logger modelLogger = Logger.getLogger("ModelLogger");
    private static final Logger uiLogger = Logger.getLogger("UILogger");

    public static void main(String[] args) throws SecurityException, IOException {
        configureModelLogger();
        configureUILogger();

        // Registrar el inicio de la aplicación
        uiLogger.info("La aplicación ha iniciado.");

        // Crear la interfaz de usuario
        new WallPostUI(uiLogger, modelLogger);
    }

    private static void configureModelLogger() throws IOException {
        FileHandler fileHandler = new FileHandler("model.log", true);
        fileHandler.setLevel(Level.WARNING);
        fileHandler.setFormatter(new SimpleFormatter());
        modelLogger.addHandler(fileHandler);
        modelLogger.setLevel(Level.WARNING);
        modelLogger.setUseParentHandlers(false);
    }

    private static void configureUILogger() throws IOException {
        FileHandler fileHandler = new FileHandler("ui.log", true);
        fileHandler.setLevel(Level.INFO);
        fileHandler.setFormatter(new SimpleFormatter());
        uiLogger.addHandler(fileHandler);
        uiLogger.setLevel(Level.INFO);
        uiLogger.setUseParentHandlers(false);
    }
}