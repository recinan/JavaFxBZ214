package edu.erciyes.FX;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {

//        Rectangle rect1 = new Rectangle(10,10,100,100);
//        FadeTransition ft = new FadeTransition(Duration.millis(3000), rect1);
//        ft.setFromValue(1.0);
//        ft.setToValue(0.1);
//        ft.setCycleCount(Timeline.INDEFINITE);
//        ft.setAutoReverse(true);
//        ft.play();

        Rectangle rectangle = new Rectangle(0,0,25,50);
        Circle circle = new Circle(250,200,100);
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();

        Pane root = new Pane();
        root.getChildren().addAll(rectangle, circle);
        stage.setScene(new Scene(root,600,600));
        stage.show();
    }
}
