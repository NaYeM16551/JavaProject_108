package com.example.peoplesearch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import java.io.IOException;

import static com.example.peoplesearch.Client.*;

public class AddMovie {
    @FXML
    TextField NameText;
    @FXML
    TextField RelYearText;
    @FXML
    TextField Genre1Text;
    @FXML
    TextField Genre2Text;
    @FXML
    TextField Genre3Text;
    @FXML
    TextField RunTimeText;
    @FXML
    TextField BudgetText;
    @FXML
    TextField RevenueText;
    @FXML
    Label AddLabel;


    public void onAddClick(ActionEvent actionEvent) throws IOException {

        try {
            String name = NameText.getText();
            String Genre1 = Genre1Text.getText();
            String Genre2 = Genre2Text.getText();
            String Genre3 = Genre3Text.getText();
            int RelYear = Integer.parseInt(RelYearText.getText());
            int RunTime = Integer.parseInt(RunTimeText.getText());
            int Budget = Integer.parseInt(BudgetText.getText());
            int Revenue = Integer.parseInt(RevenueText.getText());
            String output;
            if((Genre2==null ||Genre2.trim().isEmpty())&& (Genre3==null ||Genre3.trim().isEmpty()))
            {
                output=name+","+RelYear+","+Genre1+
                        ","+RunTime+","+FirstView.str+","+ Budget+","+Revenue;

            }
            else if(Genre2==null ||Genre2.trim().isEmpty())
            {

                output=name+","+RelYear+","+Genre1+","+Genre2+
                        ","+RunTime+","+FirstView.str+","+ Budget+","+Revenue;
            }
            else {

                output=name+","+RelYear+","+Genre1+","+Genre2+","+Genre3+
                        ","+RunTime+","+FirstView.str+","+ Budget+","+Revenue;

            }
           // Client.NewMovie=output;
            Movie m=new Movie(name,RelYear,Genre1,Genre2,Genre3,RunTime,FirstView.str,Budget,Revenue);
            ClientMovielist.add(m);
            client(output);
            AddLabel.setText("SUCCESSFULLY ADDED");
            JOptionPane.showMessageDialog(null,"Congratulations! Movie successfully added.");


        } catch (NumberFormatException e) {
            AddLabel.setText("Error!Enter only Numbers");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



            /*  if((Genre2==null ||Genre2.trim().isEmpty())&& (Genre3==null ||Genre3.trim().isEmpty()))
            {
                output=name+","+ReleaseYear+","+m.Genre1+
                        ","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;

            }
            else if(Genre2==null ||Genre2.trim().isEmpty()) //&& m.Genre2!=null)
            {
                output=m.name+","+m.ReleaseYear+","+m.Genre1+","+m.Genre2+
                        ","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;
            }
            else {
                output=m.name+","+m.ReleaseYear+","+m.Genre1+
                        ","+m.Genre2+","+m.Genre3+","+m.RunningTime+","+m.ProductionCompany+","+ m.Budget+","+m.Revenue;

            }*/


        public void onVerifyClick (ActionEvent actionEvent) {
            String name = NameText.getText();
            System.out.println(name+" "+ClientMovielist.size());
            int x=0;
            for(Movie m:ClientMovielist)
            {
                String str1=m.name;
                if(str1.equalsIgnoreCase(name))
                {
                    AddLabel.setText("Movie alreary exist");
                    x++;
                }

            }
            if(x==0)
                AddLabel.setText("Add available!");



        }

    public void onBackClick(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovieApplication.class.getResource("SecondView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Movie Application");
        SecondView second=fxmlLoader.getController();
        second.setProduction(FirstView.str);
        stage.setScene(scene);
        stage.show();
    }
}
