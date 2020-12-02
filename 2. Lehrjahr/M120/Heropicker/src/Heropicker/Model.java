package Heropicker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Model.java
 *
 * @author Jamie Lam
 * @version 29.11.2019
 */
public class Model {

    private ObservableList<String> candidates;
    private ObservableList<String> heroes;

    public Model() {
        candidates = FXCollections.observableArrayList();
        heroes = FXCollections.observableArrayList();

        addCandidate("Bumblebee");
        addCandidate("Spiderman");
        addCandidate("Optimus Prime");
        addHeroes("Batman");
        addHeroes("Wonder Woman");
        addHeroes("Aquaman");
        addHeroes("Cyborg");
        addHeroes("The Flash");
    }

    public ObservableList<String> getCandidates() {
        return candidates;
    }

    public ObservableList<String> getHeroes() {
        return heroes;
    }

    public void addCandidate(String candidate) {
        candidates.add(candidate);
        heroes.remove(candidate);
    }

    public void addHeroes(String hero) {
        heroes.add(hero);
        candidates.remove(hero);
    }

}
