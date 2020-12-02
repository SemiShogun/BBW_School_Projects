package ch.jamie.jl.todo.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private ObservableList<ToDo> notes;

    public Model() {
        super();
        notes = FXCollections.<ToDo>observableArrayList();
    }

    public ObservableList<ToDo> getNotes() {
        return notes;
    }

}
