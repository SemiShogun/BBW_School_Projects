package ch.bbw.jl.sportclub;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;

/**
 * Der Erzaehler
 * @author Jamie Lam
 * @version 03.07.2020
 */
public class SportClub {

	private ArrayList<PropertyChangeListener> properties = new ArrayList<PropertyChangeListener>();

	public void addProperty(PropertyChangeListener property) {
		properties.add(property);
	}

	public void sendTurnfestMessage() {
		String message = "20.6.2019: Erfolgreich am Turnfest!";
		PropertyChangeEvent event = new PropertyChangeEvent(properties, "turn", "placeholder", message);
		for (PropertyChangeListener change: properties) {
			change.propertyChange(event);
		}
	}

	public void sendVolleyballMessage() {
		String message = "22.6.2019: Sieg beim Volleyball!";
		PropertyChangeEvent event = new PropertyChangeEvent(properties, "volley", "placeholder", message);
		for (PropertyChangeListener change: properties) {
			change.propertyChange(event);
		}
	}

	public void sendSommerfestMessage() {
		String message = "10.7.2019: Einladung zum Sommerfest";
		PropertyChangeEvent event = new PropertyChangeEvent(properties, "sommer", "placeholder", message);
		for (PropertyChangeListener change: properties) {
			change.propertyChange(event);
		}
	}

}
