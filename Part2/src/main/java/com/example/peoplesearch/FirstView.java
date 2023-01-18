package com.example.peoplesearch;

import Server.Server;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstView {
    @FXML
    TextField CompanyName;
    @FXML
    Label LoginLabel;
   public  static String str;

    public void onLoginClick(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        String company=CompanyName.getText();
        str=company;
        int x= Server.LoginCheck(company);
        if(x==0)
        {
            LoginLabel.setText("Failed! Production Company doesn't exist.");
        }


        else
        {
            Client.client(company);
            LoginLabel.setText("LogIn Successful");
            FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SecondView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Movie Application");
            SecondView second=fxmlLoader.getController();
            second.setProduction(company);
            stage.setScene(scene);
            stage.show();
        }




    }
}
