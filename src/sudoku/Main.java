package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author Youmeng Hin
 * @version 1.0.0
 */
public class Main extends Application {
    private String version = "v1.0.0";

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Sets up window and implements interface from FXML.fxml
     *
     * @param stage starting stage
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));

        Image icon = new Image("sudoku/sudoku_icon.png");
        stage.getIcons().add(icon);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sudoku " + version + " by Youmeng Hin");
        stage.show();
    }
}
