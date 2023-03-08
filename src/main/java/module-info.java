module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.game to javafx.fxml;
    exports io.github.game;
}