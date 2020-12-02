package ch.bbw.jl.sportclub;

import java.util.Observable;
import java.util.Observer;

/**
 * Der Fan
 * @author Jamie Lam
 * @version 03.07.2020
 */
public class Fan implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String message = (String) arg;
		System.out.println("Fan: " + message);
	}
}
