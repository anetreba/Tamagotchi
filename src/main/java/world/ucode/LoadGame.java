package world.ucode;

import javafx.stage.Stage;
import world.ucode.Controller.ControllerLoadGame;

public class LoadGame extends GameScene {
    public LoadGame(Stage primaryStage) {
        super(primaryStage, "/LoadGame.fxml", new ControllerLoadGame(primaryStage));
    }
}
