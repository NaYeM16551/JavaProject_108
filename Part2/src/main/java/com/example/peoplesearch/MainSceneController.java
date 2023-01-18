package com.example.peoplesearch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {
  private Label text;
 @FXML
  private void onEnterClick(ActionEvent actionEvent)throws IOException{
    //text.setText("Welcome to this application");
   Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
    FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("FirstView.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 950, 650);
    stage.setTitle("People Application");
   stage.setScene(scene);
   stage.show();


  }
}
