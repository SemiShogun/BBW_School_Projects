package ch.bbw.jl.sportclub;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Der Sponsor
 * @author Jamie Lam
 * @version 03.07.2020
 */
abstract class Sponsoren implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String sponsor = (String) evt.getNewValue();
        System.out.println("Sponsor: " + sponsor);
    }
}
