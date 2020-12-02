package tier;

import java.awt.Color;
/**
 * Die Giraffe
 * @author Jamie Lam
 */
// line 9: Changed default to public
public class Giraffe extends Saeugetier {
	// line 11: Changed Default to private
	private int halslaenge;

	// line 14: Constructors need public access modifier
	public Giraffe(Color beige, String name, int halslaenge) {
		// line 16: just use super();
		super(beige, name);
		this.halslaenge = halslaenge;
	}

	// line 21: this needs to be public + @override
	@Override
	public String getName() {
		// line 24: changed getName() to super.getName() because of infinity recursion
		return "Giraffe " + super.getName();
	}

	// line 28: why is this Default, it should be public + @Override
	@Override
	public void print() {
		System.out.println("Giraffe halslaenge= " + halslaenge);
	}
}
