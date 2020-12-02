package GradeCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            //Model
            Model myModel = new Model();

            //View
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("GradeCalculator.fxml"));
            VBox root = myLoader.load();

            //Controller
            Controller controller = (Controller) myLoader.getController();
            controller.setModel(myModel);
            primaryStage.setTitle("Module und Noten");
            primaryStage.setScene(new Scene(root, 495, 380));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
