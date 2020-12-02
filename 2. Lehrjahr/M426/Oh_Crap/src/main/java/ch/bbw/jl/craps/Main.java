package ch.bbw.jl.craps;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Oh Crap! - The Game
 * @author Jamie Lam
 * @version 24.01.2020
 */
public class Main extends Application {

   @Override
   public void start(Stage primaryStage) throws Exception {

      FXMLLoader myLoader = new FXMLLoader(getClass().getResource("login/login.fxml"));
      VBox root = (VBox) myLoader.load();
            
      primaryStage.setTitle("Oh Crap!");
      primaryStage.setScene(new Scene(root));
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}