package application;
	
import application.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/** Main.java
 *
 * @author Jamie Lam
 * @version 20.12.2019
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Model
			Model myModel = new Model();

			// View
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("MainView.fxml"));
			VBox root = myLoader.load();

			//Controller
			Controller controller = (Controller) myLoader.getController();
			controller.setModel(myModel);
			
			root.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Preis Jassen");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
