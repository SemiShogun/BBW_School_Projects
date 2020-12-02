package Heropicker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * View.java
 *
 * @author Jamie Lam
 * @version 29.11.2019
 */
public class View extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Model
        Model myModel = new Model();

        //View
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Heropicker.fxml"));
        HBox root = myLoader.load();

        //Controller
        Controller controller = (Controller) myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("Hero Picker");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
