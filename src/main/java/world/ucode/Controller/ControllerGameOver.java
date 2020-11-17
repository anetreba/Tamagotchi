package world.ucode.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import world.ucode.GameMenu;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGameOver extends Controller {
    public ControllerGameOver(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    void HandleRestart(ActionEvent event) {
        GameMenu menu = new GameMenu(primaryStage);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        RestartButton.setOnMouseEntered(e -> RestartButton.setStyle(styleHover));
//        RestartButton.setOnMouseExited(e -> RestartButton.setStyle(style));
//        ExitButton.setOnMouseEntered(e -> ExitButton.setStyle(styleHover));
//        ExitButton.setOnMouseExited(e -> ExitButton.setStyle(style));
    }
}
