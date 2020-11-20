package world.ucode.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import world.ucode.Avatar.Avatar;
import world.ucode.DataBase.DataBase;
import world.ucode.GameMenu;
import world.ucode.GamePlay;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerLoadGame extends Controller {
    public ControllerLoadGame(Stage primaryStage) {
        super(primaryStage);
    }

    @FXML
    private ChoiceBox<String> LoadAvatars;

    @FXML
    void HandleBack(MouseEvent event) {
        GameMenu menu = new GameMenu(primaryStage);
    }

    @FXML
    void HandleSelect(MouseEvent event) {
        String selectedChoice = LoadAvatars.getSelectionModel().getSelectedItem();
        ResultSet resSet;
        try {
            resSet = DataBase.ReadDBAvatar(selectedChoice);
            GamePlay game = new GamePlay(primaryStage, new Avatar(resSet));
        }
        catch (ClassNotFoundException | SQLException e) {
            System.err.println("SQLException Load Game");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ResultSet resSet;
        try {
            resSet = DataBase.ReadDBNames();
            List<String> names = new ArrayList<String>();
            while (resSet.next())
                names.add(resSet.getString("name"));
            ObservableList<String> availableChoices = FXCollections.observableArrayList(names);
            LoadAvatars.setItems(availableChoices);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
