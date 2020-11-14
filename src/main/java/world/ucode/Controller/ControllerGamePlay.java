package world.ucode.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import world.ucode.Avatar.Avatar;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay extends Controller {
    Avatar avatar;

    @FXML
    private ImageView AvatarView;

    @FXML
    private Button PlayButton;

    @FXML
    private Button GiveWaterButton;

    @FXML
    private Button GiveMedicineButton;

    @FXML
    private Button CleanUpButton;

    @FXML
    private Button BackGamePlay;

    @FXML
    private Label Name;

    @FXML
    private Label HungerLabel;

    @FXML
    private ProgressBar ProgressBarHunger;

    @FXML
    private Label ThirstLabel;

    @FXML
    private ProgressBar ProgressBarThirst;

    @FXML
    private Label CleanlinessLabel;

    @FXML
    private ProgressBar ProgressBarCleanliness;

    @FXML
    private Label HealthLabel;

    @FXML
    private ProgressBar ProgressBarHealth;

    @FXML
    private Label HappinessLabel;

    @FXML
    private ProgressBar ProgressBarHappiness;

    @FXML
    void HandleBackGamePlay(ActionEvent event) {

    }

    @FXML
    void HandleCleanUp(ActionEvent event) {

    }

    @FXML
    void HandleGiveMedicine(ActionEvent event) {

    }

    @FXML
    void HandleGiveWater(ActionEvent event) {

    }

    @FXML
    void HandlePlay(ActionEvent event) {

    }


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
