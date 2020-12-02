package ch.bbw.pr.cluedo;

public class Waffe {

	private String bezeichnung;
	private double gewicht;
	private double laenge;
	private String material;
	private String toetungsart;
	
	public Waffe(String bezeichnung, double gewicht, double laenge, String material, String toetungsart) {
		
		this.bezeichnung = bezeichnung;
		this.gewicht = gewicht;
		this.laenge = laenge;
		this.material = material;
		this.toetungsart = toetungsart;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	public double getGewicht() {
		return gewicht;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public String getToetungsart() {
		return toetungsart;
	}
	
	public void toeten() {
		System.out.println("toeten()");
	}
}
