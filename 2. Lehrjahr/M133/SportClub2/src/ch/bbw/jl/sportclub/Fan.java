package ch.bbw.jl.sportclub;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Der Fan
 * @author Jamie Lam
 * @version 03.07.2020
 */
public final class Fan implements PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String news = (String) evt.getNewValue();
		System.out.println("Fan: " + news);
	}
}
