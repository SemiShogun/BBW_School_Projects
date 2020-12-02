package Heropicker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * Controller.java
 *
 * @author Jamie Lam
 * @version 29.11.2019
 */
public class Controller {

    private Model myModel;

    @FXML
    private ListView<String> candidates;
    @FXML
    private ListView<String> heroes;
    @FXML
    private Button left;
    @FXML
    private Button right;

    public Controller() {
        super();
    }

    public void setModel(Model myModel) {
        this.myModel = myModel;

        // Bindings
        candidates.setItems(myModel.getCandidates());
        heroes.setItems(myModel.getHeroes());
    }

    @FXML
    private void setHeroes() {
        right.setOnAction(e -> {
            try {
                String selectedCandidate = candidates.getSelectionModel().getSelectedItem();
                if (selectedCandidate != null) {
                    myModel.addHeroes(selectedCandidate);
                } else {
                    System.out.println("There aren't any candidates left!");
                }
            } catch (Exception error) {
                System.out.println(error);
            }
        });
    }

    @FXML
    private void setCandidates() {
        left.setOnAction(e -> {
            try {
                String selectedHero = heroes.getSelectionModel().getSelectedItem();
                if (selectedHero != null) {
                    myModel.addCandidate(selectedHero);
                } else {
                    System.out.println("There aren't any heroes left!");
                }
            } catch (Exception error) {
                System.out.println(error);
            }
        });
    }

}
