package ch.bbw.jl.sportclub;

import java.util.*;

/**
 * Der Erzaehler
 * @author Jamie Lam
 * @version 03.07.2020
 */
public class SportClub extends Observable {

	public void sendTurnfestMessage() {
		String message = "20.6.2019: Erfolgreich am Turnfest!";
		setChanged();
		notifyObservers(message);
	}

	public void sendVolleyballMessage() {
		String message = "22.6.2019: Sieg beim Volleyball!";
		setChanged();
		notifyObservers(message);
	}

	public void sendSommerfestMessage() {
		String message = "10.7.2019: Einladung zum Sommerfest";
		setChanged();
		notifyObservers(message);
	}

}
