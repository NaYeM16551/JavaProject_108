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

import static com.example.peoplesearch.Client.ClientMovielist;

public class TransferMovie {
    @FXML
    Label VerifyLabel;
    @FXML
    TextField NameText;
    @FXML
    TextField ProductionText;
    @FXML
    Label CompanyLabel;
    public void setProduction(String name) {
        CompanyLabel.setText(name);
    }
    public void onVerifyClick(ActionEvent actionEvent) throws IOException {
        String name = NameText.getText();
        int x=0;
        for(Movie m:ClientMovielist)
        {
            String str1=m.name;
            if(str1.equalsIgnoreCase(name))
            {
                x++;
            }

        }
        if(x==0)
            VerifyLabel.setText("Sorry!No movie of this name");
        else
            VerifyLabel.setText("Transfer available");

    }

    public void OnTransferClick(ActionEvent actionEvent) throws IOException {
        String name=NameText.getText();
        String CompanyName=ProductionText.getText();
        String s="tranfer";
        Server.writting(name, CompanyName,s);
        VerifyLabel.setText("Transfer Done!");
      /*  for(Movie m: ClientMovielist)
        {
            String str1=m.name;
            if(str1.equalsIgnoreCase(name))
            {
                ClientMovielist.remove(m);
            }
        }*/
        for(int i=0;i<ClientMovielist.size();++i)
        {
            String str1=ClientMovielist.get(i).getName();
            if(str1.equalsIgnoreCase(name))
            {
                ClientMovielist.remove(ClientMovielist.get(i));
            }
        }
    }

    public void onBackClick(ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SecondView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("People Application");
        SecondView second=fxmlLoader.getController();
        second.setProduction(FirstView.str);
        stage.setScene(scene);
        stage.show();
    }
}
