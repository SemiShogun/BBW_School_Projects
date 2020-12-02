package GradeCalculator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Model.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */
public class Model {
    private ObservableList<String> modules;

    public Model() {
        this.modules = FXCollections.observableArrayList();
    }

    public ObservableList<String> modulesProperty() {
        return modules;
    }
    public void add(String modul, double note) {
        String text = modul + " : " + note;
        modules.add(text);
    }
}
