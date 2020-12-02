package ch.bbw.jl.consultgmbh;

import ch.bbw.jl.erbengmbh.employees.Mitarbeiter;

/**
 * ConsultantApplication
 * - Externer Mitarbeiter fuer andere Firmen
 * 
 * @author Jamie Lam
 * @version 20.03.2020
 */
public class Consultant extends Mitarbeiter {
	private double charge;

	public Consultant(String lastname, String firstname, double lohn, double charge) {
		super(lastname, firstname, lohn);
		this.charge = charge;
	}

	@Override
	public double getLohn() {
		return super.getLohn() + charge;
	}

	public void setLohn(double lohn, double charge) {
		super.setLohn(lohn);
		this.charge = charge;
	}
}
