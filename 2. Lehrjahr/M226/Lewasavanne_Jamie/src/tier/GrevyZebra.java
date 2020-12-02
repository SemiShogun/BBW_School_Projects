package tier;

import java.awt.Color;

/**
 * Ein GrevyZebra
 * @author Jamie Lam
 */
// line 10: private -> public
public class GrevyZebra extends Saeugetier {
	private int anzahlStreifen;

	// line 14: privaet typo, also it should be public
	public GrevyZebra(Color fellFarbe, String name, int anzahlStreifen) {
		// line 16: changed to super()
		super(fellFarbe, name);
		this.anzahlStreifen = anzahlStreifen;
	}
	
	@Override
	// line 23: private -> public + super.getName()
	public String getName() {
		return "GrevyZebra " + super.getName();
	}
	
	@Override
	// line 29: private -> public
	public void print() {
		System.out.println("GrevyZebra anzahlStreifen= " + anzahlStreifen);
	}
}
