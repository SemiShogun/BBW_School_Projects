package ch.bbw.pr.cluedo;

public class Person {

	private String name;
	private String anrede;
	private int alter;
	private String merkmal;
	
	public Person(String name, String anrede, int alter, String merkmal) {
		
		this.name = name;
		this.anrede = anrede;
		this.alter = alter;
		this.merkmal = merkmal;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAnrede() {
		return anrede;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public String getMerkmal() {
		return merkmal;
	}
	
	public void sprichSpruch() {
		System.out.println("sprichSpruch()");
	}
	
	public void laufen() {
		System.out.println("laufen()");
	}
	
}
