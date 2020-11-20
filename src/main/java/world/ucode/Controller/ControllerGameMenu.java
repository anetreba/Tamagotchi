package world.ucode.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import world.ucode.LoadGame;
import world.ucode.NewGame;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGameMenu extends Controller {
    public ControllerGameMenu(Stage primaryStage) {
        super(primaryStage);
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    void HandleNewGame() {
        System.out.println("NEW GAME BUTTON CLICKED");
        NewGame newGame = new NewGame(primaryStage);
    }

    @FXML
     void HandleLoadGame() {
        System.out.println("LOAD GAME BUTTON CLICKED");
        LoadGame loadGame = new LoadGame(primaryStage);
    }
    @FXML
     void exit() {

    }
}

//
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class ControllerGameMenu extends Controller {
//    public ControllerGameMenu(Stage primaryStage) {
//        super(primaryStage);
//    }
//
//    @FXML
//    Button NewGameButton;
//    @FXML
//    Button LoadGameButton;
//    @FXML
//    Button ExitButton;
//
////    @FXML
////    private void HandleNewGame() {
////        NewGame scene = new NewGame(primaryStage);
////    }
////
////    @FXML
////    private void HandleLoadGame() {
////        LoadGame scene = new LoadGame(primaryStage);
////    }
////
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
////        NewGameButton.setOnMouseEntered(e -> NewGameButton.setStyle(styleHover));
////        NewGameButton.setOnMouseExited(e -> NewGameButton.setStyle(style));
////        LoadGameButton.setOnMouseEntered(e -> LoadGameButton.setStyle(styleHover));
////        LoadGameButton.setOnMouseExited(e -> LoadGameButton.setStyle(style));
//    }
//
//}
