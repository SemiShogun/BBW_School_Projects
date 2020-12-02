package ch.bbw.pr.cluedo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * CluedoController.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class CluedoController {
	private Model model;
	
	private Spiellogik logik;

	@FXML
    TextArea taEverything;

	@FXML
	ToggleGroup tgTaeter;
	@FXML
	ToggleGroup tgTatwaffe;
	@FXML
	ToggleGroup tgTatort;

	@FXML
	Button btRaten;
	@FXML
	Label taErgebnis;
	@FXML
	Button btClear;
	@FXML
	Button btNewGame;
	
	public void setModel(Model model) {
		this.model = model;
		
		logik = new Spiellogik();
		logik.initialisieren(model.getPersonen(), model.getWaffen(), model.getRaeume());

		// Filling the TextArea
		taEverything.setText(model.toStringEverything());

		// Reacting to the click on the "raten" button
		btRaten.setOnAction(e -> {
			String ergebnis = "";

			try {
				RadioButton selectedPerson = (RadioButton) tgTaeter.getSelectedToggle();
				int taeter = Integer.parseInt(selectedPerson.getText());
				RadioButton selectedWeapon = (RadioButton) tgTatwaffe.getSelectedToggle();
				int tatwaffe = Integer.parseInt(selectedWeapon.getText());
				RadioButton selectedRoom = (RadioButton) tgTatort.getSelectedToggle();
				int tatort = Integer.parseInt(selectedRoom.getText());

				int richtig = logik.spielen(taeter, tatwaffe, tatort);
				if (richtig < 3) {
					ergebnis = "You have " + richtig + " Correct Answers.";
				} else {
					ergebnis = "You have guessed everything correctly, you've won.";
				}
			} catch (NullPointerException f) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("You forgot to pick a value.");
                alert.setHeaderText(gordonMotivation.motivation());
                Image image = new Image("ch/bbw/pr/cluedo/Gordon_Ramram.jpg");

                ImageView imageView = new ImageView(image);
                alert.setGraphic(imageView);
                alert.showAndWait();
                System.out.println(model.toStringEverything());
			}

			// Prints out the result.
			taErgebnis.setText(taErgebnis.getText() + "\n" + ergebnis);
		});

		btNewGame.setOnAction(e -> {
			logik.initialisieren(model.getPersonen(), model.getWaffen(), model.getRaeume());
		});

		btClear.setOnAction(e -> {
			taErgebnis.setText("");
		});
	}
	
}
