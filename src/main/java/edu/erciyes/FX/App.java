package edu.erciyes.FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Label lbl = new Label("Hello");
//        lbl.setFont(Font.font("Arial",20));
//        lbl.setMinWidth(100);
//
//        TextField txt = new TextField();
//        txt.setMinWidth(100);
//
//        lbl.textProperty().bind(txt.textProperty());

        Button btnOK = new Button("OK");
        Button btnCancel = new Button("Cancel");
        Button btnExit = new Button("Exit");

        HBox root = new HBox();
        root.getChildren().clear();
        root.getChildren().add(btnOK);
        root.getChildren().addAll(btnCancel, btnExit);
        root.getChildren().remove(btnExit);

//        HBox box = new HBox(20, lbl, txt); // root

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Hello World");
        stage.show();
    }
}
