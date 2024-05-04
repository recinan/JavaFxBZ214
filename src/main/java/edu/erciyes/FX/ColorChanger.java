package edu.erciyes.FX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ColorChanger extends Application {
    private Label lbl;

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);

        lbl = new Label("BZ214 Visual Programming");
        lbl.setFont(Font.font(24));

        Button btn = new Button("Random Color");
        btn.setOnAction(event -> {lbl.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));});
//        btn.setOnAction((ActionEvent event) -> {
//            double red = Math.random();
//            double green = Math.random();
//            double blue = Math.random();
//            Color color = Color.color(red, green, blue);
//            lbl.setTextFill(color);
//        });

//        ClickHandler handler = new ClickHandler();
//        btn.setOnAction(handler);
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                int red = (int)(Math.random()*256);
//                int green = (int)(Math.random()*256);
//                int blue = (int)(Math.random()*256);
//                Color color = Color.rgb(red,green,blue);
//                lbl.setTextFill(color);
//            }
//        });

        root.getChildren().addAll(lbl, btn);

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Color Changer");
        stage.show();

    }

//    class ClickHandler implements EventHandler<ActionEvent>{
//
//        @Override
//        public void handle(ActionEvent event) {
//            int red = (int)(Math.random()*256);
//            int green = (int)(Math.random()*256);
//            int blue = (int)(Math.random()*256);
//            Color color = Color.rgb(red, green, blue);
//            lbl.setTextFill(color);
//        }
//    }
}

//class ClickHandler implements EventHandler<ActionEvent>{
//    private Label lbl;
//    public ClickHandler(Label lbl){
//        this.lbl = lbl;
//    }
//
//    @Override
//    public void handle(ActionEvent event) {
//        int red = (int)(Math.random()*256);
//        int green = (int)(Math.random()*256);
//        int blue = (int)(Math.random()*256);
//        Color color = Color.rgb(red, green, blue);
//        lbl.setTextFill(color);
//
//    }
//}
