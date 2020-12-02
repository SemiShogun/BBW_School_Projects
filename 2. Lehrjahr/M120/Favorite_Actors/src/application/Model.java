package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private ObservableList<String> actors;

    public Model() {
        actors = FXCollections.observableArrayList();

        addActors("Keanu Reeves");
    }

    public ObservableList<String> getActors() {
        return actors;
    }

    public void addActors(String actor) {
        actors.add(actor);
    }

    public void removeActors(String actor) {
        actors.remove(actor);
    }

}
