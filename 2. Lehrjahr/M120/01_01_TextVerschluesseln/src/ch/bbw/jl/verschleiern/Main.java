package ch.bbw.jl.verschleiern;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 * Application 
 * Text verschleiern
 * @author Peter Rutschmann
 * @version 29.08.2019
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//View
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("View.fxml"));
			VBox root = myLoader.load();
			
			Scene scene = new Scene(root,400,100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Verschleierungs App");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
