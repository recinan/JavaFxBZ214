package edu.erciyes.FX;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClockAnimation extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane clock = new ClockPane();
        EventHandler<ActionEvent> handler = event -> clock.setCurrentTime();

        Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), handler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        stage.setScene(new Scene(clock, 300, 300));
        stage.setTitle("Clock Animation");
        stage.show();
    }
}
