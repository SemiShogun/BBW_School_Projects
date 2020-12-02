package ch.bbw.jl.sportclub;

import java.util.Observable;
import java.util.Observer;

/**
 * Der Sponsor
 * @author Jamie Lam
 * @version 03.07.2020
 */
abstract class Sponsoren implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String sponsor = (String) arg;
        System.out.println("Sponsor: " + sponsor);
    }
}
