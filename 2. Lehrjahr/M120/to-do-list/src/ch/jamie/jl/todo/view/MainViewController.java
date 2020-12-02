package ch.jamie.jl.todo.view;

import ch.jamie.jl.todo.model.Model;
import ch.jamie.jl.todo.model.ToDo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.naming.Context;
import java.io.IOException;

public class MainViewController {

    private Model model;

    @FXML
    private TableView<ToDo> tvTodo;
    @FXML
    private TableColumn<ToDo, String> dateColumn;
    @FXML
    private TableColumn<ToDo, String> priorityColumn;
    @FXML
    private TableColumn<ToDo, String> keyWordColumn;
    @FXML
    private TableColumn<ToDo, String> memoColumn;
    @FXML
    private ContextMenu contextMenu;

    @FXML
    public void initialize() {
        // Display cell values
        dateColumn.setCellValueFactory(todo -> todo.getValue().dateProperty());
        priorityColumn.setCellValueFactory(todo -> todo.getValue().priorityProperty());
        keyWordColumn.setCellValueFactory(todo -> todo.getValue().keywordProperty());
        memoColumn.setCellValueFactory(todo -> todo.getValue().memoProperty());
    }

    public void setModel(Model model) {
        this.model = model;

        // Bindings
        tvTodo.setItems(this.model.getNotes());
    }

    @FXML
    private void handleNewToDo(ActionEvent event) {
        ToDo todo = showToDoDialog(null, "New");
        if (todo != null) {
            model.getNotes().add(todo);
        }
    }

    @FXML
    private ToDo showToDoDialog(ToDo todo, String title) {
        try {
            FXMLLoader myLoader = new FXMLLoader();
            myLoader.setLocation(MainViewController.class.getResource("ToDoEditDialog.fxml"));
            VBox page = (VBox) myLoader.load();

            ToDoEditDialogController controller = myLoader.getController();
            controller.setTodo(todo);

            Stage dialogStage = new Stage();
            dialogStage.setTitle(title);
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.showAndWait();
            return controller.getTodo();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @FXML
    private void handleEditTodo(ActionEvent event) {
        ToDo selectedTodo = tvTodo.getSelectionModel().getSelectedItem();
        if (selectedTodo != null) {
            ToDo todo = showToDoDialog(selectedTodo, "Edit");
            if (todo != null) {
                model.getNotes().remove(selectedTodo);
                model.getNotes().add(todo);
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("No Selection");
                alert.setHeaderText("No Todo Selected");
                alert.setContentText("Please select a todo in the table.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    private void handleDeleteTodo(ActionEvent event) {
        ToDo selectedTodo = tvTodo.getSelectionModel().getSelectedItem();
        if (selectedTodo != null) {
            model.getNotes().remove(selectedTodo);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Selection");
            alert.setHeaderText("No Todo Selected");
            alert.setContentText("Please select a todo in the table.");
            alert.showAndWait();
        }
    }

    @FXML
    private void handleShowAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("About the todo application...");
        alert.setContentText("Create, edit and delete your todos! \n Created from J. Lam");
        alert.showAndWait();
    }

}
