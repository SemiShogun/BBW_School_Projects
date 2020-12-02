package ch.bbw.pr.schule.personen;
/**
 * @author Laura Luethi
 */
public class Lehrperson extends Person {
	public Lehrperson(String name, String vorname) {
		super(name, vorname);
	}
	
	@Override
	public String print() {
		return " ist Lehrperson";	
	}

	public String korrigiertPruefungen(){
		return " korrigiert Pruefungen";
	}
}
