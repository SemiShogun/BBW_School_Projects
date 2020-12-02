package GradeCalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * Controller.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */
public class Controller {
    private Model myModel;

    @FXML
    private TextField modulTextfield; // Subject

    @FXML
    private TextField gradeTextfield; // Grade

    @FXML
    private ListView<String> modulesListView;

    public Controller() {
        super();
    }

    public void setModel(Model myModel) {
        this.myModel = myModel;
        //Binding
        modulesListView.setItems(myModel.modulesProperty());
    }

    @FXML
    private void addModulAndGrade(ActionEvent f) {
        myModel.add(modulTextfield.getText(), Double.parseDouble(gradeTextfield.getText()));
    }

    // Initialise the controller class
    @FXML
    private void initialize() {
        modulTextfield.setText("");
        gradeTextfield.setText("");
    }
}
