package sample;



import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane PANE = new StackPane();
        Text PHRASE = new Text("STOP");
        PHRASE.setFont(new Font("Times New Roman", 65));
        PHRASE.setFill(Color.WHITE);

        MyPolygon POLYGON = new MyPolygon();
        PANE.getChildren().addAll(POLYGON,PHRASE);
        Scene scene = new Scene(PANE, 350, 250);
        primaryStage.setTitle("STOP SIGN");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

class MyPolygon extends Pane {
    private void paint() {
        // Create a polygon and place polygon to pane
        Polygon POLYGON = new Polygon();
        POLYGON.setFill(Color.RED);
        POLYGON.setStroke(Color.BLACK);
        POLYGON.setStrokeWidth(7);
        POLYGON.setRotate(22);

        ObservableList<Double> list = POLYGON.getPoints();

        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;

        // Add points to the polygon list
        for (int i = 0; i < 8; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }

        getChildren().clear(); // Clear pane
        getChildren().add(POLYGON);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}