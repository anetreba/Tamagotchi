package world.ucode.Controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import world.ucode.Avatar.Action;
import world.ucode.Avatar.Avatar;
import world.ucode.Avatar.AvatarAnimation;
import world.ucode.DataBase.DataBase;
import world.ucode.GameOver;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.SQLException;
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

    private void SetProgress() {
        ProgressBarHealth.setProgress(avatar.GetHealth()/avatar.GetMaxHealth());
        ProgressBarHappiness.setProgress(avatar.GetHappiness()/10);
        ProgressBarHunger.setProgress(avatar.GetHunger()/10);
        ProgressBarThirst.setProgress(avatar.GetThirst()/10);
        ProgressBarCleanliness.setProgress(avatar.GetCleanliness()/10);
    }

    @FXML
    void HandleCleanUp(ActionEvent event) throws InvocationTargetException, IllegalAccessException {
        avatar.ActionHandler(Action.CLEAN_UP, avatar);
        animation.HandleAnimation(Action.CLEAN_UP);
    }

    @FXML
    void HandleFeed(ActionEvent event) throws InvocationTargetException, IllegalAccessException {
        avatar.ActionHandler(Action.FEED, avatar);
        animation.HandleAnimation(Action.FEED);
    }

    @FXML
    void HandleGiveMedicine(ActionEvent event) throws InvocationTargetException, IllegalAccessException {
        avatar.ActionHandler(Action.GIVE_MEDICINE, avatar);
        animation.HandleAnimation(Action.GIVE_MEDICINE);
    }


    @FXML
    void HandleGiveWater(ActionEvent event) throws InvocationTargetException, IllegalAccessException {
            avatar.ActionHandler(Action.GIVE_WATER, avatar);
            animation.HandleAnimation(Action.GIVE_WATER);
    }

    @FXML
    void HandlePlay(ActionEvent event) throws InvocationTargetException, IllegalAccessException {
//        avatar.ActionHandler(Action.PLAY, avatar);
//        animation.HandleAnimation(Action.PLAY);
    }



    AvatarAnimation animation;
    Timeline LiveCycle;
    @FXML
    ImageView AnimationView;

    private void startLiveCycle() {
        LiveCycle = new Timeline();
        LiveCycle.setCycleCount(Timeline.INDEFINITE);

        LiveCycle.getKeyFrames().add(
                new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (avatar.LiveCycle() == -1) {
                            try {
                                DataBase.DeleteDB(avatar.GetName());
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                            LiveCycle.stop();
                            GameOver menu = new GameOver(primaryStage);
                        }
                        SetProgress();
                    }
                }));
        LiveCycle.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        primaryStage.getScene().getWindow().addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, this::HandleClose);
        this.animation = new AvatarAnimation(avatar.GetType(),AnimationView, AvatarView);
        startLiveCycle();
    }

    public ControllerGamePlay(Stage primaryStage, Avatar avatar) {
        super(primaryStage);
        this.avatar = avatar;
    }

}
