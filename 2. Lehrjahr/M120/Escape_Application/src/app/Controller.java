package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/** Controller.java
 *
 * @author Jamie Lam
 * @version 13.12.2019
 */
public class Controller {

    private Model myModel;

    @FXML
    private Button doorPuzzle;
    @FXML
    private Button wordPuzzle;
    @FXML
    private Button morsePuzzle;
    @FXML
    private Button crosswordPuzzle;
    @FXML
    private Button colorsPuzzle;
    @FXML
    private Button picturePuzzle;

    public Controller() {
        super();
    }

    public void setModel(Model myModel) {
        this.myModel = myModel;

        Main main = new Main();

        doorPuzzle.setOnAction(e -> {
            try {
                main.loadFxml("dooropener/View.fxml");
            } catch (Exception err) {
                err.printStackTrace();
            }
        });
        wordPuzzle.setOnAction(e -> {
            try {

            } catch (Exception err) {
                err.printStackTrace();
            }
        });
    }
}
