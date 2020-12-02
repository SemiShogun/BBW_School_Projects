package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Controller.java
 *
 * @author Jamie Lam
 * @version 29.11.2019
 */
public class Controller {

    private Model myModel;

    @FXML
    TextField tfChf;
    @FXML
    TextField tfEuro;
    @FXML
    TextField tfPfund;
    @FXML
    TextField tfHKD;
    @FXML
    Button calc;
    @FXML
    Button reset;

    public void setModel(Model myModel) {
        this.myModel = myModel;
    }

    @FXML
    private void calculate() {
        try {
            double temp = Double.parseDouble(tfChf.getText());
            myModel.setChf(temp);
            double euro = myModel.getChf() * 0.92;
            double pfund = myModel.getChf() * 0.832;
            double HKD = myModel.getChf() * 8.0;
            myModel.setEuro(euro);
            myModel.setPfund(pfund);
            myModel.setHKD(HKD);
            tfEuro.setText(String.valueOf(euro));
            tfPfund.setText(String.valueOf(pfund));
            tfHKD.setText(String.valueOf(HKD));
        } catch (Exception error) {
            System.out.println(error);
        };
    }

    @FXML
    private void reset() {
        try {
            tfChf.setText("");
            tfEuro.setText("");
            tfPfund.setText("");
            tfHKD.setText("");
            myModel.setChf(0.0);
            myModel.setEuro(0.0);
            myModel.setPfund(0.0);
            myModel.setHKD(0.0);
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}
