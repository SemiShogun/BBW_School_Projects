package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class View extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Model
        Model myModel = new Model();

        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("bossesAndEmployees.fxml"));
        HBox root = myLoader.load();

        // Inserting Data
        Person xMen = new Person("Professor X", "Charles", "Xavier");
        xMen.getEmployees().add(new Person("Wolverine", "James", "Howlett"));
        xMen.getEmployees().add(new Person("Cyclops", "Scott", "Summers"));
        xMen.getEmployees().add(new Person("Storm", "Ororo", "Munroe"));
        myModel.getBosses().add(xMen);

        Person justiceLeague = new Person("Superman", "Clark", "Kent");
        justiceLeague.getEmployees().add(new Person("Batman", "Bruce", "Wayne"));
        myModel.getBosses().add(justiceLeague);

        Person avengers = new Person("Iron Man", "Tony", "Stark");
        avengers.getEmployees().add(new Person("Captain America", "Steve", "Rogers"));
        myModel.getBosses().add(avengers);

        // Controller
        Controller controller = myLoader.getController();
        controller.setModel(myModel);

        primaryStage.setTitle("Advanced Hero Picker");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
