package ch.bbw.pr.cluedo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * CluedoApplication
 * The class that executes EVERYTHING.
 *
 * @author Jamie Lam
 * @version 23.08.2019
 */
public class CluedoApplication extends Application{
	private Model model;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			//Creates the Model
			model = new Model();

			//Instantiates data objects
			model.setPersonen(new Person[] {
				new Person("Scarlett", "Miss", 25, "Blonde Hair"),
				new Person("Mustard", "Colonel", 55, "Moustache"),
				new Person("White", "Miss", 50, "Chef's Hat"),
				new Person("Plum", "Professor", 55, "Glasses"),
				new Person("Green", "Pastor", 60, "Bald"),
				new Person("Peacook", "Miss", 65, "Diadem")
			});

			model.setWaffen(new Waffe[] {
				new Waffe("Dolch", 250, 15, "Iron", "stabbed"),
				new Waffe("Candlestick", 500, 45, "Lead", "beaten to death"),
				new Waffe("Lead Pipe", 450, 35, "Lead", "beaten to death"),
				new Waffe("Rope", 400, 1500, "Fibre", "strangled"),
				new Waffe("Wrench", 800, 50, "Iron", "beaten to death"),
				new Waffe("Revolver", 450, 38, "Steel", "shot")
			});
			
			
			model.setRaeume(new Raum[] {
				new Raum("Hall", 5, 20, 50, 3, 3, "Slabs"),
				new Raum("Lounge", 8, 30, 40, 1, 5, "Carpet"),
				new Raum("Dining Room", 6, 20, 50, 4, 2, "Parket"),
				new Raum("Kitchen", 6, 25, 30, 4, 2, "Slabs"),
				new Raum("Ballroom", 10, 100, 200, 2, 2, "Parket"),
				new Raum("Conservatory", 9, 25, 30, 5, 1, "Slabs"),
				new Raum("Billiard Room", 5, 25, 30, 4, 2, "Slabs"),
				new Raum("Library", 8, 40, 60, 4, 2, "Carpet"),
				new Raum("Study Room", 6, 30, 50, 5, 1, "Carpet")
			});

			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("CluedoSecondView.fxml"));
			GridPane root = (GridPane) myLoader.load();
			
			Scene scene = new Scene(root);
			
			CluedoController controller = (CluedoController) myLoader.getController();
			controller.setModel(model);
			
			primaryStage.setTitle("Cluedo");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
