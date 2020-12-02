package application.hafenboote.view.addboot;

import application.hafenboote.model.Segelboot;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SegelbootDialogController implements Initializable {
    private Segelboot boot;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfLaenge;
    @FXML
    private TextField tfSegelflaeche;
    @FXML
    private Button btnOk;
    @FXML
    private Button btnCancel;

    public Segelboot getBoot() {
        System.out.println(boot.toString());
        return boot;
    }

    @Override
    public void initialize(URL Arg, ResourceBundle bundle) {

         btnOk.setOnAction(ActionEvent -> {
             try {
                 if (!isInputValid(tfName.getText()) && !isInputValid(tfLaenge.getText()) && !isInputValid(tfSegelflaeche.getText())) {
                     boot = new Segelboot(tfName.getText(), Integer.parseInt(tfLaenge.getText()), Integer.parseInt(tfSegelflaeche.getText()));
                     closeWindow();
                     System.out.println("Ok Button pressed. Data has been saved.");
                 } else {
                     Alert alert = new Alert(Alert.AlertType.INFORMATION);
                     alert.setTitle("Forgotten Input");
                     alert.setHeaderText(null);
                     alert.setContentText("You forgot to write an input.");

                     alert.showAndWait();
                 }
             } catch (Exception e) {
                 e.printStackTrace();
             }
         });

         btnCancel.setOnAction(ActionEvent -> {
             try {
                 closeWindow();
                 System.out.println("Cancel Button pressed. Cancelled Object creation.");
             } catch (Exception e) {
                 e.printStackTrace();
             }
         });
    }

    /**
     * Closes the currently opened Dialog Window..
     */
    private void closeWindow() {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    /**
     * Checks if all the textfields are either empty... or not?
     * @param errorMessage
     * @return boolean (If its empty, it returns true, else it returns false)
     */
    public boolean isInputValid(String errorMessage) {
        return errorMessage.isEmpty();
    }


}
