package world.ucode.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerNewGame extends Controller {
    public ControllerNewGame(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    TextField InputName;

    @FXML
    void chooseGirl() {
        String name = InputName.getText();
        if (name.length() != 0) {
            System.out.println("GIRL " + name);
        }
    }

    @FXML
    void chooseBoy() {
        String name = InputName.getText();
        if (name.length() != 0) {
            System.out.println("BOY " + name);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
////        NewGameButton.setOnMouseEntered(e -> NewGameButton.setStyle(styleHover));
////        NewGameButton.setOnMouseExited(e -> NewGameButton.setStyle(style));
////        LoadGameButton.setOnMouseEntered(e -> LoadGameButton.setStyle(styleHover));
////        LoadGameButton.setOnMouseExited(e -> LoadGameButton.setStyle(style));
    }
}
