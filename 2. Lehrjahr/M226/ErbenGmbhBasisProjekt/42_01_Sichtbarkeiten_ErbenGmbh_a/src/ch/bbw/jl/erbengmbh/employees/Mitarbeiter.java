package ch.bbw.jl.erbengmbh.employees;

/**
 * Mitarbeiter der Erben Gmbh
 * 
 * @author Jamie Lam
 * @version 20.03.2020
 */
public class Mitarbeiter {

	/**
	 * 	<private>
	 * 	Wenn alle Sichtbarkeiten in diesen Klassen auf private gesetzt werden, wird es ein Kompiler Fehler geben.
	 * 	"private" macht die Werte von dieses Klasse nicht mehr Sichtbar.
	 *
	 * 	Damit Sie private Werte herausholen kann, muss man super().getLohn() benutzen.
	 */

	/**
	 * 	<default>
	 * 	Es wird ein Kompiler Fehler geben bei der Consultant.java Klasse, da Consultant nicht under den gleichen
	 * 	Paket sich befindet.
	 *
	 * 	Damit Es gefixt werde kann, sollte ich super.setLohn() und super.getLohn() benutze.
	 */

	/**
	 * 	<private>Mitarbeiter, <protected>Mitarbeiter
	 *
	 * 	Die Applikationsklasse greift nicht mehr auf diesen Klasse, da die Methoden "protected" sind anstatt "public"...
	 *	Ich weiss nicht, wie man das lösen kann. Warum sollten Methoden Protected sein in diesem Fall?
	 */

	private String lastname;
	private String firstname;
	private double lohn;

	public Mitarbeiter(String lastname, String firstname, double lohn) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.lohn = lohn;
	}

	// Fehler bei @Override, da keine Methode getLohn in der Basisklasse
	public double getLohn() {
		return lohn;
	}
	
	public void setLohn(double lohn) {
		this.lohn = lohn;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

}
