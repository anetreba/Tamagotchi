package world.ucode.Avatar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class AvatarAnimation {
    Type type;
    private final ImageView AnimationView;
    private final Timeline timeline;


    public AvatarAnimation(Type type, ImageView AnimationView, ImageView AvatarView) {
        this.AnimationView = AnimationView;
        this.type = type;
        this.timeline = new Timeline(new KeyFrame(Duration.seconds(4), actionEvent -> AnimationView.setVisible(false)));
        AnimationView.setVisible(false);
        AvatarView.setImage(new Image("/GamePlay/" + type.toString() + "/" + "happiness.gif"));
    }

    public void HandleAnimation(Action action) {
        AnimationView.setImage(GetImage(action));
        AnimationView.setVisible(true);
        timeline.play();
    }

    private Image GetImage(Action action) {
        return new Image("/GamePlay/" + type.toString() + "/" + action.toString() + ".gif", 800, 600, false, false);
    }
}
