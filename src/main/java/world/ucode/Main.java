package world.ucode;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Tamagotchi");
            GameMenu menu = new GameMenu(primaryStage);
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }

}
