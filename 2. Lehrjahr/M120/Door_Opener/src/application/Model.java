package application;


import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/** Model.java
 *
 * @author Jamie Lam
 * @version 05.12.2019 */
public class Model {
    private ObservableList<String> protocols;
    private DoubleProperty[] sliderProperties;
    private DoubleProperty sliderProperty;
    private DoubleProperty sliderAttempts;

    private double attempts;
    private int[] secretCode;

    public Model() {
        super();

        protocols = FXCollections.observableArrayList();
        secretCode = randomize();
        final int START_POSITION = 2;
        sliderProperties = new DoubleProperty[] {
                new SimpleDoubleProperty(START_POSITION),
                new SimpleDoubleProperty(START_POSITION),
                new SimpleDoubleProperty(START_POSITION)
        };
        sliderProperty = new SimpleDoubleProperty(0);
        sliderAttempts = new SimpleDoubleProperty(0);
        isCodeCorrect();
    }

    public DoubleProperty[] getSliderProperties() {
        return sliderProperties;
    }

    public DoubleProperty getSliderProperty() {
        return sliderProperty;
    }

    public DoubleProperty getSliderAttempts() {
        return sliderAttempts;
    }

    public ObservableList<String> getProtocols() {
        return protocols;
    }

    public void addProtocols(String protocol) {
        protocols.add(protocol);
    }

    public boolean isCodeCorrect() {
        int count = 0;

        for (int i = 0; i < secretCode.length; i++) {
            if (sliderProperties[i].getValue().intValue() == secretCode[i]) {
                count++;
            }
        }

        // Update property
        double coefficient = (double) count / 3.0;
        sliderProperty.setValue(coefficient);

        return count == secretCode.length;
    }

    public boolean isAttempts() {
        attempts = attempts + 0.1;
        sliderAttempts.setValue(attempts);

        return attempts >= 0.9;
    }

    public int[] randomize() {
        int[] randomCode = new int[3];
        for(int i=0; i < randomCode.length; i++) {
            int randomInteger = (int)((Math.random()) * 4 + 1);
            randomCode[i] = randomInteger;
        }
        return randomCode;
    }
}