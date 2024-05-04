package edu.erciyes.FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shapes extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.YELLOW);

        Rectangle r2 = new Rectangle(25,50,60,30);
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.BLACK);
        r2.setStrokeWidth(5);
        r2.setRotate(45);

        Rectangle r3 = new Rectangle(25,90,60,30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        r3.setVisible(false);

        Pane root = new Pane();
        root.getChildren().addAll(r1,r2,r3);
        stage.setScene(new Scene(root, 300,200));
        stage.show();
    }
}
