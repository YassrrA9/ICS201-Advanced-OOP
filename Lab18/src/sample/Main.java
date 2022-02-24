package sample;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
     Slider REDCOLOR = new Slider();
     Slider GREENCOLOR = new Slider();
     Slider BLUECOLOR = new Slider();
     Slider OPACITY = new Slider();

    Text Sentence = new Text("SENTENCE TO BE TESTED");
    ComboBox<String> FONTS = new ComboBox<>();

    CheckBox ISBOLD = new CheckBox("Bold");
    ComboBox<Integer> FONTSIZES = new ComboBox<>();

    CheckBox ISITALIC = new CheckBox("Italic");
    @Override
    public void start(Stage primaryStage) throws Exception {
        REDCOLOR.setMin(0.0);
        REDCOLOR.setMax(1.0);
        GREENCOLOR.setMin(0.0);
        GREENCOLOR.setMax(1.0);
        BLUECOLOR.setMin(0.0);
        BLUECOLOR.setMax(1.0);
        OPACITY.setMin(0.0);
        OPACITY.setMax(1.0);

        REDCOLOR.valueProperty().addListener(ov -> setColor());
        GREENCOLOR.valueProperty().addListener(ov -> setColor());
        BLUECOLOR.valueProperty().addListener(ov -> setColor());
        OPACITY.valueProperty().addListener(ov -> setColor());
        OPACITY.setValue(1);

        Integer[] sizes = new Integer[100];

        for (int i = 0; i < 100; i++)
            sizes[i] = i + 1;

        FONTS.getItems().addAll(Font.getFamilies());
        FONTS.setValue(Sentence.getFont().getFamily());
        FONTS.setOnAction(e-> update());
        Label FONTS_TYPES = new Label("Font Name", FONTS);
        FONTS_TYPES.setContentDisplay(ContentDisplay.RIGHT);

        FONTSIZES.getItems().addAll(getSizes());
        FONTSIZES.setValue((int)Sentence.getFont().getSize());
        FONTSIZES.setOnAction(e -> {
            update();
            primaryStage.sizeToScene();
        });
        Label FONTS_SIZES = new Label("Font Size",FONTSIZES);
        FONTS_SIZES.setContentDisplay(ContentDisplay.RIGHT);

        FlowPane Pane1 = new FlowPane(Orientation.HORIZONTAL);
        Pane1.getChildren().add(FONTS_TYPES);
        Pane1.getChildren().add(FONTS_SIZES);


        ISBOLD.setOnAction(e-> update());
        ISITALIC.setOnAction(e-> update());

        HBox SHAPE_CHANGE = new HBox();
        SHAPE_CHANGE.getChildren().addAll(ISBOLD,ISITALIC);
        VBox CHANGEPANE = new VBox();
        CHANGEPANE.getChildren().addAll(ISBOLD,ISITALIC,new Label("Red"),REDCOLOR,new Label("Grean"),GREENCOLOR,new Label("Blue"),BLUECOLOR,new Label("Opacity"),OPACITY);
        CHANGEPANE.setAlignment(Pos.BOTTOM_CENTER);

        StackPane SENTENCEPANE = new StackPane(Sentence);
        BorderPane borderPane = new BorderPane(SENTENCEPANE);
        borderPane.setTop(Pane1);
        borderPane.setBottom(CHANGEPANE);

        primaryStage.setTitle("LAB18");
        primaryStage.setScene(new Scene(borderPane,450,500));
        primaryStage.show();

    }
    private void update(){
        FontWeight WEIGHT = (ISBOLD.isSelected()) ? FontWeight.BOLD : FontWeight.NORMAL;
        FontPosture POSTURE = (ISITALIC.isSelected()) ? FontPosture.ITALIC : FontPosture.REGULAR;
        String fontFamily = FONTS.getValue();
        double size = FONTSIZES.getValue();
        Sentence.setFont(Font.font(fontFamily, WEIGHT, POSTURE, size));
    }

    private Integer[] getSizes() {
        Integer[] sizes = new Integer[100];

        for (int i = 0; i < 100; i++)
            sizes[i] = i + 1;

        return sizes;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    private void setColor() {
        Sentence.setFill(new Color(REDCOLOR.getValue(), GREENCOLOR.getValue(),
                BLUECOLOR.getValue(), OPACITY.getValue()));
    }

}