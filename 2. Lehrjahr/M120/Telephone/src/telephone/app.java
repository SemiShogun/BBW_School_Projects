package telephone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * app.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */

public class app extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            // View
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("telephone.fxml"));

            // Controller
            myLoader.setController(new Controller());
            Parent root = myLoader.load();
            Scene scene = new Scene(root);

            primaryStage.getIcons().add(new Image("telephone/telephone.png"));
            primaryStage.setTitle("Telephone GUI");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
