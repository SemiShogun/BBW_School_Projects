package ch.bbw.jl.erbengmbh.employees;

/**
 * Verkäufer der Erben Gmbh
 * 
 * @author Jamie Lam
 * @version 20.03.2020
 */
public class Sales extends Mitarbeiter {
	public double spesen;

	public Sales(String lastname, String firstname, double lohn, double spesen) {
		super(lastname, firstname, lohn);
		this.spesen = spesen;
	}

	@Override
	public double getLohn() {
		return super.getLohn() + spesen;
	}
	
	public void setLohn(double lohn, double spesen) {
		super.setLohn(lohn);
		this.spesen = spesen;
	}
}
