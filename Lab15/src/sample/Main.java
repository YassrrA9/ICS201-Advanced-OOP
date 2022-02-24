package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

 public class Main extends Application {
    private Circle MyCircle = new Circle(10);

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        MyCircle.setCenterX(Math.random()*100);
        MyCircle.setCenterY(Math.random()*100);
        MyCircle.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MyCircle.setCenterX(Math.random()*100);
                MyCircle.setCenterY(Math.random()*100);
                MyCircle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            }
        });

        Pane pane = new Pane(MyCircle);
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setTitle("Random Circle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }


    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}


