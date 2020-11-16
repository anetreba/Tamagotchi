package world.ucode;

import javafx.stage.Stage;
import world.ucode.Avatar.Avatar;
import world.ucode.Controller.ControllerGamePlay;

public class GamePlay extends GameScene {
    public GamePlay(Stage primaryStage, Avatar avatar) {
        super(primaryStage, "/GamePlay2.fxml", new ControllerGamePlay(primaryStage, avatar));
    }
}
