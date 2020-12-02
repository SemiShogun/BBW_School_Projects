package ch.bbw.pr.schule.personen;
/**
 * @author Laura Luethi
 */
public class Schulabwart extends Person {

	public Schulabwart(String name, String vorname) {
		super(name, vorname);
	}

	@Override
	public String print() {
		return " ist Schulabwart";
	}

	public String repariertBeleuchtung() {
		return "repariert die Beleuchtung";
	}
}
