package com.example.peoplesearch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondView {
    @FXML
    Label ProductionLabel;
    public void setProduction(String name) {
        ProductionLabel.setText(name);
    }

    public void onLogoutClick(ActionEvent actionEvent) throws IOException {
        Client.ClientMovielist.clear();
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("FirstView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();
    }

    public void onSearchClick(ActionEvent actionEvent) throws IOException{
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SearchFirstView.fxml"));

       /* SearchFirstView s=fxmlLoader.getController();
        s.ProductionLabel.setText(FirstView.str);*/
       /*SearchFirstView s=fxmlLoader.getController();
        s.setProductionLabel(FirstView.str);*/



        Scene scene = new Scene(fxmlLoader.load(),600,400);
        stage.setTitle("Movie Application");
       /* SearchFirstView ss=fxmlLoader.getController();
        ss.setProductionLabel(FirstView.str);*/
        stage.setScene(scene);
        stage.show();

    }

    public void onAddMovieClick(ActionEvent actionEvent)throws IOException {
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("AddMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 819, 497);
        stage.setTitle("Movie Application");
        stage.setScene(scene);
        stage.show();

    }

    public void onTransferClick(ActionEvent actionEvent)throws IOException {
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("TransferMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 786, 444);
        stage.setTitle("Movie Application");
        TransferMovie tr = fxmlLoader.getController();
        tr.setProduction(FirstView.str);

        stage.setScene(scene);
        stage.show();

    }
}
