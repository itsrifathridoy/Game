package io.github.game;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class resultController implements Initializable {
    public Label result;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        result.setText((gameController.name.equals("")?"You ":(gameController.name+ " ")) + (((gameController.isWin)?"Win!":"Loss!")));
//        if(gameController.name.equals(null))
//        {
//            result.setText("You "+((gameController.isWin)?"Win!":"Loss!"));
//        }
//        else
//        {
//            result.setText(gameController.name+ " ,"+((gameController.isWin)?"Win!":"Loss!"));
//        }
    }
}
