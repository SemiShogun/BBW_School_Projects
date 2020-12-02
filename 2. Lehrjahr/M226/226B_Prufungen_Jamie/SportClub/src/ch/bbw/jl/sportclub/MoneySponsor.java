package ch.bbw.jl.sportclub;

import java.util.Observable;
import java.util.Observer;

public class MoneySponsor extends Sponsoren {

    @Override
    public void update(Observable o, Object arg) {
        String moneysponsor = (String) arg;
        System.out.println("Sponsor: " + moneysponsor);
    }
}
