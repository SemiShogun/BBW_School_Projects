package ch.jamie.jl.todo;

import ch.jamie.jl.todo.model.Model;
import ch.jamie.jl.todo.model.ToDo;
import ch.jamie.jl.todo.view.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Model
        Model myModel = new Model();
        myModel.getNotes().add(new ToDo("10.01.2020", "Hoch", "Modul 420", "Jamie is awesome"));
        myModel.getNotes().add(new ToDo("17.01.2020", "Mittel", "Modul 69", "Jamie is cool"));
        myModel.getNotes().add(new ToDo("17.01.2020", "Tief", "Modul 420", "Jamie is mega awesome + cool"));

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("view/Todo.fxml"));
        VBox root = (VBox) myLoader.load();

        // Controller
        MainViewController controller = (MainViewController) myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("To-Do List");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
