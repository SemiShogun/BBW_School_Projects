package application;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private Model model;

    @FXML
    private ListView<Student> lvStudents;
    @FXML
    private TableView<Student> tvStudents;

    public void setModel(Model model) {
        this.model = model;

        lvStudents.setItems(model.getStudents());
        tvStudents.setItems(model.getStudents().get(0).getStudents());
    }

    // URL and ResourceBundle is necessary for an @Override implementation
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvStudents.setStyle("-fx-color-label-visible: azure;");

        TableColumn<Student, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setCellValueFactory(firstName -> firstName.getValue().firstNameProperty());
        firstNameColumn.setPrefWidth(75);
        firstNameColumn.setStyle("-fx-background-color: yellow;");

        TableColumn<Student, String> surNameColumn = new TableColumn<>("Sur Name");
        surNameColumn.setCellValueFactory(surName -> surName.getValue().surNameProperty());
        surNameColumn.setPrefWidth(75);
        surNameColumn.setStyle("-fx-background-color: yellow;");

        TableColumn<Student, String> ageColumn = new TableColumn<>("Age");
        ageColumn.setCellValueFactory(age -> age.getValue().ageProperty());
        ageColumn.setPrefWidth(75);
        ageColumn.setStyle("-fx-background-color: yellow;");

        TableColumn<Student, String> hobbyColumn = new TableColumn<>("Hobby");
        hobbyColumn.setCellValueFactory(hobby -> hobby.getValue().hobbyProperty());
        hobbyColumn.setPrefWidth(94);
        hobbyColumn.setStyle("-fx-background-color: yellow;");

        TableColumn<Student, String> animeColumn = new TableColumn<>("Anime");
        animeColumn.setCellValueFactory(anime -> anime.getValue().animeProperty());
        animeColumn.setPrefWidth(94);
        animeColumn.setStyle("-fx-background-color: yellow;");

        tvStudents.getColumns().addAll(firstNameColumn, surNameColumn,
                ageColumn, hobbyColumn, animeColumn);

        lvStudents.setCellFactory(column -> new ListCell<Student>() {
            @Override
            public void updateItem(Student item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item.getFirstName() + " " + item.getSurName());
                }
            }
        });

        lvStudents.getSelectionModel().selectedItemProperty()
                .addListener((ObservableValue<? extends Student> observable, Student oldValue, Student newValue) -> {
                    if (observable != null && observable.getValue() != null) {
                        tvStudents.setItems(observable.getValue().getStudents());
                    }
        });
    }

}
