package application;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;


/** Controller.java
 *
 * @author Jamie Lam
 * @version 20.12.2019
 */
public class Controller {
    Model myModel = new Model();

    @FXML
    private ListView<String> lvHistory;
    @FXML
    private TextField teamNameA;
    @FXML
    private TextField teamNameB;
    @FXML
    private TextField totalA;
    @FXML
    private TextField totalB;
    @FXML
    private TextField percentA;
    @FXML
    private TextField percentB;
    @FXML
    private ProgressIndicator progressA;
    @FXML
    private ProgressIndicator progressB;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteProgressButton;
    @FXML
    private Button deleteEverythingButton;

    public void setModel(Model myModel) {
        this.myModel = myModel;

        // Bindings
        teamNameA.textProperty().bindBidirectional(myModel.teamAProperty());
        teamNameB.textProperty().bindBidirectional(myModel.teamBProperty());

        totalA.textProperty().bindBidirectional(myModel.totalAProperty());
        totalB.textProperty().bindBidirectional(myModel.totalAProperty());

        progressA.progressProperty().bind(myModel.percentAProperty());
        progressB.progressProperty().bind(myModel.percentBProperty());
    }

    public void add() {
            /**
            myModel.setPercentA(myModel.getTotalA());
            myModel.setPercentB(myModel.getTotalB());
            */
            int punkteA = Integer.parseInt(totalA.getText());
            int punkteB = Integer.parseInt(totalB.getText());

            String result = teamNameA.getText() + ": " + totalA.getText() + ", " + teamNameB.getText() + ": " +
                    totalB.getText();
            myModel.getOlHistory().add(result);

            myModel.teamAProperty().setValue(myModel.teamAProperty().getValue() + punkteA);
            myModel.teamBProperty().setValue(myModel.teamBProperty().getValue() + punkteB);

            double prozentA = myModel.getPercentA() / 2500.0;
            double prozentB = myModel.getPercentB() / 2500.0;
            myModel.percentAProperty().setValue(prozentA);
            myModel.percentBProperty().setValue(prozentB);

            if (myModel.getTotalA() >= 2500.0) {
                String win = "Team A wins!";
                myModel.getOlHistory().add(win);
                addButton.setDisable(true);
            } else if (myModel.getTotalB() <= 2500.0) {
                String win = "Team B wins!";
                myModel.getOlHistory().add(win);
                addButton.setDisable(true);
            }

    }

    public void deleteProgress() {
            myModel.deleteProgress();
    }

    public void deleteEverything() {
            myModel.deleteEverything();
    }

}
