package ch.bbw.jl.craps.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.application.Platform;

/**
 * LoginController.java
 * 
 * @author Jamie Lam
 * @version 31.01.2020
 */
public class LoginController {

	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtPassword;
	@FXML
	private TextField txtNickname;
	
	public static String nickName;
				
	public void Login(ActionEvent event) throws IOException {
		// This "if" statement makes it so, that any type of login is possible. 
		// ONLY MEANT FOR DEMONSTRATION PURPOSES
		// I WILL NEVER REPLICATE THIS AGAIN IN THE FUTURE
		if (txtUserName.getText().equals(txtUserName.getText()) && txtPassword.getText().equals(txtPassword.getText())) {
			if (txtUserName.getText().equals("") || txtPassword.getText().equals("") || txtNickname.getText().equals("")) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Missing inputs");
				alert.setHeaderText("Please type down some inputs");

				alert.showAndWait();
			} else {
				((Node)(event.getSource())).getScene().getWindow().hide();
				System.out.println("Login Success");
				Stage primaryStage = new Stage();
				nickName = txtNickname.getText();
				Parent loader = FXMLLoader.load(getClass().getResource("../resources/Craps.fxml"));
							
				primaryStage.setTitle("Oh Crap!");
			    primaryStage.setScene(new Scene(loader));
			    primaryStage.show();	
			}
		} else {
			// If any type of login is possible, you're never going to get a "login failed".
			// Ich möchte einfach schlafen...
			System.out.println("Login Failed");
		}
	}

}
