package world.ucode.Controller;

import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import world.ucode.Avatar.Avatar;
import world.ucode.Avatar.AvatarAnimation;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerGamePlay extends Controller {
    Avatar avatar;

    @FXML
    private Button GiveWaterButton;

    @FXML
    private Button FeedButton;

    @FXML
    private Button PlayButton;

    @FXML
    private Button CleanUpButton;

    @FXML
    private Button GiveMedicineButton;

    @FXML
    private ImageView AvatarView;

    @FXML
    private ProgressBar ProgressBarHappiness;

    @FXML
    private ProgressBar ProgressBarCleanliness;

    @FXML
    private ProgressBar ProgressBarHunger;

    @FXML
    private ProgressBar ProgressBarThirst;

    @FXML
    private ProgressBar ProgressBarHealth;

    @FXML
    void HandleCleanUp(ActionEvent event) {

    }

    @FXML
    void HandleFeed(ActionEvent event) {

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



    AvatarAnimation animation;
    Timeline LiveCycle;
    @FXML
    ImageView AnimationView;

//    private void startLiveCycle() {
//        LiveCycle = new Timeline();
//        LiveCycle.setCycleCount(Timeline.INDEFINITE);
//
//        LiveCycle.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
//                    @Override
//                    public void handle(ActionEvent event) {
//                        if (minion.LiveCycle() == -1) {
//                            try {
//                                DataBase.DeleteDB(minion.GetName());
//                            } catch (SQLException throwables) {
//                                throwables.printStackTrace();
//                            }
//                            LiveCycle.stop();
//                            GameOver menu = new GameOver(primaryStage);
//                        }
//                        SetProgress();
//                    }
//                }));
//        LiveCycle.play();
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        primaryStage.getScene().getWindow().addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, this::HandleClose);
        this.animation = new AvatarAnimation(avatar.GetType(),AnimationView, AvatarView);
//        startLiveCycle();
    }

    public ControllerGamePlay(Stage primaryStage, Avatar avatar) {
        super(primaryStage);
        this.avatar = avatar;
    }

}
