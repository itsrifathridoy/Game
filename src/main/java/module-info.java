module com.example.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.github.cdimascio.dotenv.java;


    opens io.github.game to javafx.fxml;
    exports io.github.game;
}