package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
    private ObservableList<Student> students;

    public Model() {
        students = FXCollections.observableArrayList();
    }

    public ObservableList<Student> getStudents() {
        return students;
    }
}
