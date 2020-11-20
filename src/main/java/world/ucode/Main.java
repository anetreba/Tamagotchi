package world.ucode;

import javafx.application.Application;
import javafx.stage.Stage;
import world.ucode.DataBase.DataBase;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        try {
            DataBase.Conn();
            DataBase.CreateDB();
            primaryStage.setTitle("Tamagotchi");
            GameMenu menu = new GameMenu(primaryStage);
            primaryStage.setResizable(false);
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }

}
