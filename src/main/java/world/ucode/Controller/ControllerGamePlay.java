package world.ucode.Controller;

import javafx.stage.Stage;
import world.ucode.Avatar.Avatar;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay extends Controller {
    Avatar avatar;

    public ControllerGamePlay(Stage primaryStage, Avatar avatar) {
        super(primaryStage);
        this.avatar = avatar;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
////        NewGameButton.setOnMouseEntered(e -> NewGameButton.setStyle(styleHover));
////        NewGameButton.setOnMouseExited(e -> NewGameButton.setStyle(style));
////        LoadGameButton.setOnMouseEntered(e -> LoadGameButton.setStyle(styleHover));
////        LoadGameButton.setOnMouseExited(e -> LoadGameButton.setStyle(style));
    }
}
