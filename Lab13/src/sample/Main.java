package sample;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.*;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Random random = new Random();
        int bound = 9;
        int[] arrayNum = new int[bound];
        for(int i=0; i<arrayNum.length; i++){
            arrayNum[i] = random.nextInt(bound)+1;
        }
        Button[] array2 = new Button[bound];
        for(int i=0; i<array2.length; i++){
            array2[i] = new Button(arrayNum[i]+"");
        }
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); // Set center alignment
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(10);
        pane.setVgap(15);
        for(int k=0; k<3; k++){
            for(int m=0; m<3; m++){
                pane.add(array2[3*m+k],k,m);
            }
        }


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab13"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
    }

        public static void main(String[] args) {
        launch(args);
    }
}
