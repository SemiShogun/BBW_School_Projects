package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;

        //Model
        Model myModel = new Model();

        //View
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("Mainboard.fxml"));
        GridPane root = myLoader.load();

        //Controller
        Controller controller = myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("Escape Application");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void loadFxml(String fxml) throws IOException {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = (Parent) myLoader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
