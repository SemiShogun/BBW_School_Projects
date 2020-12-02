package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** Main.java
 *
 * @author Jamie Lam
 * @version 05.12.2019 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Model
        Model myModel = new Model();

        //View
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("View.fxml"));
        VBox root = myLoader.load();

        //Controller
        Controller controller = (Controller) myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("Door Opener");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
