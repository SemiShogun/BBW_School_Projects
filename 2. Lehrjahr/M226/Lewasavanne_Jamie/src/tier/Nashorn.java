package tier;

import tier.ordnung.Unpaarhufer;

import java.awt.*;

/**
 * Das Nashorn
 * @author Jamie Lam
 */
// line 11: protected -> public
public class Nashorn extends Unpaarhufer {
	// line 14: protected -> private
	private int hornlaenge;

	// line 17: protected -> public + added 2 new parameters
	public Nashorn(Color color, String name, int anzahlZehen, String schnauzenform, int hornlaenge) {
		// line 19: Changed parameter values for superclass
		super(color, name, anzahlZehen, schnauzenform);
		this.hornlaenge = hornlaenge;
	}

	// line 24: protected -> public
	public void print() {
		System.out.println("Nashorn hornlaenge= " + hornlaenge
	// line 27: getAnzahlZehen() should get its access with super.getAnzahlZehen()
				+ " Anzahl Zehen: " + super.getAnzahlZehen());
	}
}
