import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * A simple drawing application using JavaFX.
 * Click and drag the mouse to draw.
 *
 * Note: To run this, you need a Java Development Kit (JDK) that includes JavaFX.
 * If you are using OpenJDK 11 or later, you may need to add the JavaFX
 * modules to your project.
 *
 * If using a command line, you might need to run it like this (assuming JavaFX SDK
 * is in a folder named 'javafx-sdk'):
 *
 * 1. Compile:
 * javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.graphics SimpleDrawingApp.java
 *
 * 2. Run:
 * java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.graphics SimpleDrawingApp
 */
public class SimpleDrawingApp extends Application {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {

        // 1. Create the Canvas
        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);

        // 2. Get GraphicsContext
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // 3. Drawing properties
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3.0);

        // 4. Mouse Pressed
        canvas.setOnMousePressed(event -> {
            gc.beginPath();
            gc.moveTo(event.getX(), event.getY());
            gc.stroke();
        });

        // 5. Mouse Dragged
        canvas.setOnMouseDragged(event -> {
            gc.lineTo(event.getX(), event.getY());
            gc.stroke();

            gc.beginPath();
            gc.moveTo(event.getX(), event.getY());
        });

        // 6. Scene Setup
        StackPane root = new StackPane(canvas);
        root.setStyle("-fx-background-color: white;");

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        primaryStage.setTitle("Simple Drawing App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
