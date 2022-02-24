
package sample;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Main extends Application {

    public int EXIST = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("IMAGES LAB 2");


        ImageView IMAGES_ARRAY[] = new ImageView[4];

        for (int i = 0; i < IMAGES_ARRAY.length; i++) {
            IMAGES_ARRAY[i] = new ImageView("file:C:\\Users\\yasee\\IdeaProjects\\Lab17\\src\\sample\\Cagatay Erdenet0"+i+".jpg");


            IMAGES_ARRAY[i].setFitHeight(600);
            IMAGES_ARRAY[i].setFitWidth(450);
            IMAGES_ARRAY[i].setPreserveRatio(true);
        }

        StackPane stack = new StackPane();
        stack.getChildren().add(IMAGES_ARRAY[0]);

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(stack);



        Scene scene = new Scene(borderPane, 600, 500);



        primaryStage.setScene(scene);


        EventHandler<ActionEvent> Handler = e -> {
            stack.getChildren().clear();
            stack.getChildren().add(IMAGES_ARRAY[PLUS()]);
        };


        KeyFrame FRAME = new KeyFrame(Duration.seconds(2), Handler);
        Timeline PLAYING_PICTURES = new Timeline(FRAME);

        PLAYING_PICTURES.setCycleCount(Timeline.INDEFINITE);
        PLAYING_PICTURES.play();


        stack.setOnMouseClicked(e -> {
            if (PLAYING_PICTURES.getStatus() == Animation.Status.RUNNING) {
                PLAYING_PICTURES.pause();
            } else {
                PLAYING_PICTURES.play();
            }
        });

        primaryStage.show();

    }

    public int PLUS() {

        if (this.EXIST + 1 > 3) {
            EXIST = 0;
            return 0;
        } else return ++EXIST;
    }

    public static void main(String[] args) {
        launch(args);
    }
}