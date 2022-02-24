
package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;


public class Main extends Application {

    public int EXIST = 0;


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("IMAGES LAB");


        ImageView IMAGES_ARRAY[] = new ImageView[4];

        for (int i = 0; i < IMAGES_ARRAY.length; i++) {
            IMAGES_ARRAY[i] = new ImageView("file:C:\\Users\\yasee\\IdeaProjects\\Lab16\\src\\sample\\CagatayErdenet"+i+".jpg");


            IMAGES_ARRAY[i].setFitHeight(600);
            IMAGES_ARRAY[i].setFitWidth(450);
            IMAGES_ARRAY[i].setPreserveRatio(true);
        }



        Button PRE = new Button("Previous");
        PRE.setAlignment(Pos.BOTTOM_LEFT);

        Button NEXT = new Button("Next");
        PRE.setAlignment(Pos.BOTTOM_RIGHT);


        StackPane stack = new StackPane();
        stack.getChildren().add(IMAGES_ARRAY[0]);

        HBox hBox = new HBox(45);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(PRE, NEXT);







        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);

        borderPane.setCenter(stack);



        Scene scene = new Scene(borderPane, 500, 600);



        primaryStage.setScene(scene);


        PRE.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stack.getChildren().clear();

                stack.getChildren().add(IMAGES_ARRAY[SUBSTARCT()]);


            }
        });

        NEXT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stack.getChildren().clear();

                stack.getChildren().add(IMAGES_ARRAY[PLUS()]);



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

    public int SUBSTARCT() {

        if (this.EXIST - 1 < 0) {
            EXIST = 3;
            return 3;
        } else return --EXIST;
    }


    public static void main(String[] args) {
        launch(args);
    }
}



