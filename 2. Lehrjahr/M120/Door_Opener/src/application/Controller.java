package application;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** Controller.java
 *
 * @author Jamie Lam
 * @version 05.12.2019 */
public class Controller {

    private Model myModel;

    @FXML
    private Slider sliderOne;
    @FXML
    private Slider sliderTwo;
    @FXML
    private Slider sliderThree;
    @FXML
    private ProgressBar pbOne;
    @FXML
    private ProgressBar pbTwo;
    @FXML
    private ImageView image;
    @FXML
    private ListView<String> protocols;

    public Controller() {
        super();
    }

    public void setModel(Model myModel) {
        this.myModel = myModel;

        protocols.setItems(myModel.getProtocols());

        // Bindings
        sliderOne.valueProperty().bindBidirectional(myModel.getSliderProperties()[0]);
        sliderTwo.valueProperty().bindBidirectional(myModel.getSliderProperties()[1]);
        sliderThree.valueProperty().bindBidirectional(myModel.getSliderProperties()[2]);
        pbOne.progressProperty().bind(myModel.getSliderProperty());
        pbTwo.progressProperty().bind(myModel.getSliderAttempts());

        sliderOne.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("SliderOne Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            myModel.addProtocols("SliderOne Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            checkCode();
            attemptCheck();
        });

        sliderTwo.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("SliderTwo Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            myModel.addProtocols("SliderTwo Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            checkCode();
            attemptCheck();
        });
        sliderThree.valueProperty().addListener((observable, oldValue, newValue) -> {
            /**
             if (newValue) {
             oldSliderValue = sliderThree.getValue();
             } else {
             double newSliderValue = sliderThree.getValue();
             if (oldSliderValue != newSliderValue) {
             System.out.println("Slider Value Changed {newValue: " + newSliderValue + ")");
             myModel.addProtocols("SliderThree Value Changed {oldValue: " + oldSliderValue + " newValue: " + newSliderValue + ")");
             }
             }
             */
            System.out.println("SliderThree Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            myModel.addProtocols("SliderThree Value Changed {oldValue: " + oldValue.intValue() + " newValue: " +
                    newValue.intValue() + ")");
            checkCode();
            attemptCheck();
        });
    }

    private void checkCode() {
        if (myModel.isCodeCorrect()) {
            myModel.addProtocols("Door is opened.");
            System.out.println("Door is opened.");
            sliderOne.setDisable(true);
            sliderTwo.setDisable(true);
            sliderThree.setDisable(true);
            image.setImage(new Image(getClass().getResourceAsStream("torOffen.jpg")));
        }
    }

    private void attemptCheck() {
        if (myModel.isAttempts()) {
            myModel.addProtocols("Door is blocked.");
            System.out.println("Door is blocked.");
            sliderOne.setDisable(true);
            sliderTwo.setDisable(true);
            sliderThree.setDisable(true);
            image.setImage(new Image(getClass().getResourceAsStream("torBlockiert.jpg")));
        }
    }

}