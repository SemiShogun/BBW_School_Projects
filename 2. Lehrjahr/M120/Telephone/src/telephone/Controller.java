package telephone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class Controller implements Initializable {

    @FXML
    private TextArea taTelephone;

    @FXML
    private Label btDial;

    private String telephone = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taTelephone.setText(telephone);
    }

    private void addNumber(String number) {
        telephone = telephone + number;
        taTelephone.setText(telephone);
    }

    @FXML
    private void buttonOne(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    private void buttonTwo(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    private void buttonThree(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    private void buttonFour(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    private void buttonFive(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    private void buttonSix(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    private void buttonSeven(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    private void buttonEight(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    private void buttonNine(ActionEvent event) {
        addNumber("9");
    }

    @FXML
    private void buttonZero(ActionEvent event) {
        addNumber("0");
    }

    @FXML
    private void buttonStar(ActionEvent event) {
        addNumber("*");
    }

    @FXML
    private void buttonSharp(ActionEvent event) {
        addNumber("#");
    }

    @FXML
    private void buttonHook(ActionEvent event) {
        if (btDial.getText() != "Dial") {
            System.out.println("Dialing... " + taTelephone.getText());
            btDial.setText("Dial");
        } else {
            taTelephone.setText("");
            telephone = "";
            btDial.setText("Ready");
        }
    }

}
