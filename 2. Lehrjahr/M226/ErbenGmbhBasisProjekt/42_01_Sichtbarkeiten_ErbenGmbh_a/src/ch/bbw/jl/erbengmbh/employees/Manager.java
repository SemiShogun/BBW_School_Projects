package ch.bbw.jl.erbengmbh.employees;

/**
 * Manager der Erben Gmbh
 * 
 * @author Jamie Lam
 * @version 20.03.2020
 */
public class Manager extends Mitarbeiter {
	private double bonus;

	public Manager(String lastname, String firstname, double lohn, double bonus) {
		super(lastname, firstname, lohn);
		this.bonus = bonus;
	}

	@Override
	public double getLohn() {
		return super.getLohn() + bonus;
	}
	
	public void setLohn(double lohn, double bonus) {
		super.setLohn(lohn);
		this.bonus = bonus;
	}
}
