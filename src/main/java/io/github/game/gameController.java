package io.github.game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class gameController {
    public TextField enter_name;
    public Button submit_button;
    public Button generate_num;
    public Label genaratePompt;
    public Text attempts;
    static String name = "";
    int numX;
    int clicked =0;
    static boolean isWin;
    public void sub_btn(ActionEvent actionEvent) {
        name = enter_name.getText();
    }

    public void gen_btn(ActionEvent actionEvent) {


        numX=(int)(Math.random()*3)+1;
        genaratePompt.setText("Your Number is Genarated. Please select poper circle.");

    }

    public void count_1(MouseEvent mouseEvent) throws IOException {
        clicked++;
        attempts.setText("Attempts Left: " + (2-clicked));
        if(numX==1)
        {

            isWin=true;

        }
        else
        {
            isWin=false;

        }
        if(clicked==2 || isWin)
        {


            Parent root =  FXMLLoader.load(getClass().getResource("result.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    public void count_2(MouseEvent mouseEvent) throws IOException {

        clicked++;
        attempts.setText("Attempts Left: " + (2-clicked));
        if(numX==2)
        {

            isWin=true;

        }
        else
        {
            isWin=false;

        }
        if(clicked==2 || isWin)
        {


            Parent root =  FXMLLoader.load(getClass().getResource("result.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }


    }

    public void count_3(MouseEvent mouseEvent) throws IOException {
        clicked++;
        attempts.setText("Attempts Left: " + (2-clicked));
        if(numX==3)
        {

            isWin=true;

        }
        else
        {
            isWin=false;

        }
        if(clicked==2 || isWin)
        {

            Parent root =  FXMLLoader.load(getClass().getResource("result.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }
}
