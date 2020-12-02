package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Main.java
 *
 * @author Jamie Lam
 * @version 29.11.2019
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Model
        Model myModel = new Model();

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("calculator.fxml"));
        VBox root = (VBox) myLoader.load();

        // Border doesn't work?
        root.setStyle("-fx-border: 1px");

        // Controller
        Controller controller = (Controller) myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("Umrechner");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
