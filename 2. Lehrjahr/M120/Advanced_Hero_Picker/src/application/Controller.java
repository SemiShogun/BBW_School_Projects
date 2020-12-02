package application;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    // model
    private Model myModel = new Model();

    @FXML
    private ListView<Person> lvBosses;
    @FXML
    private TableView<Person> tvEmployees;

    public void setModel(Model myModel) {
        this.myModel = myModel;

        lvBosses.setItems(myModel.getBosses());
        tvEmployees.setItems(myModel.getBosses().get(0).getEmployees());
    }

    @Override
    public void initialize(URL Arg0, ResourceBundle arg1) {
        TableColumn<Person, String> aliasNameColumn = new TableColumn<>("Alias Name");
        aliasNameColumn.setPrefWidth(125);
        aliasNameColumn.setEditable(true);
        aliasNameColumn.setCellValueFactory(person -> person.getValue().aliasNameProperty());
        tvEmployees.getColumns().add(aliasNameColumn);

        TableColumn<Person, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setPrefWidth(125);
        firstNameColumn.setEditable(true);
        firstNameColumn.setCellValueFactory(person -> person.getValue().firstNameProperty());
        tvEmployees.getColumns().add(firstNameColumn);

        TableColumn<Person, String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setPrefWidth(125);
        lastNameColumn.setEditable(true);
        lastNameColumn.setCellValueFactory(person -> person.getValue().lastNameProperty());
        tvEmployees.getColumns().add(lastNameColumn);

        lvBosses.setCellFactory(column -> new ListCell<Person>() {
            @Override
            public void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item.getFirstName() + " " + item.getLastName());
                }
            }
        });

        // Listeners respond to values that have been changed, in this case, the values in "lvBosses"
        lvBosses.getSelectionModel().selectedItemProperty()
                .addListener((ObservableValue<? extends Person> observable, Person oldValue, Person newValue) -> {
                    if (observable != null && observable.getValue() != null) {
                        tvEmployees.setItems(observable.getValue().getEmployees());
                    }
                });
    }

    /**
    public void addEmployee() {
        if (tfAliasName.getText().isEmpty() || tfFirstName.getText().isEmpty() || tfLastName.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Empty Values Detected");
            alert.setHeaderText(null);
            alert.setContentText("You have missing values!");

            alert.showAndWait();
        } else {
                aliasNameColumn.getText();
                firstNameColumn.getText();
                lastNameColumn.getText();
        }
    }
    */

}
