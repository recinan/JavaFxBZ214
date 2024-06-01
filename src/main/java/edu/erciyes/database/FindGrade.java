package edu.erciyes.database;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.*;

public class FindGrade extends Application {
    FindGradeController controller = new FindGradeController();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane root = new GridPane();
        root.add(new Label("Student ID:"),0,0);
        root.add(controller.txtID,1,0);
        root.add(new Label("Course ID:"),0,1);
        root.add(controller.txtCourseID, 1,1);
        root.add(controller.btnFind,1,2);
        root.add(controller.lblStatus,0,3,1,2);
        root.setPadding(new Insets(10,10,10,10));
        root.setHgap(10);
        root.setVgap(10);

        controller.initializeDB();
        controller.btnFind.setOnAction(event -> {
            controller.showGrade();
        });

        stage.setScene(new Scene(root, 400,300));
        stage.setTitle("Find Grade");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stopped");
        controller.connection.close();
    }
}
