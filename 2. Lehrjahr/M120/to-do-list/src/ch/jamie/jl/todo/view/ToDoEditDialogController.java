package ch.jamie.jl.todo.view;

import ch.jamie.jl.todo.model.ToDo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToDoEditDialogController {

    private ToDo todo;

    @FXML
    private DatePicker dateField;
    @FXML
    private ComboBox<String> dnPriority;
    @FXML
    private TextArea taMemo;
    @FXML
    private TextField tfKeyWord;

    @FXML
    private void initialize() {
        ObservableList<String> priorities = FXCollections.observableArrayList("Hoch", "Mittel", "Tief");
        // Sets the priorities for the combobox
        dnPriority.setItems(priorities);
        // Selects the first item in the list
        dnPriority.getSelectionModel().select(1);
    }

    public ToDo getTodo() {
        return todo;
    }

    public void setTodo(ToDo todo) {
        this.todo = todo;
        if (todo != null) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
            dateField.setValue(LocalDate.parse(todo.dateProperty().getValue(), dateFormatter));
            dnPriority.getSelectionModel().select(todo.priorityProperty().getValue());
            taMemo.setText(todo.memoProperty().getValue());
            tfKeyWord.setText(todo.keywordProperty().getValue());
        }
    }

    /**
     * Accepts the given values and inserts it into Model
     *
     * @param event
     */
    @FXML
    public void handleOK(ActionEvent event) {
        if (dateField.getValue() == null) {
            alertMessage("DateField");
        } else if (taMemo.getText() == "") {
            alertMessage("Memo");
        } else if (tfKeyWord.getText() == "") {
            alertMessage("Keyword");
        } else {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
            todo = new ToDo(
                    dateField.getValue().format(dateFormatter),
                    dnPriority.getSelectionModel().getSelectedItem(),
                    tfKeyWord.getText(),
                    taMemo.getText()
            );
            Node sourceGUI = (Node) event.getSource();
            Stage stage = (Stage) sourceGUI.getScene().getWindow();
            stage.close();
        }
    }

    /**
     * Closes the dialog tab
     *
     * @param event
     */
    @FXML
    public void handleCancel(ActionEvent event) {
        Node sourceGUI = (Node) event.getSource();
        Stage stage = (Stage) sourceGUI.getScene().getWindow();
        stage.close();
    }

    private void alertMessage(String type) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(type);
        alert.setHeaderText(type + " missing");
        alert.setContentText("Please give a value for " + type);
        alert.showAndWait();
    }



}
