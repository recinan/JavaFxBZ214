package edu.erciyes.FXControls;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

    private String[] maillist = {"mehmet.kaya@example.com","ayse.demir@example.com","ahmet.celik@example.com"};
    GridPane pane = new GridPane();
    Label lblTo = new Label("To: ");
    ComboBox<String> cboTo = new ComboBox<>();
    ObservableList<String> items = FXCollections.observableArrayList(maillist);
    Label lblSubject = new Label("Subject: ");
    TextField txtSubject = new TextField();
    TextArea txtMail = new TextArea();
    Button btnSend = new Button("Send");

    @Override
    public void start(Stage stage) throws Exception {
        cboTo.getItems().addAll(items);
        cboTo.setValue("mehmet.kaya@example.com");

//        pane.addColumn(1,lblTo);
//        pane.addColumn(2,cboTo);
        txtMail.setPrefColumnCount(25);
        pane.add(lblTo,1,1);
        pane.add(cboTo,2,1);
        pane.add(lblSubject,1,2);
        pane.add(txtSubject,2,2);;
        pane.add(txtMail,2,3);
        pane.add(btnSend,2,4);
        pane.setVgap(10.0);

        btnSend.setOnAction(event -> {
            System.out.println("Print");
        });

        stage.setScene(new Scene(pane));
        stage.setHeight(250);
        stage.setWidth(500);
        stage.show();

    }
}
