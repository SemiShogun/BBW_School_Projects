package ch.bbw.pr.schule.personen;
/**
 * @author Laura Luethi
 */
public abstract class Person {
	private String name;
	private String vorname;

	public Person(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}

	public String print() {return null;};

	public String doWork() {
		return null;
	}

	@Override
	public String toString() {
		String res = vorname + " " + name;
		return res;
	}
}
