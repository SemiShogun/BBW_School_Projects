package ch.bbw.pr.cluedo;

public class Raum {

	private String bezeichnung;
	private double hoehe;
	private double laenge;
	private double breite;
	private int anzahlFenster;
	private int anzahlTueren;
	private String bodenbelag;
	
	public Raum(String bezeichnung, double hoehe, double laenge, double breite, int anzahlFenster, int anzahlTueren, String bodenbelag) {
		
		this.bezeichnung = bezeichnung;
		this.hoehe = hoehe;
		this.laenge = laenge;
		this.breite = breite;
		this.anzahlFenster = anzahlFenster;
		this.anzahlTueren = anzahlTueren;
		this.bodenbelag = bodenbelag;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public double getBreite() {
		return breite;
	}
	
	public double getHoehe() {
		return hoehe;
	}
	
	public int getAnzahlFenster() {
		return anzahlFenster;
	}
	
	public int getAnzahlTueren() {
		return anzahlTueren;
	}
	
	public String getBodenbelag() {
		return bodenbelag;
	}
	
}
