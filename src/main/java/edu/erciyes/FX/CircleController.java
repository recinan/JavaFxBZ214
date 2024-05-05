package edu.erciyes.FX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController extends Application {

    private int radius;
    public Circle createCircle(Circle circle,int radius){
        circle = new Circle(circle.getCenterX(),circle.getCenterY(),radius);
        circle.setFill(Color.RED);
        circle.setFocusTraversable(true);

        return circle;
    }

    public void moveCircle(Circle circle){
        circle.setOnMouseClicked((MouseEvent event) -> circle.requestFocus());
        circle.setOnMouseDragged((MouseEvent mouseEvent) -> {
            circle.setCenterX(mouseEvent.getX());
            circle.setCenterY(mouseEvent.getY());
        });

        circle.setOnKeyPressed((KeyEvent keyEvent) -> {
            switch (keyEvent.getCode()){
                case UP: circle.setCenterY(circle.getCenterY() - 10);break;
                case DOWN: circle.setCenterY(circle.getCenterY() + 10);break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10);break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10);break;
            }
        });
    }
    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        radius = 50;

        Button btnGROW = new Button("GROW");
        btnGROW.setLayoutX(20);
        btnGROW.setLayoutY(20);

        Button btnDECREASE = new Button("DECREASE");
        btnDECREASE.setLayoutX(120);
        btnDECREASE.setLayoutY(20);

        Circle circle = new Circle(100,100,radius);
        circle.setFill(Color.RED);
        circle.setFocusTraversable(true);

        btnGROW.setOnAction(event -> {
            radius += 10;
            double xGrowed = circle.getCenterX();
            double yGrowed = circle.getCenterY();
            Circle growedCircle = createCircle(circle,radius);
            root.getChildren().clear();
            root.getChildren().addAll(growedCircle, btnGROW, btnDECREASE);
            moveCircle(growedCircle);
        });
        btnDECREASE.setOnAction(event -> {
            radius -= 10;
            double xDecreased = circle.getCenterX();
            double yDecreased = circle.getCenterY();
            Circle decreasedCircle = createCircle(circle,radius);
            root.getChildren().clear();
            root.getChildren().addAll(decreasedCircle,btnGROW, btnDECREASE);
            moveCircle(decreasedCircle);
        });

        moveCircle(circle);


//        circle.setOnMouseDragged(new EventHandler<MouseEvent>(){
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                circle.setCenterX(mouseEvent.getX());
//                circle.setCenterY(mouseEvent.getY());
//            }
//        });

        root.getChildren().addAll(circle, btnGROW, btnDECREASE);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Circle Controller");
        stage.show();

    }

}
