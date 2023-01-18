package com.example.peoplesearch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("FirstView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {


        launch();
    }
}