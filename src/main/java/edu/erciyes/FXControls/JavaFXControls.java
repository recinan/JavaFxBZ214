package edu.erciyes.FXControls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXControls extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();

        Text text = new Text(50,50,"BZ214 Visual Programming");
        Pane paneText = new Pane();
        paneText.getChildren().add(text);
        root.setCenter(paneText);

        ImageView leftImage = new ImageView("file:C:\\Users\\Recep Inan\\Desktop\\DevExe\\Java\\JavaFxBasicsBZ214\\src\\main\\resources\\left.png");
        ImageView rightImage = new ImageView("file:C:\\Users\\Recep Inan\\Desktop\\DevExe\\Java\\JavaFxBasicsBZ214\\src\\main\\resources\\right.png");
        leftImage.setFitHeight(25);
        leftImage.setFitWidth(35);
        rightImage.setFitHeight(25);
        rightImage.setFitWidth(35);

        Button btnLEFT = new Button("Left", leftImage);
        Button btnRIGHT = new Button("Right",rightImage);
        HBox paneButton = new HBox();
        paneButton.getChildren().addAll(btnLEFT, btnRIGHT);
        paneButton.setAlignment(Pos.CENTER);
        paneButton.setSpacing(10);
        paneButton.setStyle("-fx-border-color: green");
        root.setBottom(paneButton);
        btnLEFT.setOnAction(event -> {
            text.setX(text.getX()-10);
        });
        btnRIGHT.setOnAction(event -> {
            text.setX(text.getX()+10);
        });

        VBox paneCheck = new VBox();
        CheckBox checkBold = new CheckBox("Bold");
        CheckBox checkItalic = new CheckBox("Italic");
        paneCheck.setSpacing(10);
        paneCheck.setPadding(new Insets(5,5,5,5));
        paneCheck.setStyle("-fx-border-color: green");
        paneCheck.getChildren().addAll(checkBold, checkItalic);
        root.setRight(paneCheck);

        EventHandler<ActionEvent> checkHandler = event -> {
            if(checkBold.isSelected() && checkItalic.isSelected()){
                text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 18));
            }
            else if(checkBold.isSelected()){
                text.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
            }
            else if(checkItalic.isSelected()){
                text.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.ITALIC, 18));
            }
            else{
                text.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 18));
            }
        };

        checkBold.setOnAction(checkHandler);
        checkItalic.setOnAction(checkHandler);

        VBox paneRadio = new VBox();
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);

        paneRadio.setSpacing(10);
        paneRadio.setPadding(new Insets(5,5,5,5));
        paneRadio.setStyle("-fx-border-color: green");
        paneRadio.getChildren().addAll(rbRed,rbGreen,rbBlue);
        root.setLeft(paneRadio);

        EventHandler<ActionEvent> checkRadioButton = event -> {
            if(rbRed.isSelected()){
                text.setFill(Color.RED);
            }
            if(rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
            if(rbBlue.isSelected()){
                text.setFill(Color.BLUE);
            }
        };
        rbRed.setOnAction(checkRadioButton);
        rbGreen.setOnAction(checkRadioButton);
        rbBlue.setOnAction(checkRadioButton);

        HBox paneTextField = new HBox();
        Label lbl = new Label("New text");
        TextField textField = new TextField();
        textField.setPrefColumnCount(35);
        paneTextField.setSpacing(10);
        paneTextField.setPadding(new Insets(5,5,5,5));
        paneTextField.setStyle("-fx-border-color: green");
        paneTextField.getChildren().addAll(lbl, textField);
        root.setTop(paneTextField);

        textField.setOnAction(event -> {
            text.setText(textField.getText());
        });

        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Controls");
        stage.show();

    }
}
