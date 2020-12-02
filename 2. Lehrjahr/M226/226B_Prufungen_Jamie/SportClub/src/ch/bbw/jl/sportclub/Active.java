package ch.bbw.jl.sportclub;

import java.util.Observable;
import java.util.Observer;

/**
 * Der Aktive
 * @author Jamie Lam
 * @version 03.07.2020
 */
public class Active implements Observer {

	@Override
	public void update(Observable o, Object arg) {
 		String news = (String) arg;
		System.out.println("Active: " + news.toString());
	}
}
