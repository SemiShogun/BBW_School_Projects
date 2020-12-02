package tier;

import java.awt.Color;

/**
 * Klasse der Saeugetiere
 * @author Jamie Lam
 */
public class Saeugetier {
	private Color fellFarbe;
	private String name;

	protected Saeugetier(Color fellFarbe, String name) {
		super();
		this.fellFarbe = fellFarbe;
		this.name = name;
	}

	// Deleted @Override, @Override should be used if it is an extended class
	public String getName() {
		return name;
	}

	// Deleted @Override because it is unnecessary
	public void print()
	{
		System.out.println("Saeugetier: fellFarbe= " 
				+ fellFarbe + ", name= " + name);
	}
}
