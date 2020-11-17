package world.ucode;

import javafx.stage.Stage;
import world.ucode.Controller.ControllerGameMenu;
import world.ucode.Controller.ControllerGameOver;

public class GameOver extends GameScene {
    public GameOver(Stage primaryStage) {
        super(primaryStage, "/GameOver.fxml", new ControllerGameOver(primaryStage));
    }
}
