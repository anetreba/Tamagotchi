package world.ucode;

import javafx.stage.Stage;
import world.ucode.Controller.ControllerGameMenu;

public class GameMenu extends GameScene {
    public GameMenu(Stage primaryStage) {
        super(primaryStage, "/GameMenu.fxml", new ControllerGameMenu(primaryStage));
    }
}

