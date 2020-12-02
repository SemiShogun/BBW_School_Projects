package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    private Model myModel;

    @FXML
    private ListView<String> actors;
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfSurname;
    @FXML
    private ImageView iv;

    public Controller() {
        super();
    }

    public void setModel(Model myModel) {
        this.myModel = myModel;

        // Bindings
        actors.setItems(myModel.getActors());
    }

    public void addImage() {
        Image image = new Image("application/best_actor.jpg");
        iv.setImage(image);
    }

    @FXML
    private void actorAdd() {
        try {
            String name = tfName.getText();
            String surname = tfSurname.getText();
            String actor = name + " " + surname;
            myModel.addActors(actor);
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    @FXML
    private void actorDelete() {
        try {
            String selectedActor = actors.getSelectionModel().getSelectedItem();
            if (selectedActor != null) {
                myModel.removeActors(selectedActor);
            } else {
                System.out.println("There aren't any actors left!");
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

}
