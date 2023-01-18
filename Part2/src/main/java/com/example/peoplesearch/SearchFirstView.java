package com.example.peoplesearch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchFirstView {
    @FXML
    Label ProductionLabel;
/*    public void setProductionLabel(String companyName) {
        ProductionLabel.setText(companyName);
    }*/
    public void onBackClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SecondView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Movie Application");
        SecondView second=fxmlLoader.getController();
        second.setProduction(FirstView.str);
        stage.setScene(scene);
        stage.show();
    }

    public void onRecentClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("RecentMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 749, 513);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();
    }

    public void OnMaximumClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("MaximumRevenue.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 749, 513);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();

    }

    public void onProfitClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        long Profit = 0L;
        for (Movie m : Client.ClientMovielist) {
            Profit += (m.Revenue - m.Budget);
        }
            FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("profit.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 342);
            stage.setTitle("Movie Application");

            Profit profit = fxmlLoader.getController();
            profit.setProfitLabel(String.valueOf(Profit));
            profit.setProduction(FirstView.str);

            stage.setScene(scene);
            stage.show();

    }

    public void onAllMovieClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("AllMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 749, 513);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();
    }
}
