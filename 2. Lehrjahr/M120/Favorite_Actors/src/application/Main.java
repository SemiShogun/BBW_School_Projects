package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Model
        Model myModel = new Model();

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("View.fxml"));
        VBox root = myLoader.load();

        // Controller
        Controller controller = myLoader.getController();
        controller.setModel(myModel);

        controller.addImage();

        primaryStage.setTitle("Favorite Actors");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
