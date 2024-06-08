package edu.erciyes.FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Text text1 = new Text(20,20,"BZ 214 Visual Programming");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC,15));
        pane.getChildren().add(text1);

        Text text2 = new Text(60,60,"BZ 214 Visual Programming\nDisplay text");
        pane.getChildren().add(text2);

        Text text3 = new Text(10,100,"BZ 214 Visual Programming\nDisplay text");
        text3.setFill(Color.RED);
        text3.setUnderline(true);
        text3.setStrikethrough(true);
        pane.getChildren().add(text3);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setWidth(350);
        stage.setHeight(250);
        stage.show();
    }
}
