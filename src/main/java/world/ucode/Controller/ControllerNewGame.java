package world.ucode.Controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerNewGame extends Controller {
    public ControllerNewGame(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    void chooseGirl() {
        System.out.println("GIRL");
    }

    @FXML
    void chooseBoy() {
        System.out.println("BOY");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
////        NewGameButton.setOnMouseEntered(e -> NewGameButton.setStyle(styleHover));
////        NewGameButton.setOnMouseExited(e -> NewGameButton.setStyle(style));
////        LoadGameButton.setOnMouseEntered(e -> LoadGameButton.setStyle(styleHover));
////        LoadGameButton.setOnMouseExited(e -> LoadGameButton.setStyle(style));
    }
}
