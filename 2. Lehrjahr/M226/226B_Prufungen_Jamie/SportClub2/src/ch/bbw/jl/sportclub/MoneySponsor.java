package ch.bbw.jl.sportclub;

import java.beans.PropertyChangeEvent;
import java.util.Observable;
import java.util.Observer;

public class MoneySponsor extends Sponsoren {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String moneysponsor = (String) evt.getNewValue();
        System.out.println("Sponsor: " + moneysponsor);
    }
}
