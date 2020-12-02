package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
    private ObservableList<Person> bosses;

    public Model() {
        bosses = FXCollections.observableArrayList();
    }

    public ObservableList<Person> getBosses() {
        return bosses;
    }

}
