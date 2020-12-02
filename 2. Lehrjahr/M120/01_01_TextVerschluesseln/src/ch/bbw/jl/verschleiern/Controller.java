package ch.bbw.jl.verschleiern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

/**
 * Controller
 * @author Peter Rutschmann
 * @version 29.08.2019
 */
public class Controller {
	@FXML
	private TextField tfInput;

	@FXML
	private TextField tfOutput;
	
	public Controller() {
		super();
	}

	// Initialise the controller class
	@FXML
	private void initialize() {
		tfInput.setText("");
		tfOutput.setText("");
	}

	// Called when the user clicks on the button.
	@FXML
	private void calculate(ActionEvent f) {
		tfOutput.setText(Algorithm.reverseString(tfInput.getText()));
	}

	@FXML
	private void clear(ActionEvent f) {
		tfInput.setText("");
		tfOutput.setText("");
	}
}
