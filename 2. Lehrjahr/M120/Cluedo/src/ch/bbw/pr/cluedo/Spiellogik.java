package ch.bbw.pr.cluedo;

/**
 * Spiellogik.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class Spiellogik {

	private int taeter;
	private int tatwaffe;
	private int tatort;
	
	public void initialisieren(Person[] personen, Waffe[] waffen, Raum[] raeume) {
		// Creates a puzzle
		taeter = (int)((Math.random()) * personen.length + 1);
		tatwaffe = (int)((Math.random()) * waffen.length + 1);
		tatort = (int)((Math.random() * raeume.length + 1));
	}
	
	public int spielen(int taeter, int tatwaffe, int tatort) {
		int richtig = 0;
		
		// If you have guessed correctly...
		if (this.taeter == taeter) {
			richtig++;
		}
		if (this.tatwaffe == tatwaffe) {
			richtig++;
		}
		if (this.tatort == tatort) {
			richtig++;
		}
		return richtig;
	} 
	
}
