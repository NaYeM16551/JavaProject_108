package com.example.peoplesearch;

import Server.Server;
import Server.sMovie;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Profit {
    @FXML
    private Label profitLabel ;
    @FXML
    Label CompanyLabel;

    public void setProfitLabel(String profit) {
        profitLabel.setText(profit);
    }
    public void setProduction(String name) {
        CompanyLabel.setText(name);
    }

    public void onBackClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SearchFirstView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();
    }

    public void onRefreshClick(ActionEvent actionEvent) throws IOException{
        ArrayList<sMovie> movie= Server.writting("a",FirstView.str,"b");
        Client.ClientMovielist.clear();
        for(sMovie m:movie){
            Client.ClientMovielist.add( new Movie(m));
        }
        long Profit = 0L;
        for (Movie m : Client.ClientMovielist) {
            Profit += (m.Revenue - m.Budget);
        }
        profitLabel.setText(String.valueOf(Profit));
    }
}
