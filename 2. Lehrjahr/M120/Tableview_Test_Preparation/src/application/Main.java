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
        Model model = new Model();

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("view.fxml"));
        VBox root = myLoader.load();

        // Inserting Data
        Student myself = new Student("Jamie", "Lam", "18", "Video Games", "Gurren Lagann");
        myself.getStudents().add(new Student("Jamie", "Lam", "18", "Video Games", "Gurren Lagann"));
        model.getStudents().add(myself);

        Student yannick = new Student("Yannick", "Ruck", "18", "Video Games", "JoJo");
        yannick.getStudents().add(new Student("Yannick", "Ruck", "18", "Video Games", "JoJo"));
        model.getStudents().add(yannick);

        // Controller
        Controller controller = myLoader.getController();
        controller.setModel(model);

        primaryStage.setTitle("Students");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
