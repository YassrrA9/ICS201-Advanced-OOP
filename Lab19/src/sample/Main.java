package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Main extends Application {

    Media VIDEO ;
    MediaPlayer VIDEOPLAYER;
    MediaView MEDIASCENE;
    BorderPane pane;
    int Check=0;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {



        Button PLAY_BT = new Button("PLAY");
        Button PAUSE_BT = new Button("PAUSE");
        Button RESTART_BT = new Button("RESTART");
        Button STOP_BT = new Button("STOP");



        PLAY_BT.setOnAction(e -> VIDEOPLAYER.play());
        PAUSE_BT.setOnAction(e -> VIDEOPLAYER.pause());
        RESTART_BT.setOnAction(e -> {VIDEOPLAYER.stop(); VIDEOPLAYER.play();});
        STOP_BT.setOnAction(e -> VIDEOPLAYER.stop());




        Slider SLIDER_VOLUME = new Slider();
        SLIDER_VOLUME.setPrefWidth(180);
        SLIDER_VOLUME.setMaxWidth(Region.USE_PREF_SIZE);
        SLIDER_VOLUME.setMinWidth(50);
        SLIDER_VOLUME.setValue(50);




        HBox BUTTONS_BOX_1 = new HBox();
        HBox VOLUME_BOX_2 = new HBox();



        BUTTONS_BOX_1.setAlignment(Pos.BOTTOM_LEFT);
        BUTTONS_BOX_1.getChildren().addAll(PLAY_BT, PAUSE_BT, RESTART_BT,STOP_BT);
        BUTTONS_BOX_1.setSpacing(10);

        VOLUME_BOX_2.setAlignment(Pos.BOTTOM_RIGHT);
        VOLUME_BOX_2.getChildren().addAll(new Label("Volume"), SLIDER_VOLUME);

        FlowPane ALL_BUTTONS = new FlowPane(Orientation.HORIZONTAL);
        ALL_BUTTONS.setAlignment(Pos.BOTTOM_CENTER);
        ALL_BUTTONS.getChildren().addAll(BUTTONS_BOX_1,VOLUME_BOX_2);
        ALL_BUTTONS.setHgap(100);



        HBox URL_BUTTON = new HBox(10);
        URL_BUTTON.setAlignment(Pos.CENTER);
        TextField TEXT_FIELD = new TextField();
        Label MESSAGE = new Label("VIDEO URL ");
        TEXT_FIELD.setMaxWidth(500);

        URL_BUTTON.getChildren().addAll(MESSAGE, TEXT_FIELD);


        TEXT_FIELD.setOnAction(e -> {

            if(Check==0){
            Media VIDEO = new Media(TEXT_FIELD.getText());
            VIDEOPLAYER  = new MediaPlayer(VIDEO);
            MEDIASCENE = new MediaView(VIDEOPLAYER);
            MEDIASCENE.setFitHeight(700);
            MEDIASCENE.setFitWidth(750);
            MEDIASCENE.setMediaPlayer(VIDEOPLAYER);
            VIDEOPLAYER.volumeProperty().bind(
                    SLIDER_VOLUME.valueProperty().divide(100));
            pane = new BorderPane();
            pane.setCenter(MEDIASCENE);
            pane.setBottom(ALL_BUTTONS);
            pane.setTop(URL_BUTTON);
            Scene scene = new Scene(pane, 850, 600);
            primaryStage.setTitle("MediaPlayer");
            primaryStage.setScene(scene);
            primaryStage.show();
            Check++;
            }
            else{
                VIDEOPLAYER.stop();
                Media VIDEO = new Media(TEXT_FIELD.getText());
                VIDEOPLAYER  = new MediaPlayer(VIDEO);
                MEDIASCENE = new MediaView(VIDEOPLAYER);
                MEDIASCENE.setFitHeight(700);
                MEDIASCENE.setFitWidth(750);
                MEDIASCENE.setMediaPlayer(VIDEOPLAYER);
                VIDEOPLAYER.volumeProperty().bind(
                        SLIDER_VOLUME.valueProperty().divide(100));
                pane = new BorderPane();
                pane.setCenter(MEDIASCENE);
                pane.setBottom(ALL_BUTTONS);
                pane.setTop(URL_BUTTON);
                Scene scene = new Scene(pane, 850, 600);
                primaryStage.setTitle("MediaPlayer");
                primaryStage.setScene(scene);
                primaryStage.show();
                Check++;
            }

        });

        BorderPane pane = new BorderPane();
        pane.setCenter(MEDIASCENE);
        pane.setBottom(ALL_BUTTONS);
        pane.setTop(URL_BUTTON);



        Scene scene = new Scene(pane, 850, 600);
        primaryStage.setTitle("MediaPlayer");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
    

}
