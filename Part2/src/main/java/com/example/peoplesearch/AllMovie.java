package com.example.peoplesearch;
import Server.sMovie;

import Server.Server;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class AllMovie implements Serializable {
    @FXML
    TableView<Movie> table;
    @FXML
    TableColumn<Movie,String> namecol;
    @FXML
    TableColumn<Movie,Integer> relCol;
    @FXML
    TableColumn<Movie,String> G1Col;
    @FXML
    TableColumn<Movie,String> G2Col;
    @FXML
    TableColumn <Movie,String>G3Col;
    @FXML
    TableColumn<Movie,Integer> RunCol;
    @FXML
    TableColumn<Movie,String> ProductionCol;
    @FXML
    TableColumn<Movie,Integer> BudgetCol;
    @FXML
    TableColumn <Movie,Integer> RevenueCol;
    @FXML
    void initialize()
    {
        namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        relCol.setCellValueFactory(new PropertyValueFactory<>("ReleaseYear"));
        G1Col.setCellValueFactory(new PropertyValueFactory<>("Genre1"));
        G2Col.setCellValueFactory(new PropertyValueFactory<>("Genre2"));
        G3Col.setCellValueFactory(new PropertyValueFactory<>("Genre3"));
        RunCol.setCellValueFactory(new PropertyValueFactory<>("RunningTime"));
        ProductionCol.setCellValueFactory(new PropertyValueFactory<>("ProductionCompany"));
        BudgetCol.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        RevenueCol.setCellValueFactory(new PropertyValueFactory<>("Revenue"));
        table.setItems(FXCollections.observableArrayList(Client.ClientMovielist));

}

    public void onBackClick(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SearchFirstView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("People Application");
        /*SecondView second=fxmlLoader.getController();
        second.setProduction(FirstView.str);*/
        stage.setScene(scene);
        stage.show();
    }

    public void onRefreshClick(ActionEvent actionEvent)throws IOException {
        table.getItems().clear();
        ArrayList<sMovie> movie= Server.writting("a",FirstView.str,"b");
        Client.ClientMovielist.clear();
        for(sMovie m:movie){
            Client.ClientMovielist.add( new Movie(m));
        }
        for (Movie m: Client.ClientMovielist)
            table.getItems().add(m);
     }
}
