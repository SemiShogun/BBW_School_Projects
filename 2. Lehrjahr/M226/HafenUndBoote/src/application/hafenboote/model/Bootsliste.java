package application.hafenboote.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Bootsliste {
    private ObservableList<Boot> boot;

    public Bootsliste() {
        super();
        boot = FXCollections.<Boot>observableArrayList();
    }

    public ObservableList<Boot> getBoot() {
        return boot;
    }

    public void add(Boot boot) {
        this.boot.add(boot);
    }

    public void removeBoot(Boot selectedBoot) {
        boot.remove(selectedBoot);
    }

    public void printOutContents() {
        System.out.println("Liste aller Boote im Hafen:" +
                "\n       " +  boot.get(0)
                + "\n       " + boot.get(1)
                + "\n       " + boot.get(2));
    }
}
