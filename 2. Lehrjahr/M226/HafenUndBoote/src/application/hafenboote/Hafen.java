package application.hafenboote;

import application.hafenboote.model.Boot;
import application.hafenboote.model.Bootsliste;
import application.hafenboote.model.Motorboot;
import application.hafenboote.model.Segelboot;
import application.hafenboote.view.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** Hafen.java
 *
 * @author Jamie Lam
 * @version 28.02.2020
 */
public class Hafen extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Model
        Bootsliste bootsliste = new Bootsliste();
        bootsliste.add(new Boot("Torro", 20));
        bootsliste.add(new Motorboot("Stier", 18, 87.5));
        bootsliste.add(new Segelboot("Moeve", 25, 80));

        bootsliste.printOutContents();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Hafen.class.getResource("view/MainView.fxml"));
        VBox root = loader.load();

        // Controller
        Controller controller = loader.getController();
        controller.setModel(bootsliste);

        System.out.println(bootsliste.getBoot());

        primaryStage.setTitle("Hafen Und Boote");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    // What is the "@Override" Annotation?
    // @Override  If, for some reason,
    // the compiler detects that the method does not exist in one of the superclasses,
    // it will generate an error.
    // This is extremely useful to quickly identify typos or API changes.

    // What does "super.toString()" do?
    // Uses the superclass toString() method

    public static void main(String[] args) {
        launch(args);
    }
}
