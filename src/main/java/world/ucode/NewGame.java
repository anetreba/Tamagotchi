package world.ucode;

import javafx.stage.Stage;
import world.ucode.Controller.ControllerNewGame;

public class NewGame extends GameScene {
    public NewGame(Stage primaryStage) {
        super(primaryStage, "/NewGame2.fxml", new ControllerNewGame(primaryStage));
    }

}
