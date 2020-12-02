package application.hafenboote.view;

import application.hafenboote.Hafen;
import application.hafenboote.model.Boot;
import application.hafenboote.model.Bootsliste;
import application.hafenboote.view.addboot.MotorbootDialogController;
import application.hafenboote.view.addboot.SegelbootDialogController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/** Controller.java
 *
 * @author Jamie Lam
 * @version 28.02.2020
 */
public class Controller {

    private Bootsliste model;

    @FXML
    private ListView<Boot> listView;

    public Controller() {
    }

    public void initialize() {
    }

    public void setModel(Bootsliste model) {
        this.model = model;
        listView.setItems(model.getBoot());
    }

    @FXML
    public void handleNewSegelboot(ActionEvent event) throws IOException {
        Boot boot = showSegelbootDialog();
        if (boot != null) {
            model.add(boot);
        }
    }

    @FXML
    public void handleNewMotorboot(ActionEvent event) throws IOException {
        Boot boot = showMotorbootDialog();
        if (boot != null) {
            model.add(boot);
        }
    }

    @FXML
    public void deleteEntry(ActionEvent event) throws IOException {
        Boot selectedBoot = listView.getSelectionModel().getSelectedItem();
        if (selectedBoot != null) {
            model.removeBoot(selectedBoot);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Boot picked");
            alert.setHeaderText(null);
            alert.setContentText("You haven't picked any Boot from the list yet.");

            alert.showAndWait();
        }
    }

    private Boot showSegelbootDialog() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Hafen.class.getResource("view/addboot/SegelbootDialog.fxml"));
            Stage primaryStage = new Stage();
            VBox root = (VBox) loader.load();

            SegelbootDialogController segelbootDialogController =  loader.getController();

            primaryStage.setTitle("Oh Crap!");
            primaryStage.setScene(new Scene(root));
            primaryStage.showAndWait();

            return segelbootDialogController.getBoot();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Boot showMotorbootDialog() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Hafen.class.getResource("view/addboot/MotorbootDialog.fxml"));
            Stage primaryStage = new Stage();
            VBox root = (VBox) loader.load();

            MotorbootDialogController motorbootDialogController =  loader.getController();

            primaryStage.setTitle("Motorboot erstellen");
            primaryStage.setScene(new Scene(root));
            primaryStage.showAndWait();

            return motorbootDialogController.getBoot();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
