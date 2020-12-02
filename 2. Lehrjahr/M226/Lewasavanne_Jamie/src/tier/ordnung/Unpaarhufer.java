package tier.ordnung;

import tier.Saeugetier;

import java.awt.*;

/**
 * Unpaarhufer ist eine Tier Ordnung
 * @author Jamie Lam
 */
// line 8: Unpaarhufer extends to saeugetier
public class Unpaarhufer extends Saeugetier {
	private int anzahlZehen;
	private String schnauzenform;

	// line 15: Added 2 parameters for Saeugetier superclass
	public Unpaarhufer(Color color, String name, int anzahlZehen, String schnauzenform) {
		super(color, name);
		this.anzahlZehen = anzahlZehen;
		this.schnauzenform = schnauzenform;
	}

	protected int getAnzahlZehen() {
		return anzahlZehen;
	}

	protected String getSchnauzenform() {
		return schnauzenform;
	}
}
