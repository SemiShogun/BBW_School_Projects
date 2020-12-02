package ch.bbw.pr.cluedo;

/**
 * Model.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class Model {
	
	private Person[] personen;
	private Waffe[] waffen;
	private Raum[] raeume;

	public Person[] getPersonen() {
		return personen;
	}
	public void setPersonen(Person[] personen) {
		this.personen = personen;
	}
	public Waffe[] getWaffen() {
		return waffen;
	}
	public void setWaffen(Waffe[] waffen) {
		this.waffen = waffen;
	}
	public Raum[] getRaeume() {
		return raeume;
	}
	public void setRaeume(Raum[] raeume) {
		this.raeume = raeume;
	}

	public String toStringEverything() {
		String temp = "";

		for(int i = 0; i < personen.length; i++) {
			int j = i + 1;
			temp =
					temp + j
							+ " " + personen[i].getAnrede()
							+ " " + personen[i].getName()
							+ ", " + personen[i].getMerkmal()
							+ ", Alter: " + personen[i].getAlter()
							+ "\n";
		}
		temp = temp + "\n\n";

		for(int i = 0; i < waffen.length; i++) {
			int j = i + 1;
			temp =
					temp + j
							+ " " + waffen[i].getBezeichnung()
							+ " " + waffen[i].getGewicht()
							+ " " + waffen[i].getLaenge()
							+ " " + waffen[i].getMaterial()
							+ " " + waffen[i].getToetungsart()
							+ "\n";
		}
		temp = temp + "\n\n";

		for(int i = 0; i < raeume.length; i++) {
			int j = i + 1;
			temp =
					temp + j
							+ " " + raeume[i].getBezeichnung()
							+ " " + raeume[i].getAnzahlFenster()
							+ " " + raeume[i].getAnzahlTueren()
							+ " " + raeume[i].getBodenbelag()
							+ " " + raeume[i].getBreite()
							+ " " + raeume[i].getHoehe()
							+ " " + raeume[i].getLaenge()
							+ "\n";
		}
		temp = temp + "\n\n";

		return temp;
	}

}
